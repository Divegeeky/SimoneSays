package com.simonesays;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

public class HighScore implements Serializable {

	private static final long serialVersionUID = 1L;

	public static Player[] getHSList() throws ClassNotFoundException, IOException, FileNotFoundException {
		Player[] readList = new Player[10];
		File hs = new File("hs.lst");
		if (!hs.exists()){
			hs.createNewFile();
		}
		FileInputStream fis = new FileInputStream(hs);
		try{
			ObjectInputStream ois = new ObjectInputStream(fis);
			readList = (Player[]) (ois.readObject());
			ois.close();
			return readList;
		}
		catch (EOFException e){
			return readList;
		}

	}
	
	public static void processScore(Player incPlayer) throws ClassNotFoundException, IOException, FileNotFoundException {
		FileInputStream fis = new FileInputStream("hs.lst");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Player[] readList = (Player[]) (ois.readObject());
		ois.close();
		if (incPlayer.getScore() > readList[9].getScore()){
			readList[9] = incPlayer;
		}
		Arrays.sort(readList, new Comparator<Player>() { //This is where the magic happens.  Use Arrays.sort with my passedArray and then my new comparator that compares the sum of the hours worked to sort by
			public int compare(Player o1, Player o2) {	
				if (o1.getScore() < o2.getScore()){ //Compare the values of the two sums.  Return 1 if true.  NOTE: Swap the return codes 1 and -1 to change the sort to ascending
					return 1;
				}
				return -1;
			}
		});
		FileOutputStream fos = new FileOutputStream("hs.lst");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(readList);
		oos.close();

	}
}