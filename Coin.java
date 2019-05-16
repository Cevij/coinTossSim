package cointossSimulator;


import java.util.Random;

public class Coin {
	
	
	//fields
	private int Heads=0;
	private int Tails=1;
	private int sideUp=0;
	private int headCnt;
	private int tailCnt;
	private boolean headT;
	
	//constructor
	public Coin() {
		Heads=0;
		Tails=1;
		sideUp=0;
		headT=false;
		headCnt=0;
		tailCnt=0;
		
	}
	
	//complex constructor
	public Coin(int side) {
		sideUp=0;
		Heads=0;
		Tails=1;
		headCnt=0;
		headT=false;
		tailCnt=0;
		
		
	}
	
	//generate a random number between 0-1
	public void toss() {
		
	      // Create a Random object.
	      Random rand = new Random();
	      
	      
	      // Get a random value for the coin.
	      sideUp = rand.nextInt(2);
	      
	      
		
	}
	
	public int getSideUp() {

	

		return sideUp;
		
	}
	
	public int getSideCnt(int side) {
		//keep count of the number of heads and tails
		
		if(sideUp==0)
			headCnt++;
		else
			tailCnt++;
		
		return headCnt;
		
	}
	
	
	public void resetSideCnt() {
		headCnt=0;
		tailCnt=0;
	}
	
	public String toString() {

		String str;
		//to give string to the values of 0 and 1
		if(sideUp==0) 
		str="Heads";
		
		else 
		str="Tails";
		
	
		return str;
		
		
	}
	
	//sorry i had to create another to string method to get the exact number of heads and tail
	public String toString2() {

		String str1="\nHeads occurred: "+headCnt+
				"\nTails occurred: "+tailCnt;

		return str1;
		
		
	}
	
	public void isHead() {
			
		headT=!headT;
		
	}
	
	
	

}
