package com.bridgelabz.oops;

import com.bridgelabz.datastructure.MyQueue;

public class DeckOfCards<T>{

	public static void main(String[] args) 
	{
		String[] card= {"clubs","diamonds","hearts","spades"};
		String[] rank= {"2","3","4","5","6","7","8","9","10","jack","queen","king","ace"};
		
		String[] setofcards=new String[52];
		int pos=0;
		
		//initializing cards
		for(int i=0;i<rank.length;i++)
		{
			for(int j=0;j<card.length;j++)
			{
				setofcards[pos++]=rank[i]+"-"+card[j];
			}
		}
		/*for(int i=0;i<setofcards.length;i++)
		{
			System.out.print(setofcards[i]+",");
		}*/
		System.out.println();
		
		//shuffling of cards
		for(int i=0;i<setofcards.length;i++)
		{
			int random=(int)(Math.random()*card.length);
			String temp=setofcards[i];
			setofcards[i]=setofcards[random];
			setofcards[random]=temp;
		}
		
		/*for(int i=0;i<setofcards.length;i++)
		{
			System.out.print(setofcards[i]+",");
		}*/
		
		distributecardQueue(setofcards,4,9);
		
		

	}
	
	public static String[][] distributecards(String[] setofcards,int numofplayer,int numofcard)
	{
		String[][] distributecards=new String[numofplayer][numofcard];
		/*int pos=0;
		for(int i=0;i<numofplayer;i++)
		{
			for(int j=0;j<numofcard;j++)
			{
				distributecards[i][j]=setofcards[pos++];
			}
		}*/
		
		int player_num=1;
		int pos = 0;
		for(int i=0;i< numofplayer;i++)
		{System.out.print("player "+player_num+" :"+"\n");
			for(int j=0;j< numofcard;j++)
			{
				System.out.println(distributecards[i][j]=setofcards[pos++]);
			}
			player_num++;
			System.out.println();
		}
		return distributecards;
	}
	public static void distributecardQueue(String[] setofcards,int numofplayer,int numofcard)
	{
		MyQueue<String> queue=new MyQueue<String>();
		String[][] distributecards=new String[numofplayer][numofcard];
		
		String[] cards = new String[numofcard];
		for(int i= 0;i<numofplayer;i++)
		{
			for(int j=0;j<numofcard;j++)
			{
				cards[j] = distributecards[i][j];   // copying in 1D array
			}
			queue.enqueue("\nPlayer "+(i+1)+" Cards");
			sortCards(cards);
		}
		queue.show();   //Printing sorted cards
	}
	
	/**This method sort the cards by rank
	 * @param cards are players cards
	 */public static void sortCards(String[] cards)
		{
			MyQueue<String> queue=new MyQueue<String>();
			char[] numberRank = {'A','2','3','4','5','6','7','8','9','0','J','Q','K'};
			for(int i = 0 ; i < numberRank.length;i++)
			{
				for(int j = 0 ; j < cards.length ; j++)
				{
					String card = cards[j];    
					char cardRank = card.charAt(j);   //For checking first element in cards array
					if(cardRank == numberRank[i]) 
					{
						queue.enqueue(card);  //add sorted card in queue
					}
				}
			}
		}
	
}
	


