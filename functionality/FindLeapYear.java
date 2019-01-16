package com.bridgelabz.functionality;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class FindLeapYear 
{
	
		/*public static void main(String args[])
		{
			Scanner sc1=new Scanner(System.in);
			System.out.println("\nEnter year : ");
			int yearnumber=sc1.nextInt();
			Utility.leapYear(yearnumber);
		}*/
	
}


/**This method check entered two string are anagram or not
 * @param str1 store first string
 * @param str2 store second string
 * Now later it compare both strings are anagram or not 
 */
public void checkAnangram(String str3 , String str4 )
{			
    char array1[] = str3.toCharArray();      //convert string 
    char array2[] = str4.toCharArray(); 	//in character array	        
    Arrays.sort(array1);
    Arrays.sort(array2);
    
    if(Arrays.equals(array1, array2))   //check characters of both 
    {									//array is same or not
    	 
    	 System.out.println("String is anangram");
   	}
   	else 
   		 System.out.println("String is not anangram");
  
 }

/***********************Prime Number(0-1000)*******************/

/**This method print prime number from 0 to till the range
 * whatever you want  
 * @param range store number and till that it will print
 * prime numbers
 */
public int[] printingPrimeNumber(int range) 
{
	   boolean isPrime = true;
	   int count = 0;
	   int primeno[]=new int[range];		   
	   for (int i = 0; i <= range; i++)         
       { 		  
          for(int j=2; j<i ;j++)
          {
        	     if(i%j==0)
             	 {
             	 	isPrime=false;
             	 	break;
             	 }
             	 else 	
        	     	isPrime=true;
          	}
          	if(isPrime==true)
        	  primeno[count++]=i;
       }
	return primeno ;		     
}

/************************PrimeAnangramPalindrome*********************/	

/**This method check prime numbers are palindrome or not
 * @param primenumber: store prime number which we have to check 
 * whether it is palindrome or not
 */
static int reversenum = 0;
static int remainder=0;

public static void checkPalindrome(int[] primenumber) {

    for (int i = 0; i < primenumber.length; i++) {
        reversenum=0;
        if (primenumber[i] > 0) {
            int temp = primenumber[i];
            while (temp > 0) 
            {
                remainder = temp % 10;
                temp = temp / 10;
                reversenum = reversenum * 10 + remainder;
            }
                   temp=primenumber[i];
            if (temp == reversenum) 
                System.out.print(reversenum + " ");                
        }
    }
}

/**This method check that prime number is anagram or not
 * @param primenumber:is prime numbers which we check that numbers are
 * anangram or not
 */
public static int[] checkAnagram(int[] primenumber)
{
    System.out.println("\nThe prime number which are Anagram:");
    int anagram = 0;
    int[] anagramArray = new int[primenumber.length]; 
    for (int  i = 0; i < primenumber.length; i++)
    {
        for (int j = 0; j < primenumber.length; j++)
        {
             if(primenumber[i]>0 && primenumber[j]>0 && primenumber[i]!=primenumber[j])
             {     
                 String string1 = Integer.toString(primenumber[i]);
                 String string2 = Integer.toString(primenumber[j]);
                 anagram = Utility.checkPrimeAnagram(string1, string2);
                 if(anagram>0)
                 {
                	 anagramArray[i] = anagram;
                	 //anagramArray[i]
                 }
             }
        }
    }
	return anagramArray;				        
}

private static int checkPrimeAnagram(String string1, String string2)
{
	int anagram =0 ;
	char[] ch1 = string1.toCharArray();
    char[] ch2 = string2.toCharArray();
    boolean result=false;
    Arrays.sort(ch1);
    Arrays.sort(ch2);
    result = Arrays.equals(ch1,ch2);
    if(result==true)
    {
    	anagram = Integer.parseInt(string1);
    	//System.out.print(anagram+" ");
    	return anagram;
    }
	return anagram;		
}  		

