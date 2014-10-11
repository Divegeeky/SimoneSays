/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simonesays;

import java.awt.Color;

/**
 *
 * @author Jason Pototsky
 */
public class Blinker implements Runnable{
    public void run(){
        for (Integer i : SimoneCore.currentPattern ){
            int blink = i;
            switch(blink){
                case 0: 
                    SimoneUI.greenbutton.setBackground(Color.WHITE);
                    SimoneUI.greenbutton.repaint();
				try {
					Thread.sleep(2000);
					}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
					SimoneUI.greenbutton.setBackground(Color.GREEN);
                    break;
                case 1:
                    SimoneUI.redbutton.setBackground(Color.WHITE);
				try {
					Thread.sleep(2000);
					}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
					SimoneUI.redbutton.setBackground(Color.RED);
                case 2:
                    SimoneUI.bluebutton.setBackground(Color.WHITE);
				try {
					Thread.sleep(2000);
					}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
					SimoneUI.bluebutton.setBackground(Color.BLUE);
                case 3:
                    SimoneUI.yellowbutton.setBackground(Color.WHITE);
				try {
					Thread.sleep(2000);
					}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
					SimoneUI.yellowbutton.setBackground(Color.YELLOW);
                
            }
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
    }
    
}
