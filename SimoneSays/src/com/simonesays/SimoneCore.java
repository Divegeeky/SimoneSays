package com.simonesays;

import java.io.IOException;
import java.math.*;
import java.util.ArrayList;
import java.util.List;


public class SimoneCore {

    static int returnedindex;
    static Player currentplayer;
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        // TODO Auto-generated method stub
        //
        // Testing
        Blinker blinker = new Blinker();
        Thread thread1 = new Thread(blinker);
        thread1.start();
        SimoneUI simone = new SimoneUI();
        displayHighScore();
                
        
    }

    private List<Integer> currentPattern = new ArrayList<Integer>();
    private List<Integer> inputPattern   = new ArrayList<Integer>();
    private boolean cont;

    // Was generateArray() in the UML, but we need it to be able to grow
    // dynamically, as the users passes each level. This adds a random
    // integer between 0 and 3 to the end of the currentPattern array.
    public void addToPattern() {
        this.currentPattern.add((int) (Math.random() * 4));
    }

    // Scoring adds the number of correct answers per level passed
    // If the user passes Level 1:
    // L1: 1
    // L2: 3 (1 + 2)
    // L3: 6 (1 + 2 + 3)
    // etc.
    // Should also have one of these that computes the score directly from the
    // current Player level
    public int computeScore(Player p) {
    	 int n = p.getCurrentLevel();
    	 return ((n * (n+1)) / 2);
    }

    // Should also have one of these that computes the score directly from the
    // current Player level
    public int computeScore() {
        return ( currentplayer.getScore() * (currentplayer.getScore() + 1)) / 2;
    }

    public int getUserInput() {
    	
    }

    public void buildPlayer() {
    	currentplayer = new Player(SimoneUI.getPlayerName());
    }

    public static void startGame() {
    
    }

    public static void quitGame() {
    }
    //Added routine here to get the HS.  Not exactly sure how we are to display that in the UI.  Needs work still.
    public static void displayHighScore() throws ClassNotFoundException, IOException {
        	Player[] hsList = HighScore.getHSList();
        	//need to add how to display here.
        	for (int i=0; i < hsList.length; i++){
        	SimoneUI.HighScoreUI.append(hsList[i].toString());
        	}
        }
 

    public void checkPattern() {
    }

    // Not sure if this should be here, or if we should always submit to the
    // HighScore module and have that figure it out
    // Update: We should just submit to the highscore module.  I put all the code in there to deal with this.
    // HighScore.processScore(Player)
    public void checkHighScore() {
    }
}
