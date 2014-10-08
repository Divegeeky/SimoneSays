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
public class RedButton extends javax.swing.JButton {
    private int index = 1;
    public RedButton(){
        this.setText("RED");
        this.setBackground(Color.RED);
        this.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               RedButtonActionPerformed();
            }
        });
        this.setBounds(480, 40, 110, 60);
}
    private void RedButtonActionPerformed(){
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
        this.setBackground(Color.RED);
    }
}