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
public class GreenButton extends javax.swing.JButton{
    private int index = 0;
    public GreenButton(){
        this.setText("GREEN");
        this.setBackground(Color.GREEN);
        this.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GreenButtonActionPerformed();
            }
        });
        this.setBounds(50, 40, 130, 60);
    }
    private void GreenButtonActionPerformed(){
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
        this.setBackground(Color.GREEN);
    }
}
