/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simonesays;

import java.awt.Dimension;

import javax.swing.JScrollPane;

/**
 *
 * @author Jason Pototsky
 */
public class SimoneUI extends javax.swing.JFrame {

    /**
     * Creates new form SimoneUI
     */
    public SimoneUI() {
        initComponents();
    }
    public static String getPlayerName(){
    	return PlayerName.getText();
    }
    private void initComponents() {
        getContentPane().setPreferredSize(new Dimension(830, 520));
        GreenButton greenbutton = new GreenButton();
        RedButton redbutton = new RedButton();
        BlueButton bluebutton = new BlueButton();
        YellowButton yellowbutton = new YellowButton();
        JbuttonStart = new javax.swing.JButton();
        JbuttonQuit = new javax.swing.JButton();
        JLabelCurrentScore = new javax.swing.JLabel();
        HighScoreUI = new javax.swing.JTextArea();
        PlayerName = new javax.swing.JTextField();
        JlabelBG = new javax.swing.JLabel();
        jScrollPane1 = new JScrollPane();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(greenbutton);
        getContentPane().add(redbutton);
        getContentPane().add(bluebutton);
        getContentPane().add(yellowbutton);
        JbuttonStart.setText("Start Game");
        JbuttonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbuttonStartActionPerformed(evt);
            }
        });
        getContentPane().add(JbuttonStart);
        JbuttonStart.setBounds(200, 210, 100, 30);

        JbuttonQuit.setText("Quit Game");
        JbuttonQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbuttonQuitActionPerformed(evt);
            }
        });
        getContentPane().add(JbuttonQuit);
        JbuttonQuit.setBounds(340, 210, 100, 30);

        JLabelCurrentScore.setText("Current Score");
        getContentPane().add(JLabelCurrentScore);
        JLabelCurrentScore.setBounds(260, 250, 140, 30);

        HighScoreUI.setEditable(false);
        HighScoreUI.setColumns(20);
        HighScoreUI.setRows(5);
        jScrollPane1.setViewportView(HighScoreUI);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(640, 0, 190, 480);

        PlayerName.setText("Player");
        getContentPane().add(PlayerName);
        PlayerName.setBounds(280, 110, 90, 30);

        JlabelBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/simonesays/il_fullxfull.309132380.jpg")));
        JlabelBG.setText("JLabelBG");
        JlabelBG.setName(""); // NOI18N
        getContentPane().add(JlabelBG);
        JlabelBG.setBounds(0, 0, 640, 480);

        pack();
    }

    private void JbuttonStartActionPerformed(java.awt.event.ActionEvent evt) {
     
        SimoneCore.startGame();
    }

    private void JbuttonQuitActionPerformed(java.awt.event.ActionEvent evt) {
     
        SimoneCore.quitGame();
    }
   
    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SimoneUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimoneUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimoneUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimoneUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimoneUI().setVisible(true);
            }
        });
    }

    // Variables declaration//
    public static javax.swing.JTextArea HighScoreUI;
    private javax.swing.JLabel JLabelCurrentScore;
    public static BlueButton bluebutton;
    public static GreenButton greenbutton;
    private javax.swing.JButton JbuttonQuit;
    public static RedButton redbutton;
    private javax.swing.JButton JbuttonStart;
    public static YellowButton yellowbutton;
    private javax.swing.JLabel JlabelBG;
    private static javax.swing.JTextField PlayerName;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//
}
