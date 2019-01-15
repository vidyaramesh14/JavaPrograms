package com.bridgelabz.utility;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Utility 
{

	/************************String Replace **************************/
	/**
	 * This method replaces the template with the given input string
	 * 
	 * @param template is a string which is to be modified or replace
	 * @param userName the input string given by the user
	 * @return output the modified string
	 */
	public static String replaceString(String userName) {
		String template = "Hello <<UserName>>, How are you?";

		if (userName.length() < 3)
			return "Please input name with more than 3 characters";
		else {
			String output = template.replace("<<UserName>>", userName);
			return output;
		}
	}
	/****************************Flip Coin******************************/


	/** This method generate random numbers and check whether 
	 * it is head or tail
	 * @param range ,till that range
	 * you have to generate random numbers.
	 */
	public static int flipCoin(int range)
	{
		//creating random function
		Random r=new Random();
		int head=0,tail=0;  //assigning the values
		int num=range;
		while(range> 0)
		{
			int rand=r.nextInt(2);
			if (rand==0)
				tail++;
			else
				head++;
			range--;
		}
		int percentage_tail = ((tail*100)/ num);

		return percentage_tail;

	}
	/*************************Leap Year ***************************/



	/**This method check that entered year is leap 
	 * year or not
	 */
	public static boolean leapYear(int yearnumber)
	{	boolean temp=false;
	int count=0;
	while(yearnumber>=1)
	{
		yearnumber/=10;
		count++;
	}System.out.println(count);
	if(count==4)
	{
		if(yearnumber%400==0 || ((yearnumber%100==0) && (yearnumber%4==0)))
		{
			temp=true;
		}

	}

	return temp;
	}

	/***********************Power Of 2*****************************/

	/**This method Print the table of two till the range 
	 * entered by user
	 * @param n is the range..and till that range 
	 * it generate the table 
	 */
	public static  int powerOfTwo(int base,int power)
	{  	
		int i = 1,result=1,n=0;

		if(n<=31)
		{
			for(i=0;i<=n;i++)
			{     
				//mul=(int) Math.pow(2,i);
				while(power!=0)
				{
					result*=base;
					power--;
				}
				return result;
			}
		}
		return -1;

	}

	/***********************Harmonic Number**********************/
	/**
	 * @param n is the limit, taken from user
	 * @return It return the Nth Hormonic value
	 */
	public static float harMonicValue(int n)
	{
		float sum=0;

		if(n>0)
		{
			for(int i=1;i<=n;i++)
			{
				sum=sum+(float)1/i;
			}

		}

		return sum;
	}

	/****************************Factors****************************/
	/**This method calculate factors of prime no.
	 * example: factors of 14 are 2 and 7, because 2 × 7 = 14.
	 * @param n is a input given by user
	 * @return the list of prime factor
	 */
	public static List primeFactors(int n)
	{	
		List<Integer> list=new ArrayList<>();
		for (int i = 2; i*i <= n; i++) 
		{
			while (n % i == 0) 
			{
				list.add(i);
				n = n / i;
			}
		}
		return list;
	}
	/*****************************Gambler****************************/

	/**This method shows simulation of gambler game 
	 * 
	 * @param Num_of_times is range that how many times you are going to play
	 * @param Stake is your initial amount 
	 * @param Goal is achieve goal that is increment in amount
	 * @return the Percentage of win
	 */
	public static int gamblerGame(int Stake, int Goal,int Num_of_times)
	{
		int win=0,loose=0;
		int winpercentage=0,loosepercentage=0;
		while(Goal!=0)
		{
			double random=Math.random();
			if(random<0.5)
			{
				win++;

			}else
			{
				loose++;
			}Goal--;
		}System.out.println("Number of Wins :\t"+win);
		winpercentage=((win*100)/Num_of_times);
		return winpercentage;
	}
	/***************************Coupon Number ********************/
	/**This method generate Distinct coupon number
	 * @param total_couponis the number thats how many coupons 
	 * you wants to generate
	 * @return Set of Distinct Coupon
	 */
	public static Set<Double> distinctCoupon(int total_coupon)
	{
		Set<Double> set=new LinkedHashSet<>();
		while(total_coupon !=0)
		{
			double ran=Math.random()*total_coupon;
			set.add(ran);
			total_coupon --;
		}
		return set;

	}

	/**************************2D Array*****************************/		

	static 	PrintWriter printwriter = new PrintWriter(System.out, true);
	/**This method generate two dimensional array and print using 
	 * printWriter function
	 * @param row this parameter is for entering number 
	 * 			of rows
	 * @param column this parameter is for entering number
	 * 			of columns 
	 * @return 2D array
	 */
	public static int[][] twoDarray(int row,int column)

	{	
		Scanner sc1=new Scanner(System.in);
		int[][] array = new int[row][column];
		System.out.println("enter array element:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				array[i][j]=sc1.nextInt(); //accept array elements 

			}
		}

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				printwriter.print(array[i][j]+" ");//printing 2D array
			}
			printwriter.println( );
		}

		return array;
	}

	/**************************Sum of Three Integer******************/

	/**In this method we created an array , And in that array
	 * we check any three numbers whose addition is 0
	 * we call those 3 number as triplet 
	 * @param arr where triplet is store
	 * @param number is array range which store total number of 
	 *  elements you entered in array
	 */
	public static int triplets(int[] arr,int number) 
	{	int count=0;
	for(int i=0;i<number-2;i++)
	{
		for(int j=i+1;j<number-1;j++) 
		{
			for(int k=j+1;k<number;k++)
			{

				if(arr[i]+arr[j]+arr[k]==0) //check addition of 3

				{
					System.out.println("distinct triplrt are: \n"+arr[i]+" "+arr[j]+" "+arr[k]);
					count++;
				}
			}
		}
	}return count;

	}	

	/*****************Euclidean Distance************************/	

	/**Euclidean distance is the "ordinary" straight-line distance  between two points
	 * in Euclidean space. With this distance, Euclidean space becomes a metric space.
	 * formula distence^2=x^2 +y^2 for 2D
	 * formula distence^2=x^2 +y^2+z^2 for 3D
	 */
	public static double euclideanDistance(int x , int y)
	{	

		return Math.sqrt(Math.pow(x, 2)+(Math.pow(y, 2)));
	}


	/***************************Permutation*************************/

	/** This method swap the elements in array
	 * @param str is a string
	 * @param i store  stating index element
	 * @param j this also point to last  array element
	 */
	public static String swap(String str, int i , int j)//take String=abc 
	{char[] c=str.toCharArray();
	char temp=c[i];
	c[i]=c[j];
	c[j]=temp;
	return str.valueOf(c);

	}

	/**This method find permutation of string using recursion
	 * @param str is a String
	 * @param first store  stating index element
	 * @param last this also point to last  array element
	 * @return
	 */
	public static List permutationRecursion(String str,int first,int last)
	{
		List<String> l=new ArrayList<>();

		if(first==last)
		{
			l.add(str);

		}
		else
		{
			for(int i=first;i<=last;i++)
			{
				str=swap(str,first,i);
				permutationRecursion( str, first+1, last);
				str=swap(str,first,i);
			}

		}return l;

	}		


	/***************************Stopwatch***********************/	
	/**This method takes current time of system  
	 * @param start_time in this we store current system
	 * time
	 * @return the start-time
	 */
	public static Long StartTime(long start_time)
	{
		//System.out.println("\nPress 1 start time");
		if(start_time==0)
		{
			start_time=System.currentTimeMillis();
			return start_time; 
		}
		else
			return (long) 0;
	}

	/**This mathod takes end time of current working system
	 *  when we stop or when we entered time 
	 * @param end_time in this we store end system
	 * time
	 * @return the end_time
	 */
	public static Long EndTime(long end_time) 
	{	
		if(end_time==1)
		{
			end_time=System.currentTimeMillis();
			return end_time;
		}
		else
			return (long) 0; 
	}

	/**This method calculate elapsed time for stopwatch
	 * @param start_time store stopwatch start time
	 * @param end_time store time when we stop stopwatch
	 * @return
	 */
	public static Long ElapsedTime(long start_time , long end_time)
	{
		long elapsed_time = end_time - start_time;
		return elapsed_time/1000;
	}	

	/****************************Quadratic*************************/


	/**This method is used to calculate roots for
	 * quadratic equation
	 * @param a is user input to making quadratic equation
	 * @param b is user input to making quadratic equation
	 * @param c is user input to making quadratic equation
	 */
	public static double[] calculatingRoots(int a , int b , int c)
	{ 
		double[] roots=new double[2];
		double delta =( b*b) - (4*a*c);
    
		if(delta>0)
		{
			System.out.println("roots are real and un-equal");
			double root1_x= ((-b+Math.sqrt(delta))/(2*a));
			double root2_x= ((-b-Math.sqrt(delta))/(2*a));
			roots[0]=root1_x;
			roots[1]=root2_x;
		}
		else if(delta==0)
		{System.out.println("roots are real and equal");
		double root1_x=(int) ((-b+Math.sqrt(delta))/(2*a));
		roots[0]=root1_x;
		}
		else
		{
			System.out.println("roots are imaginary");
		}
		return roots;
	}
	/************************Wind chill*******************************/

	/**
	 * @param t is temperature which is in  Fahrenheit
	 * @param v is speed  miles per hour
	 * @return effective wind chill temperature
	 */
	public static long windChillCalculation(double t , double v)
	{
		if(t>50 || (v<3 || v>120))  //This is recursion..to allow user
		{							// to enter input again and again
			return (long)0;
		}
		else 
			return (long) ((long)35.74 + 0.6215*t+ (0.4275*t-35.75)*(Math.pow(v,0.16)));

	}

	/************************Algorithm Programs*********************/	

	/****************************Anagram*****************************/

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
	/*************************Prime Number of range 0 to 1000***************/

	/**This method print prime number from 0 to till the range
	 * whatever you want  
	 * @param range store number and till that it will print
	 * prime numbers
	 */
	public static int[] printingPrimeNumber(int range) 
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
			for (int j = i+1; j < primenumber.length-1; j++)
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


	/**************************All sorting algo **************************/


	/*************************Binarysearch method for integer******************/


	/**this method search a integer in sorted array
	 * @param arr store sorted int
	 * @param Search_ele  is a integer which is to be search
	 * @return searching element
	 */
	public static int BinarySearchInt(int[] arr,int Search_ele)
	{
		int low=0;
		int high=arr.length-1;
		int mid;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(arr[mid]==Search_ele)
			{
				return mid;
			}
			else if(arr[mid]<Search_ele)
			{
				low=mid+1;
			}else 
			{
				high=mid-1;
			}

		}return -1;

	}
	/******************************Binarysearch method for String*********/
	/** this method search a string or word in sorted list 
	 * @param bubbleStringArray store sorted strings 
	 * @param stringsearch is a string which is to be search
	 * @return searching element
	 */
	public static int binaryString(String[] bubbleStringArray , String stringsearch)
	{
		int first = 0;
		int last = bubbleStringArray.length;
		int mid = 0;
		while (first <= last) {
			mid = (first + last) / 2;

			if (bubbleStringArray[mid].compareTo(stringsearch) == 0) 
			{
				return mid;

			} 
			else if (bubbleStringArray[mid].compareTo(stringsearch) < 0) 
			{
				first = mid + 1;
			} else 
			{
				last = mid - 1;
			}
		}

		return -1;
	}

	/*****************insertionsort for Integer************************/

	public static void InsertionSortInteger(int[] array)
	{
		int n = array.length; 
		for (int j = 1; j < n; j++)
		{ 
			int key = array[j]; 
			int i = j-1; 
			/**Move elements of array[0..i-1], that are 
            greater than key, to one position ahead 
            of their current position */
			while ( (i > -1) && ( array [i] > key ) )
			{ 
				array [i+1] = array [i]; 
				i--; 
			} 
			array[i+1] = key; 
		}
	}
	/*****************insertionsort for Integer************************/
	/**This method sort string data in ascending order using insertion sort
	 * @param nString store total number of string given by user
	 * @param stringArray store strings entered by user 
	 * @return sorted strings 
	 */
	public static String[] insertionString(int nString , String[] stringArray)
	{

		String key;
		int j,i;
		for (j = 1; j < stringArray.length; j++) 
		{
			key=stringArray[j];      //store original in any temporary variable
			i=j-1;
			while(i>=0)
			{
				if(stringArray[i].compareTo(key)<0)  //comparing 2 strings
				{
					break;
				}
				stringArray[i+1]=stringArray[i];    //swapping
				i--;
			}
			stringArray[i+1]=key;         
		}
		return stringArray;         // sorted strings 
	}
	/*****************BubbleSort for Integer************************/
	public static void BubbleSortInteger(int[]array)
	{
		int length=array.length;
		int temp;
		for(int i=0;i<length;i++)
		{
			for(int j=1;j<(length-i);j++)
			{
				if(array[j-1]>array[j])
				{
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
			}
		}

	}
	/*****************BubbleSort for String************************/
	/** This method sort the strings in ascending order
	 * @param nString :store total how many strings are their in array 
	 * @param stringArray : store number of strings 
	 * @return :string array ,where sorted strings are stored
	 */
	public static String[] bubbleString(int nString,String[] stringArray)
	{	
		int i,j;
		String temp;
		for(i=0;i<nString-1;i++)
		{
			for(j=0;j<nString-i-1;j++)
			{
				if((stringArray[j]).compareTo(stringArray[j+1]) > 0)
				{
					//swapping
					temp=stringArray[j];
					stringArray[j]=stringArray[j+1];
					stringArray[j+1]=temp;
				}
			}
		}

		return stringArray;		
	}	

}


