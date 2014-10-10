package com.simonesays;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.*;
import java.util.ArrayList;
import java.util.List;


public class SimoneCore {

    static Player currentplayer;
    static Blinker blinker = new Blinker();
    static SimoneUI simone = new SimoneUI();
    static boolean cont;
    static int returnedindex;
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        // TODO Auto-generated method stub
        //
        // Testing
        
        Thread thread1 = new Thread(blinker);
        thread1.start();
        displayHighScore();
        buildPlayer();
                
        
    }

    private static List<Integer> currentPattern = new ArrayList<Integer>();
    private static int[] inputPattern;

    // Was generateArray() in the UML, but we need it to be able to grow
    // dynamically, as the users passes each level. This adds a random
    // integer between 0 and 3 to the end of the currentPattern array.
    public static void addToPattern() {
        currentPattern.add((int) (Math.random() * 4));
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
    public static int computeScore() {
        return ( currentplayer.getCurrentLevel() * (currentplayer.getCurrentLevel() + 1)) / 2;
    }

    public static void buildPlayer() {
    	currentplayer = new Player(SimoneUI.getPlayerName());
    }

    public static void startGame() throws ClassNotFoundException, FileNotFoundException, IOException, InterruptedException {
    	doLevel();
    }
    public static void displayCurrentPattern(){
    	blinker.run(currentPattern);
    }
    public static void doLevel() throws ClassNotFoundException, FileNotFoundException, IOException, InterruptedException {
		addToPattern();
		inputPattern = new int[currentPattern.size()]; 
		displayCurrentPattern();
		for(Integer i: currentPattern) {
			// Don't need the integer, but it will ask for the same number of inputs as are in the current pattern
			if (i!=returnedindex){
				cont = false;
				break;	    		
			}
		}	
		if (cont) {
			currentplayer.incrementCurrentLevel();
			doLevel();
		} 
		else {
			currentplayer.setScore(computeScore());
			HighScore.processScore(currentplayer);
		}
    }
    
    public static void quitGame() {
    	System.exit(0);
    }
 
    public static void displayHighScore() throws ClassNotFoundException, IOException {
        	Player[] hsList = HighScore.getHSList();
           	for (int i=0; i < hsList.length; i++){
        		if (hsList[i]!=null){
        				SimoneUI.HighScoreUI.append(hsList[i].toString());
        		}
        	}	
        }
}
