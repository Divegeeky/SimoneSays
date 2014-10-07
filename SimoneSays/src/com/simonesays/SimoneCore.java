package com.simonesays;

import java.math.*;

public class SimoneCore {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //
        // Testing

    }

    private List<Integer> currentPattern = new ArrayList<Integer>();
    private List<Integer> inputPattern   = new ArrayList<Integer>();
    private boolean continue;

    // Was generateArray() in the UML, but we need it to be able to grow
    // dynamically, as the users passes each level. This adds a random
    // integer between 0 and 3 to the end of the currentPattern array.
    public void addToPattern() {
        this.currentPattern.add((int) (Math.random() * 4);
    }

    // Scoring adds the number of correct answers per level passed
    // If the user passes Level 1:
    // L1: 1
    // L2: 3 (1 + 2)
    // L3: 6 (1 + 2 + 3)
    // etc.
    // Should also have one of these that computes the score directly from the
    // current Player level
    public void computeScore(int score) {
        return ( score * (score + 1)) / 2;
    }

    // Should also have one of these that computes the score directly from the
    // current Player level
    public void computeScore() {
        return ( score * (score + 1)) / 2;
    }

    public int getUserInput() {
    }

    public Player buildPlayer() {
    }

    public void startGame() {
    }

    public void quitGame() {
    }

    public void displayHighScore() {
    }

    public void checkPattern() {
    }

    // Not sure if this should be here, or if we should always submit to the
    // HighScore module and have that figure it out
    public void checkHighScore() {
    }
}
