package snakeGUI;

import snakeLogic.SnakeLogic;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static snakeGUI.MainFrame.frame;
import static snakeGUI.SnakePanel.timer;

/**
 *
 * @author Kuba
 */
public class MenuPanel extends javax.swing.JPanel implements ActionListener {

    /**
     * Creates new form MenuPanel
     */
    public MenuPanel() {
        initComponents();
        setPanelsOpaque();
        tools = new GraphicsTools();
    }

    static int levelMP = 1;
    static int timerDelay = 350;
    private GraphicsTools tools;
    private Color linesColor = Color.white;
    static Color snakeColorMP = Color.black;

    private void setPanelsOpaque() {

        GameNamePanel.setOpaque(false);
        ButtonsParentPanel.setOpaque(false);
        ButtonsPanel.setOpaque(false);
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GameNamePanel = new javax.swing.JPanel();
        GameNameLabel = new javax.swing.JLabel();
        ButtonsParentPanel = new javax.swing.JPanel();
        ButtonsPanel = new javax.swing.JPanel();
        StartButton = new javax.swing.JButton();
        HighScoresButton = new javax.swing.JButton();
        SettingsButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(600, 700));

        GameNameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SnakeLogo.png"))); // NOI18N

        javax.swing.GroupLayout GameNamePanelLayout = new javax.swing.GroupLayout(GameNamePanel);
        GameNamePanel.setLayout(GameNamePanelLayout);
        GameNamePanelLayout.setHorizontalGroup(
            GameNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GameNamePanelLayout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(GameNameLabel)
                .addGap(100, 100, 100))
        );
        GameNamePanelLayout.setVerticalGroup(
            GameNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GameNamePanelLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(GameNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ButtonsPanel.setLayout(new java.awt.GridLayout(4, 1, 0, 50));

        StartButton.setBackground(new java.awt.Color(0, 0, 0));
        StartButton.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        StartButton.setForeground(new java.awt.Color(255, 255, 255));
        StartButton.setText("Start");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });
        ButtonsPanel.add(StartButton);

        HighScoresButton.setBackground(new java.awt.Color(0, 0, 0));
        HighScoresButton.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        HighScoresButton.setForeground(new java.awt.Color(255, 255, 255));
        HighScoresButton.setText("Wyniki");
        HighScoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HighScoresButtonActionPerformed(evt);
            }
        });
        ButtonsPanel.add(HighScoresButton);

        SettingsButton.setBackground(new java.awt.Color(0, 0, 0));
        SettingsButton.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        SettingsButton.setForeground(new java.awt.Color(255, 255, 255));
        SettingsButton.setText("Ustawienia");
        SettingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsButtonActionPerformed(evt);
            }
        });
        ButtonsPanel.add(SettingsButton);

        ExitButton.setBackground(new java.awt.Color(0, 0, 0));
        ExitButton.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setText("Wyjście");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        ButtonsPanel.add(ExitButton);

        javax.swing.GroupLayout ButtonsParentPanelLayout = new javax.swing.GroupLayout(ButtonsParentPanel);
        ButtonsParentPanel.setLayout(ButtonsParentPanelLayout);
        ButtonsParentPanelLayout.setHorizontalGroup(
            ButtonsParentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsParentPanelLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(ButtonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ButtonsParentPanelLayout.setVerticalGroup(
            ButtonsParentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsParentPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(ButtonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ButtonsParentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(GameNamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(GameNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonsParentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        SnakeLogic logic = new SnakeLogic();
        getTopLevelAncestor().requestFocus();
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

        SnakePanel paint = new SnakePanel();
        timer.setDelay(timerDelay);
        logic.setLevel(levelMP);
        paint.setSnakeColor(snakeColorMP);

        frame.getContentPane().removeAll();

        frame.add(paint);
        frame.validate();
        frame.pack();
        frame.addKeyListener(logic);

    }//GEN-LAST:event_StartButtonActionPerformed

    private void HighScoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HighScoresButtonActionPerformed
        HighScoresPanel highScores = new HighScoresPanel();
        frame.getContentPane().removeAll();
        frame.add(highScores);
        frame.validate();
        frame.pack();
    }//GEN-LAST:event_HighScoresButtonActionPerformed

    private void SettingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsButtonActionPerformed
        SettingsPanel settings = new SettingsPanel();
        frame.getContentPane().removeAll();
        frame.add(settings);
        frame.validate();
        frame.pack();

    }//GEN-LAST:event_SettingsButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonsPanel;
    private javax.swing.JPanel ButtonsParentPanel;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel GameNameLabel;
    private javax.swing.JPanel GameNamePanel;
    private javax.swing.JButton HighScoresButton;
    private javax.swing.JButton SettingsButton;
    private javax.swing.JButton StartButton;
    // End of variables declaration//GEN-END:variables

}
