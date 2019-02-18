package com.bridgelabz.designpattern;

import java.util.ArrayList;

//step1 create interface
interface Observer 
{
   public void update(float interest);
}
//step2 create
interface Subject 
{
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}

class Loan implements Subject 
{
    private ArrayList<Observer> observers=new ArrayList<Observer>();
    private String type;
    private float interest;
    private String bank;

    public Loan(String type,float interest,String bank) 
    {
           this.type=type;
           this.interest=interest;
           this.bank=bank;
    }

    public float getInterest() 
    {
           return interest;
    }

    public void setInterest(float interest) 
    {
           this.interest=interest;
           notifyObservers();
    }

    public String getBank() 
    {
           return this.bank;
    }

    public String getType()
    {
           return this.type;
    }
 
    public void registerObserver(Observer observer) 
    {
        observers.add(observer);
    }

    public void removeObserver(Observer observer)
    {
         observers.remove(observer);
    }
    
    public void notifyObservers()
    {
    	for (Observer ob : observers) 
          {      
    		System.out.println("Notifying Observers on change in Loan interest rate"+"\n");
            ob.update(this.interest);
          }
    }

}
class Newspaper implements Observer 
{  
	public void update(float interest) 
	{
		System.out.println("Newspaper: Interest Rate updated, new Rate is: "+interest+"\n");
    }
}

class Internet implements Observer 
{
    
    public void update(float interest) 
    {
           System.out.println("Internet: Interest Rate updated, new Rate is: "+ interest+"\n");
    }
}
public class ObserverDesignPattern 
{
	public static void main(String args[])
	{
        // this will maintain all loans information
        Newspaper printMedia = new Newspaper();
        Internet onlineMedia = new Internet();
        Loan personalLoan = new Loan("Personal Loan", 12,"Standard Charterd");
        personalLoan.registerObserver(printMedia);
        personalLoan.registerObserver(onlineMedia);
        personalLoan.setInterest(2f);

   }
}
