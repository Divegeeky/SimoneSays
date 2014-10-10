package com.simonesays;

public class Player {
	private String name = "";
	private int score = 0;
	private int currentLevel = 0;
	private int[] inputArray;
	
	public Player() {
		
	}
	
	public Player(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getCurrentLevel() {
		return currentLevel;
	}

	public void setCurrentLevel(int currentLevel) {
		this.currentLevel = currentLevel;
	}

	public void incrementCurrentLevel() {
		this.currentLevel++;
	}
	
	public int[] getByteArray() {
		return inputArray;
	}

	public void setInputArray(int[] inputArray) {
		this.inputArray = inputArray;
	}	
}
