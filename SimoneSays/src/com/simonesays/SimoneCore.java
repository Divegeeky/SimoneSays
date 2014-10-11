package com.simonesays;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class SimoneCore {

    static Player currentplayer;
    static SimoneUI simone;
    static boolean cont;
    static int returnedindex;
    static List<Integer> currentPattern = new ArrayList<Integer>();
       public static void addToPattern() {
        int i = (int)(Math.random()* 4);
    	currentPattern.add(i);
    }

    public int computeScore(Player p) {
    	 int n = p.getCurrentLevel();
    	 return ((n * (n+1)) / 2);
    }

    public static int computeScore() {
        return ( currentplayer.getCurrentLevel() * (currentplayer.getCurrentLevel() + 1)) / 2;
    }

    public static void buildPlayer() {
    	currentplayer = new Player(SimoneUI.PlayerName.getText());
    }

    public static void startGame() throws ClassNotFoundException, FileNotFoundException, IOException, InterruptedException {
    	doLevel();
    }
    
    public static void doLevel() throws ClassNotFoundException, FileNotFoundException, IOException, InterruptedException {
		addToPattern();
		SimoneUI.blinker.run();
		Thread.sleep(5000);
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
    	currentPattern.clear();
    	System.exit(0);
    }
 
    public static void displayHighScore() throws ClassNotFoundException, IOException {
        	Player[] hsList = HighScore.getHSList();
           	for (int i=0; i < hsList.length; i++){
        		if (hsList[i]!=null){
        				SimoneUI.HighScoreUI.append(hsList[i].toString()+ "\n");
        		}
        		if (hsList[i]==null){
        			SimoneUI.HighScoreUI.append("There is no player data in the HS.lst for this player. \n");
        		}
        	}	
        }
}
