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
public class BlueButton extends javax.swing.JButton{
    private int index = 2;
    public BlueButton(){
        this.setText("Blue");
        this.setBackground(Color.BLUE);
        this.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlueButtonActionPerformed();
            }
        });
       this.setBounds(470, 380, 110, 60);

    }
    private void BlueButtonActionPerformed(){
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
        this.setBackground(Color.BLUE);
    }
}
