/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simonesays;

import java.util.List;

/**
 *
 * @author Jpototsk
 */
public class Blinker implements Runnable{
    public void blink(List<Integer> blinky){
        for (int i=0; i<=blinky.size(); i++){
            int blink = blinky.get(i);
            switch(blink){
                case 0: 
                    greenbutton.blink();
                    break;
                case 1:
                    redbutton.blink();
                    break;
                case 2:
                    bluebutton.blink();
                    break;
                case 3:
                    yellowbutton.blink();
                    break;
            }
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }
    public void run(List<Integer> blinky){
        blink(blinky);
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
