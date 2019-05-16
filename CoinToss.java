package cointossSimulator;

public class CoinToss {

	public static void main(String[] args) {
		
		//number of flips
		final int maxFlips=20;
		
		//create coin object
		Coin myCoin=new Coin();
		
		
		myCoin.isHead();
	
		
		System.out.println("The side initially facing up: Heads");
		
		
		System.out.println("Now I will toss the coin "+ maxFlips  +" times.");
		
		//make sure the side count of both heads and tails are 0
        myCoin.resetSideCnt();
		
	    for (int i = 1; i <=maxFlips; i++)
	    {
	         // toss coin.
	         myCoin.toss();
	       
	         
	         // Display the values of the coin.
	         System.out.println("Toss: "+myCoin.toString());
	         
	         
	         myCoin.getSideCnt(i);
	         

	    }
	    //to display correct number of tails and heads  
	    System.out.println(myCoin.toString2());
		
		
	}

}
