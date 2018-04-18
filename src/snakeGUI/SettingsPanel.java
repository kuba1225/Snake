package snakeGUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static snakeGUI.MainFrame.frame;
import static snakeGUI.MenuPanel.levelMP;
import static snakeGUI.MenuPanel.snakeColorMP;

/**
 *
 * @author Kuba
 */
public class SettingsPanel extends javax.swing.JPanel implements ActionListener {

    /**
     * Creates new form SettingsPanel
     */
    public SettingsPanel() {
        initComponents();
        setPanelsOpaque();
        tools = new GraphicsTools();
    }

    private void setPanelsOpaque() {
        TitlePanel.setOpaque(false);
        ContainPanel.setOpaque(false);
        ButtonPanel.setOpaque(false);
        ButtonContain.setOpaque(false);
        SnakeColorTitlePanel.setOpaque(false);
        SnakeColorPanel.setOpaque(false);
        LevelPanel.setOpaque(false);
        LevelTitlePanel.setOpaque(false);
        ColorButtonPanel.setOpaque(false);
        ButtonLevelPanel.setOpaque(false);
    }

    private int level = 1;
    private int timerDelay = 350;
    private GraphicsTools tools;
    private Color linesColor = Color.white;
    private Color snakeColor = Color.black;

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

    public int getTimerDelay() {
        return timerDelay;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitlePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ContainPanel = new javax.swing.JPanel();
        LevelTitlePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        LevelPanel = new javax.swing.JPanel();
        ButtonLevelPanel = new javax.swing.JPanel();
        Level1Button = new javax.swing.JButton();
        Level2Button = new javax.swing.JButton();
        Level3Button = new javax.swing.JButton();
        SnakeColorTitlePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        SnakeColorPanel = new javax.swing.JPanel();
        ColorButtonPanel = new javax.swing.JPanel();
        BlackColorButton = new javax.swing.JButton();
        GreenColorButton = new javax.swing.JButton();
        RedColorButton = new javax.swing.JButton();
        YellowColorButton = new javax.swing.JButton();
        BlueColorButton = new javax.swing.JButton();
        ButtonPanel = new javax.swing.JPanel();
        ButtonContain = new javax.swing.JPanel();
        SaveButton = new javax.swing.JButton();
        MenuButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" USTAWIENIA");

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitlePanelLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ContainPanel.setLayout(new java.awt.GridLayout(5, 1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Poziom :");

        javax.swing.GroupLayout LevelTitlePanelLayout = new javax.swing.GroupLayout(LevelTitlePanel);
        LevelTitlePanel.setLayout(LevelTitlePanelLayout);
        LevelTitlePanelLayout.setHorizontalGroup(
            LevelTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LevelTitlePanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(382, Short.MAX_VALUE))
        );
        LevelTitlePanelLayout.setVerticalGroup(
            LevelTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LevelTitlePanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        ContainPanel.add(LevelTitlePanel);

        ButtonLevelPanel.setLayout(new java.awt.GridLayout(1, 0, 100, 0));

        Level1Button.setBackground(new java.awt.Color(0, 255, 0));
        Level1Button.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        Level1Button.setForeground(new java.awt.Color(255, 255, 255));
        Level1Button.setText("1");
        Level1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Level1ButtonActionPerformed(evt);
            }
        });
        ButtonLevelPanel.add(Level1Button);

        Level2Button.setBackground(new java.awt.Color(255, 102, 0));
        Level2Button.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        Level2Button.setForeground(new java.awt.Color(255, 255, 255));
        Level2Button.setText("2");
        Level2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Level2ButtonActionPerformed(evt);
            }
        });
        ButtonLevelPanel.add(Level2Button);

        Level3Button.setBackground(new java.awt.Color(255, 0, 0));
        Level3Button.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        Level3Button.setForeground(new java.awt.Color(255, 255, 255));
        Level3Button.setText("3");
        Level3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Level3ButtonActionPerformed(evt);
            }
        });
        ButtonLevelPanel.add(Level3Button);

        javax.swing.GroupLayout LevelPanelLayout = new javax.swing.GroupLayout(LevelPanel);
        LevelPanel.setLayout(LevelPanelLayout);
        LevelPanelLayout.setHorizontalGroup(
            LevelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LevelPanelLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(ButtonLevelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        LevelPanelLayout.setVerticalGroup(
            LevelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LevelPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ButtonLevelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ContainPanel.add(LevelPanel);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Kolor węża :");

        javax.swing.GroupLayout SnakeColorTitlePanelLayout = new javax.swing.GroupLayout(SnakeColorTitlePanel);
        SnakeColorTitlePanel.setLayout(SnakeColorTitlePanelLayout);
        SnakeColorTitlePanelLayout.setHorizontalGroup(
            SnakeColorTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SnakeColorTitlePanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(382, Short.MAX_VALUE))
        );
        SnakeColorTitlePanelLayout.setVerticalGroup(
            SnakeColorTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SnakeColorTitlePanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        ContainPanel.add(SnakeColorTitlePanel);

        ColorButtonPanel.setLayout(new java.awt.GridLayout(1, 0, 63, 63));

        BlackColorButton.setBackground(new java.awt.Color(0, 0, 0));
        BlackColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlackColorButtonActionPerformed(evt);
            }
        });
        ColorButtonPanel.add(BlackColorButton);

        GreenColorButton.setBackground(new java.awt.Color(0, 153, 0));
        GreenColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GreenColorButtonActionPerformed(evt);
            }
        });
        ColorButtonPanel.add(GreenColorButton);

        RedColorButton.setBackground(new java.awt.Color(255, 0, 0));
        RedColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedColorButtonActionPerformed(evt);
            }
        });
        ColorButtonPanel.add(RedColorButton);

        YellowColorButton.setBackground(new java.awt.Color(255, 255, 0));
        YellowColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YellowColorButtonActionPerformed(evt);
            }
        });
        ColorButtonPanel.add(YellowColorButton);

        BlueColorButton.setBackground(new java.awt.Color(0, 0, 204));
        BlueColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlueColorButtonActionPerformed(evt);
            }
        });
        ColorButtonPanel.add(BlueColorButton);

        javax.swing.GroupLayout SnakeColorPanelLayout = new javax.swing.GroupLayout(SnakeColorPanel);
        SnakeColorPanel.setLayout(SnakeColorPanelLayout);
        SnakeColorPanelLayout.setHorizontalGroup(
            SnakeColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SnakeColorPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(ColorButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        SnakeColorPanelLayout.setVerticalGroup(
            SnakeColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SnakeColorPanelLayout.createSequentialGroup()
                .addComponent(ColorButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 68, Short.MAX_VALUE))
        );

        ContainPanel.add(SnakeColorPanel);

        ButtonContain.setLayout(new java.awt.GridLayout(1, 0, 150, 0));

        SaveButton.setBackground(new java.awt.Color(0, 0, 0));
        SaveButton.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        SaveButton.setForeground(new java.awt.Color(255, 255, 255));
        SaveButton.setText("Zapisz");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        ButtonContain.add(SaveButton);

        MenuButton.setBackground(new java.awt.Color(0, 0, 0));
        MenuButton.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        MenuButton.setForeground(new java.awt.Color(255, 255, 255));
        MenuButton.setText("Menu");
        MenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuButtonActionPerformed(evt);
            }
        });
        ButtonContain.add(MenuButton);

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonPanelLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(ButtonContain, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonPanelLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(ButtonContain, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        ContainPanel.add(ButtonPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ContainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BlackColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlackColorButtonActionPerformed
        snakeColor = Color.black;
    }//GEN-LAST:event_BlackColorButtonActionPerformed

    private void Level1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Level1ButtonActionPerformed
        level = 1;
    }//GEN-LAST:event_Level1ButtonActionPerformed

    private void MenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuButtonActionPerformed
        MenuPanel menu = new MenuPanel();
        frame.getContentPane().removeAll();
        frame.add(menu);
        frame.validate();
        frame.pack();
        repaint();
    }//GEN-LAST:event_MenuButtonActionPerformed

    private void Level2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Level2ButtonActionPerformed
        level = 2;
    }//GEN-LAST:event_Level2ButtonActionPerformed

    private void Level3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Level3ButtonActionPerformed
        level = 3;
    }//GEN-LAST:event_Level3ButtonActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        levelMP = level;
        snakeColorMP = snakeColor;
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void GreenColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GreenColorButtonActionPerformed
        snakeColor = Color.green;
    }//GEN-LAST:event_GreenColorButtonActionPerformed

    private void RedColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedColorButtonActionPerformed
        snakeColor = Color.red;
    }//GEN-LAST:event_RedColorButtonActionPerformed

    private void YellowColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YellowColorButtonActionPerformed
        snakeColor = Color.yellow;
    }//GEN-LAST:event_YellowColorButtonActionPerformed

    private void BlueColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlueColorButtonActionPerformed
        snakeColor = Color.blue;
    }//GEN-LAST:event_BlueColorButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BlackColorButton;
    private javax.swing.JButton BlueColorButton;
    private javax.swing.JPanel ButtonContain;
    private javax.swing.JPanel ButtonLevelPanel;
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JPanel ColorButtonPanel;
    private javax.swing.JPanel ContainPanel;
    private javax.swing.JButton GreenColorButton;
    private javax.swing.JButton Level1Button;
    private javax.swing.JButton Level2Button;
    private javax.swing.JButton Level3Button;
    private javax.swing.JPanel LevelPanel;
    private javax.swing.JPanel LevelTitlePanel;
    private javax.swing.JButton MenuButton;
    private javax.swing.JButton RedColorButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JPanel SnakeColorPanel;
    private javax.swing.JPanel SnakeColorTitlePanel;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JButton YellowColorButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

}
