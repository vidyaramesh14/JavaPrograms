package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import com.bridgelabz.functionality.FindLeapYear;

public class Utility 
{

	private static final Class Utility = null;
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
		System.out.println("head"+head+"    "+"tail"+tail);
		int percentage_tail = ((tail*100)/ num);

		return percentage_tail;

	}
	/*************************Leap Year ***************************/



	/**This method check that entered year is leap 
	 * year or not
	 */
	public static void leapYear(int year)
	{	
		int temp=year;
		int count=0;	
		while(temp>=1)
		{
			temp/=10;
			count++;
		}//System.out.println(count);
		if(count==4)
		{	
			if(year%4==0)
			{
				if(year % 100 ==0 && year%400==0)
					System.out.println("is leap year");
				else
					System.out.println("not a leap year");
			}
			else
				System.out.println("is not leap year");
		}
		else
			try {
				throw new NumberFormatException();
			} catch (Exception e) {
				System.out.println("is not leap reenter");
				//FindLeapYear.main(null);
			}





	}

	/***********************Power Of 2*****************************/

	/**This method Print the table of two till the range 
	 * entered by user
	 * @param n is the range..and till that range 
	 * it generate the table 
	 */
	public static  void powerOfTwo(int base,int power)
	{  	
		for(int i=0;i<=power;i++)
		{     
			System.out.println("2^"+i+" = "+Math.pow(base, i));
		}
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
		int temp=Num_of_times;
		if(Stake>0 && Stake<=Goal)
		{
			while(Num_of_times!=0)
			{
				double random=Math.random();
				if(random<0.5)
				{
					win++;
					Stake++;


				}else
				{
					loose++;
					Stake--;

				}Num_of_times--;
			}
		}
		System.out.println("Stake value "+Stake);
		System.out.println("Goal value "+Goal);
		System.out.println("Number of Wins :\t"+win);
		winpercentage=((win*100)/temp);
		return winpercentage;
	}
	/***************************Coupon Number ********************/
	/**This method generate Distinct coupon number
	 * @param total_couponis the number thats how many coupons 
	 * you wants to generate
	 * @return Set of Distinct Coupon
	 */
	public static Set<String> distinctCoupon(int total_coupon)
	{
		Set<String> set=new LinkedHashSet<>();
		while(total_coupon !=0)
		{
			
			Random random=new Random();
			String random4=String.format("%04d", random.nextInt(10000));
			set.add(random4);
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
	/*int x=9;
	if (x == 0 || x == 1) 
		System.out.println(x);


	int i = 1, result = 1; 

	while (result <= x) { 
		i++; 
		result = i * i; 
	} 
	System.out.println(i-1);*/
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
			try {
				double root1_x= ((-b+Math.sqrt(delta))/(2*a));
				double root2_x= ((-b-Math.sqrt(delta))/(2*a));
				roots[0]=root1_x;
				roots[1]=root2_x;
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		else if(delta==0)
		{
			System.out.println("roots are real and equal");
			double root1_x=(int)(-b/(2*a));
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




	/**this method check whether 2 given String are Anagram are Not
	 * @param first is 1st String
	 * @param second is 2nd String
	 * @return boolean value
	 */
	public static boolean checkAnagram(String first, String second)
	{
		if(first.length()!=second.length())
		{
			return false;
		}
		char[] characters = first.toCharArray();
		for(char c:characters)
		{
			if(second.contains(new String(""+c))) {
				second.replace('c',' ');
			}else {
				return false;
			}
		}
		return true;
	}

	/*************************Prime Number of range 0 to 1000***************/

	/***********************Prime Number(0-1000)*******************/
	
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
	
  

    public static List checkPalindrome(int[] primenumber) {
    	int[] palindrome=new int[primenumber.length];
    	int count=0;
    	List l=new ArrayList();
        for (int i = 0; i < primenumber.length; i++) {
          int  reversenum=0;
            if (primenumber[i] > 0) {
                int temp = primenumber[i];
                while (temp > 0) 
                {
                  int  remainder = temp % 10;
                    temp = temp / 10;
                    reversenum = reversenum * 10 + remainder;
                }
                       temp=primenumber[i];
                if (temp == reversenum) 
                {
                	l.add(temp);
                	
                }
                    
              
            }
        }return l;
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
	               
	                 
	                
	         		char[] ch1 = string1.toCharArray();
	         	    char[] ch2 = string2.toCharArray();
	         	    boolean result=false;
	         	    Arrays.sort(ch1);
	         	    Arrays.sort(ch2);
	         	    result = Arrays.equals(ch1,ch2);
	         	    if(result==true)
	         	    {
	         	    	anagram = Integer.parseInt(string1);
	         	    	
	         	    }
	         		
	                 if(anagram>0)
	                 {
	                	 anagramArray[i] = anagram;
	                	 
	                 }
                 }
            }
        }
		return anagramArray;				        
    }
    
    

	/**************************All sorting algo **************************/


	/*************************Binarysearch ******************/


	/**this method search a given value in sorted array
	 * @param arr is a T type array
	 * @param Search_ele  is a element which is to be search
	 * @return searching element position
	 */



	public static <T extends Comparable<T> > int genericsBinarySearch(T[] arr,T Search_ele)
	{
		int low=0;
		int high=arr.length-1;
		int mid=0;
		while(low<=high)
		{
		 mid=(low+high)/2;
		 if(arr[mid].compareTo(Search_ele)<0)
			{
				low = mid+1;
			}
			else if(arr[mid].equals(Search_ele))
			{
				System.out.println("Element found at " +(mid)+ " location ");
				break;
			}
			else
			{
				high = mid-1;
				
			}
		}return -1;

	}

	/*****************insertion sort************************/

	/**this method sort the array in ascending order using insertion sort
	 * @param array store total number of integer given by user
	 * @return sorted integer array
	 */
	public static <T extends Comparable<T>> T[] InsertionSortInteger(T[] array)
	{	for(int i=1;i<array.length;i++)
	{	T temp=array[i];
	int j=i-1;
	while(j>=0 && array[j].compareTo(temp)>0)
	{
		array[j+1]=array[j];
		j=j-1;
	}array[j+1]=temp;
	}return array;
	}
	
	/*****************BubbleSort************************/
	/** this method sort the array in ascending order
	 * @param array is a given array 
	 * @return sorted array
	 */
	public static <T extends Comparable<T>> T[] genericsBubbleSort(T[] array)
	{

		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length-1;j++)
			{
				if(array[j].compareTo(array[j+1])>0)
				{
					T temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}return array;

	}
	/*********************** find your number**********************/
	/**
	 * @param range is provided by the computer to select 
	 * secret number
	 * @return a count of computer took to find secret number
	 */
	public static int findSecretNumber(int range)
	{int low=0;
	int high=range-1;
	int mid=0;
	int count=0;
		Scanner sc1=new Scanner(System.in);
		int result=0;
		while(result!=3)
		{
		System.out.println("is "+ mid +" your secret number ?" );
		System.out.println("press 1 if your secret number less than "+mid+" number");
		System.out.println("press 2 if your secret number greater than "+mid+" number");
		System.out.println("press 3 if your secret number is "+mid+" number");
	
		 result=sc1.nextInt();
		if(result==1)
			{
				high=mid-1;
				count++;
				mid=(low+high)/2;
			  
			}
		else if(result==2)
		{
			low=mid+1;
			count++;
			mid=(low+high)/2;
		}

		
		}
		System.out.println("your number is "+mid );
	
		return count;
		
		
	}
	
	/********************binary search file*****************************/
	/**this method read input from file and then search the given element
	 * @param path is a file location
	 * @param key is a searching element
	 * @throws Exception
	 */
	public static int  binaryFile(String  path,String key) throws Exception
	{	//List<String> list=new ArrayList<>(); 
		String[] array;
		
		BufferedReader br=new BufferedReader(new FileReader(path));
		String line="";
		String str="";
		while((str=br.readLine())!=null)
		{
			line+=str;
					
			//list.add(str);
			System.out.println(line);
			
		}	
		array=line.split(" ");
		Arrays.sort(array);
		System.out.println("Words list is :");
		for(int i = 0 ; i< array.length ;i++ )
		{
			System.out.print(array[i]+"  ");
		}
		System.out.println();
		int low=0;
		int mid=0;
		int high=array.length;
		while(low<=high)
		{
		 mid=(low+high)/2;
		 if(array[mid].compareTo(key)<0)
			{
				low = mid+1;
			}
			else if(array[mid].equals(key))
			{
				System.out.println("Element found at " +(mid)+ " location ");
				break;
			}
			else
			{
				high = mid-1;
				
			}
		}return -1;
		//int result=	Utility.genericsBinarySearch(array, key);	
		/*if(result < 0)
	    	System.out.println("found");
	    else
	    	System.out.println(" not found");
	*/
	}
	
	/***********************merge sort***********************/
	
	
/**this method sort the array in ascending order using merge sort
 * @param arr is given array
 * @param start is stating position of array
 * @param mid is middle position of array
 * @param end is ending position  of array
 */
public static <T extends Comparable<T>> void merge(T[] arr, Class Utility, int start, int mid, int end)
{
	int left = mid-start+1;
	int right = end - mid;  
	Utility u=new Utility();
	T LeftArray[] = (T[])Array.newInstance(Utility, left); 
	T RightArray[] =(T[])Array.newInstance(Utility, right); 
	  
	for (int i=0; i<left; ++i)  
	LeftArray[i] = arr[start + i];  
	  
	for (int j=0; j<right; ++j)  
	RightArray[j] = arr[mid + 1+ j];  
	  
	  
	int i = 0, j = 0;  
	int k = start;  
	while (i<left&&j<right)  
	{  
	if (LeftArray[i].compareTo(RightArray[j])<=0)  
	{  
	arr[k] = LeftArray[i];  
	i++;  
	}  
	else  
	{  
	arr[k] = RightArray[j];  
	j++;  
	}  
	k++;  
	}  
	while (i<left)  
	{  
	arr[k] = LeftArray[i];  
	i++;  
	k++;  
	}  
	  
	while (j<right)  
	{  
	arr[k] = RightArray[j];  
	j++;  
	k++;  
	}  
	}  
	  
public static<T extends Comparable<T>>void sort(T[] arr,Class Utility, int start, int end)  
	{  
	if (start<end)  
	{  
	int mid = (start+end)/2;  
	sort(arr,Utility,start, mid);  
	sort(arr ,Utility, mid+1, end);  
	merge(arr,Utility,start, mid, end);  
	}  

}	

/****************Vending machine***********************/

public static int vendingMachine (int rupees,int[] notes)
{	int total_notes=0;
	if(rupees==0)
	{
	return -1;
	}
	else
	for(int i=0;i<notes.length;i++ )
	{
		if(rupees>0)
		{
			total_notes=rupees/notes[i];
			if(total_notes>0)
			{
			System.out.println(notes[i]+":"+total_notes);
			}
			rupees=rupees%notes[i];
		}
	}return rupees;
	
}


/*****************************Week Day*******************************/
	
	/**This method find day of any entered date 
	 * @param m store month given by user
	 * @param d store date given by user
	 * @param y is year given by user
	 * @return day present on that day
	 */
	public static int dayOfWeek(int m, int d, int y) 
	{			
	
		int y0=y-(14-m)/12;;
		int x = y0+(y0/4)-y0/100+y0/400;
		int m0 = m+12*((14-m)/12)-2;
		int d0 = (d+x+31*m0/12)%7;
		return d0;
	}	
	/***********************Temperature Conversion **********************/    
    
    /**This method convert temperature from celsius to fahrenheit
	 * and from fahrenheit to celsius
	 * @param temperature 
	 */
	public static void temperatureConversion(int temperature) 
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("select your choice");
		System.out.println("Press 1 for,Fahrenheit to celsius conversion  :");
		System.out.println("Press 2 for,Celsius to Fahrenheit conversion  :");
		int i=sc1.nextInt();
		switch(i)
		{
		case 1:
		float celsius = ((temperature-32) * 5)/9 ;
		System.out.println("Temperature in celsius : "+celsius);
		break;
		
		case 2:	
		float fahrenheit = (temperature *9/5+32);
		System.out.println("Temperature in fahrenheit : "+fahrenheit );
		break;
		
		default :
			System.out.println("Invalid input");
		}
	} 	
	
	
/***************************Monthly Payment ************************/
		
		/**
		 * @param P is loan amount
		 * @param Y is year 
		 * @param R is interestRate
		 * @return
		 */
		public static double monthlyPayment( int P , int Y , double R ) 
		{
			int  terms_in_month= (12 * Y);
			double monthly_rate = R / (12*100);
			double power = Math.pow((1+ monthly_rate ), -terms_in_month);
			double	monthlyPay = ((P*terms_in_month)/ (1 - power));
			return monthlyPay;
		}
			
	
/************************Sqrt using newtons method******************/
	
	/**This method is used to find square root of a nonnegative number
	 * @param c is user input
	 */
	public static void sqrtNewtons(double c)
	{
		double epsilon = 1e-15;
		double t = c;			
		while(Math.abs(t - c/t) > epsilon*t)
		{
			t=(c/t + t)/2.0;
		}
		System.out.println(" "+t);
	}
	
 /*****************************ToBinary*******************************/
	
	/**This method convert decimal number to binary number without
	 * using toBinary() function
	 * @param decimal is decimal number given by user
	 */
	public static void toBinary(int decimal)
	{
		Scanner scanner = new Scanner(System.in);
		int temp= decimal;
		int[] remainder = new int[100];
		int i=0;
		while(decimal > 0)
		{
			remainder[i] =( decimal % 2);
			decimal = decimal / 2 ;
			i++;
		}
		for(int j = i-1 ; j>=0 ; j--)
		{
			System.out.print(remainder[j]);
		}
	}
	/*********************nibbles*************************/
	public static int nibbles(int Number )
	{
		String result=" ";
		while(Number>0)
		{
			int remainder=Number%2;
			result+=remainder;
			Number=Number/2;
		}
		result=0+result;
		String left=result.substring(0,4);
		String right=result.substring(4);
		String binary_value=right+right;
		
		int pos=0;
		int sum=0;
		for(int i=binary_value.length()-1;i>=0;i--)
		{
			char j=binary_value.charAt(pos);
			pos++;
			int num=Character.getNumericValue(j);
			 sum=(int)(num*Math.pow(2, i)+sum);
		}return sum;
	}
}

