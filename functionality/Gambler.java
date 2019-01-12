package com.bridgelabz.functionality;

import com.bridgelabz.utility.Utility;

public class Gambler 
{
	
	    /*
	    * The main function is written to take input from the user and
	    * call gambler function that calculate win and lose percentage
	    */
	    public static void main(String[] args)
	    {
	       Utility u=new Utility();
	        System.out.println("enter the stake value ");
	       int stake=u.inputInteger();
	        System.out.println("enter the goal ");
	        int goal=u.inputInteger();
	        System.out.println("enter the no of times to gamble");
	        int no_of_times=u.inputInteger();;
	       
	        u.playthegame(stake, goal, no_of_times);

	    }

	
}
