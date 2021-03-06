package snakeGUI;

import snakeLogic.SnakeLogic;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static snakeGUI.MainFrame.frame;
import static snakeGUI.MenuPanel.levelMP;
import static snakeGUI.MenuPanel.snakeColorMP;
import static snakeGUI.MenuPanel.timerDelay;
import static snakeGUI.SnakePanel.timer;

/**
 *
 * @author Kuba
 */
public class GameOverPanel extends javax.swing.JPanel implements ActionListener {

    /**
     * Creates new form GameOverPanel
     */
    public GameOverPanel() {
        initComponents();
        setPanelsOpaque();
        tools = new GraphicsTools();
        logic = new SnakeLogic();
        point = new Integer(0);
    }

    private Color linesColor = Color.white;
    private SnakeLogic logic;
    private Integer point;
    private GraphicsTools tools;

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public void writeToFile(String name, int points) throws IOException {
        FileWriter fw = null;
        File file = new File("HighScores.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            fw = new FileWriter("HighScores.txt", true);
            fw.write(name + " " + points + "\n");
        } finally {
            if (fw != null) {
                fw.close();
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
        tools.drawLines(g2d, linesColor);
    }

    public JLabel getLabelPoints() {
        return LabelPoints;
    }

    private void setPanelsOpaque() {

        ButtonPanel.setOpaque(false);
        ButtonContainPanel.setOpaque(false);
        TitlePanel.setOpaque(false);
        ContainPanel.setOpaque(false);
        TextContainPanel.setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitlePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ContainPanel = new javax.swing.JPanel();
        TextContainPanel = new javax.swing.JPanel();
        TextLabel = new javax.swing.JLabel();
        LabelPoints = new javax.swing.JLabel();
        TextLabel2 = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        ButtonContainPanel = new javax.swing.JPanel();
        ButtonPanel = new javax.swing.JPanel();
        RepeatButton = new javax.swing.JButton();
        MenuButton = new javax.swing.JButton();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/GameOver.png"))); // NOI18N

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitlePanelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        TextContainPanel.setLayout(new java.awt.GridLayout(4, 0, 0, 50));

        TextLabel.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        TextLabel.setForeground(new java.awt.Color(255, 255, 255));
        TextLabel.setText("Twój wynik to :");
        TextContainPanel.add(TextLabel);

        LabelPoints.setBackground(new java.awt.Color(0, 0, 0));
        LabelPoints.setFont(new java.awt.Font("Arial Black", 1, 30)); // NOI18N
        LabelPoints.setForeground(new java.awt.Color(255, 255, 255));
        TextContainPanel.add(LabelPoints);

        TextLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        TextLabel2.setForeground(new java.awt.Color(255, 255, 255));
        TextLabel2.setText("Podaj imię :");
        TextContainPanel.add(TextLabel2);

        NameTextField.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        NameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextFieldActionPerformed(evt);
            }
        });
        TextContainPanel.add(NameTextField);

        javax.swing.GroupLayout ContainPanelLayout = new javax.swing.GroupLayout(ContainPanel);
        ContainPanel.setLayout(ContainPanelLayout);
        ContainPanelLayout.setHorizontalGroup(
            ContainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainPanelLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(TextContainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ContainPanelLayout.setVerticalGroup(
            ContainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(TextContainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        ButtonPanel.setLayout(new java.awt.GridLayout(1, 0, 200, 0));

        RepeatButton.setBackground(new java.awt.Color(0, 0, 0));
        RepeatButton.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        RepeatButton.setForeground(new java.awt.Color(255, 255, 255));
        RepeatButton.setText("Powtórz");
        RepeatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepeatButtonActionPerformed(evt);
            }
        });
        ButtonPanel.add(RepeatButton);

        MenuButton.setBackground(new java.awt.Color(0, 0, 0));
        MenuButton.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        MenuButton.setForeground(new java.awt.Color(255, 255, 255));
        MenuButton.setText("Menu");
        MenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuButtonActionPerformed(evt);
            }
        });
        ButtonPanel.add(MenuButton);

        javax.swing.GroupLayout ButtonContainPanelLayout = new javax.swing.GroupLayout(ButtonContainPanel);
        ButtonContainPanel.setLayout(ButtonContainPanelLayout);
        ButtonContainPanelLayout.setHorizontalGroup(
            ButtonContainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonContainPanelLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        ButtonContainPanelLayout.setVerticalGroup(
            ButtonContainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonContainPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ContainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ButtonContainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonContainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextFieldActionPerformed
        // 
    }//GEN-LAST:event_NameTextFieldActionPerformed

    private void MenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuButtonActionPerformed
        JPanel menu = new MenuPanel();
        frame.getContentPane().removeAll();
        frame.add(menu);
        frame.validate();
        frame.pack();
        String name = NameTextField.getText();
        if (name.equals("")) {
            name = "Anonim";
        }
        try {
            writeToFile(name, point);
        } catch (IOException ex) {
            System.out.println(ex + "Nieudany odczyt pliku");
        }

        logic.setPoints(0);
        switch (levelMP) {
            case 1:
                timerDelay = 350;
                break;
            case 2:
                timerDelay = 225;
                break;
            case 3:
                timerDelay = 100;
                break;
        }
        timer.setDelay(timerDelay);
        logic.setLevel(levelMP);
        repaint();
    }//GEN-LAST:event_MenuButtonActionPerformed

    private void RepeatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepeatButtonActionPerformed

        getTopLevelAncestor().requestFocus();

        SnakePanel paint = new SnakePanel();
        frame.getContentPane().removeAll();
        paint.setSnakeColor(snakeColorMP);
        frame.add(paint);
        frame.validate();
        frame.pack();
        frame.addKeyListener(logic);
        String name = NameTextField.getText();
        if (name.equals("")) {
            name = "Anonim";
        }
        try {
            writeToFile(name, point);
        } catch (IOException ex) {
            System.out.println(ex + "Nieudany odczyt pliku");
        }
        logic.setPoints(0);
        switch (levelMP) {
            case 1:
                timerDelay = 350;
                break;
            case 2:
                timerDelay = 225;
                break;
            case 3:
                timerDelay = 100;
                break;
        }
        timer.setDelay(timerDelay);
        logic.setLevel(levelMP);
    }//GEN-LAST:event_RepeatButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonContainPanel;
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JPanel ContainPanel;
    private javax.swing.JLabel LabelPoints;
    private javax.swing.JButton MenuButton;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JButton RepeatButton;
    private javax.swing.JPanel TextContainPanel;
    private javax.swing.JLabel TextLabel;
    private javax.swing.JLabel TextLabel2;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
