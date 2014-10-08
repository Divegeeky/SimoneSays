/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simonesays;

import java.awt.Color;

/**
 *
 * @author Jpototsk
 */
public class YellowButton extends javax.swing.JButton {
    private int index = 3;
    public YellowButton(){
        this.setBackground(Color.YELLOW);
        this.setText("Yellow");
        this.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YellowButtonActionPerformed();
            }
        });
        this.setBounds(90, 370, 100, 60);
    }
    private void YellowButtonActionPerformed(){
        SimoneCore.returnedindex = index;
    }
     public void blink(){
        this.setBackground(Color.white);
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
        this.setBackground(Color.YELLOW);
    }
}
