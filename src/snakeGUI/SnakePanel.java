package snakeGUI;

import snakeLogic.SnakeLogic;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import static snakeGUI.MainFrame.frame;

/**
 *
 * @author Kuba
 */
public class SnakePanel extends javax.swing.JPanel implements ActionListener {

    /**
     * Creates new form SnakePanel2
     */
    public SnakePanel() {
        initComponents();
        tools = new GraphicsTools();
        logic = new SnakeLogic();
        logic.initSnake();
        timer = new Timer(350, this);
        timer.start();
    }

    static Timer timer;
    private SnakeLogic logic;
    private GraphicsTools tools;
    private final int SIZE = 50;
    private Color snakeColor = Color.black;
    private Color backgroundColor = Color.white;
    private Color fruitColor = Color.red;
    private Color linesColor = Color.black;

    public Color getSnakeColor() {
        return snakeColor;
    }

    public void setSnakeColor(Color snakeColor) {
        this.snakeColor = snakeColor;
    }

    private void drawFruit(Graphics2D g2d) {
        int r = logic.getFruitPosition().getR();
        int c = logic.getFruitPosition().getC();
        g2d.setColor(fruitColor);
        g2d.fillRect(c * SIZE + 2, r * SIZE + 2, SIZE - 3, SIZE - 3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        logic.updatePosition();
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        repaintBackground(g2d);

        drawSnake(g2d);
        tools.drawLines(g2d, linesColor);
        if (logic.isAte()) {
            logic.generateFruit();
            logic.setAte(false);
        }

        drawFruit(g2d);

        if (logic.isGameOver()) {
            gameOver(g);
        }

    }

    private void gameOver(Graphics g) {
        GameOverPanel gameOverPanel = new GameOverPanel();

        gameOverPanel.setPoint(logic.getPoints());

        frame.getContentPane().removeAll();
        frame.add(gameOverPanel);
        frame.validate();
        frame.pack();
        gameOverPanel.getLabelPoints().setText(logic.getPoints() + " PKT");

        logic.getSnake().length = 0;
        logic.getSnake().getPosition().clear();
        logic.initSnake();
        logic.setGameOver(false);
        timer.stop();
    }

    private void repaintBackground(Graphics2D g2d) {
        g2d.setColor(backgroundColor);
        g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
    }

    private void drawSnake(Graphics2D g2d) {
        int r;
        int c;
        g2d.setColor(snakeColor);
        for (int i = 0; i < logic.getSnake().length; i++) {
            r = logic.getSnake().getPosition().get(i).getR();
            c = logic.getSnake().getPosition().get(i).getC();
            g2d.fillRect(c * SIZE + 2, r * SIZE + 2, SIZE - 3, SIZE - 3);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
