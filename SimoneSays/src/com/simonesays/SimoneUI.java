package com.simonesays;

import java.awt.Dimension;
import java.io.FileNotFoundException;
import java.io.IOException;

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
    
    private void initComponents() {
        getContentPane().setPreferredSize(new Dimension(830, 520));
        JbuttonStart = new javax.swing.JButton();
        JbuttonQuit = new javax.swing.JButton();
        JLabelCurrentScore = new javax.swing.JLabel();
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
                try {
					JbuttonStartActionPerformed(evt);
				} catch (ClassNotFoundException | IOException
						| InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
    	blinker = new Blinker();
        pack();
    }

    private void JbuttonStartActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException, FileNotFoundException, IOException, InterruptedException {
     
        SimoneCore.startGame();
    }

    private void JbuttonQuitActionPerformed(java.awt.event.ActionEvent evt) {
     
        SimoneCore.quitGame();
    }
   
    /**
     * @param args the command line arguments
     * @throws IOException 
     * @throws ClassNotFoundException 
     */
    
    public static void main(String[] args) throws ClassNotFoundException, IOException, InterruptedException {
        // TODO Auto-generated method stub
        //
        // Testing
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
        SimoneCore.displayHighScore();
        SimoneCore.buildPlayer();
        
    }

    // Variables declaration//
    public static javax.swing.JTextArea HighScoreUI = new javax.swing.JTextArea();;
    private javax.swing.JLabel JLabelCurrentScore;
    public static BlueButton bluebutton = new BlueButton();
    public static GreenButton greenbutton = new GreenButton();
    private javax.swing.JButton JbuttonQuit;
    public static RedButton redbutton = new RedButton();
    private javax.swing.JButton JbuttonStart;
    public static YellowButton yellowbutton = new YellowButton();
    private javax.swing.JLabel JlabelBG;
    public static javax.swing.JTextField PlayerName;
    private javax.swing.JScrollPane jScrollPane1;
    public static Blinker blinker;
    // End of variables declaration//
}
