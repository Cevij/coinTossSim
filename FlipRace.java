package cointossSimulator;

public class FlipRace {

	public static void main(String[] args) {
		

		
		int count1=0;//count for coin 1
		int count2=0;//count for coin 2
		final int wins=2;//wins needed to end while loop
		final int wins1=3;//wins needed to end in a tie
		
		//create two coin objects
		Coin coin1=new Coin();
		Coin coin2=new Coin();
		
		
	      while (count1<=wins&&count2<=wins)
	      {
	        
	    	  
	    	  // toss coin.
	         coin1.toss();
	         coin2.toss();
	         
	       //if else statements to count the number of heads and reset on tails
	         //coin 1
	         if(coin1.getSideUp()==0) 
		         
		         count1++;
	         
	         else if(coin1.getSideUp()==1) 
	        	 count1=0*count1;
	         
	         //coin 2
	         if(coin2.getSideUp()==0) 
	        	
	        	 count2++;
	        	 
	         
	         else if(coin2.getSideUp()==1) 
	        	 count2=0*count2;
	        	 
	        
		      //display the outcome of the tosses
		        System.out.println("Coin 1: "+coin1.toString()+
		        		 "	Coin 2: "+coin2.toString());
		        
		        //i have no idea what this is doing here but the code needed it
		        coin1.isHead();
		        coin2.isHead();
		        
		        //the win and tie cases using if else statements
		        if (count1>=wins1&&count2>=wins1)
			    	  System.out.println("They tied!!!");
		        
		        else if(count1>wins) 
			    	  System.out.println("Coin 1 wins!!!");
			      
			    else if(count2>wins)
			    	  System.out.println("Coin 2 wins!!!");
		        
			    }
	     
	      
	 
	         
	      }
	      
		
		
		

	}
