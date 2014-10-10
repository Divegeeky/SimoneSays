/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simonesays;

import java.util.List;

/**
 *
 * @author Jason Pototsky
 */
public class Blinker implements Runnable{
    public void run(List<Integer> blinky){
        for (int i : blinky){
            int blink = blinky.get(i);
            switch(blink){
                case 0: 
                    SimoneUI.greenbutton.blink();
                    break;
                case 1:
                    SimoneUI.redbutton.blink();
                    break;
                case 2:
                    SimoneUI.bluebutton.blink();
                    break;
                case 3:
                    SimoneUI.yellowbutton.blink();
                    break;
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
    @Override
    public void run() {
        try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
    }
}
