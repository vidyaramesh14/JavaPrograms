package com.bridgelabz.designpattern;

import java.util.Scanner;

public class TestSingleton {
 public static void main(String[] args)
 {
	 Scanner sc1=new Scanner(System.in);
	 System.out.println("EagerIni->1\nLazyEager->2\nstatic_block->3\nThread_safe->4\nBill_Pugh->5\nEnum->6"); 
	 System.out.println("\nEnter your choice");
	 int input=sc1.nextInt();
	
	 switch(input)
	 {
	 case 1:EagerInitializedSingleton new_instance1=EagerInitializedSingleton.getnewinstance();
	 		EagerInitializedSingleton new_instance2=EagerInitializedSingleton.getnewinstance();
	 		System.out.println("new_instance1\t"+new_instance1.hashCode());
	 		System.out.println("new_instance2\t"+new_instance2.hashCode());
	 		break;
	 		
	 case 2:LazyEagerInitialization instance1=LazyEagerInitialization.getLazyinstance();
	 		LazyEagerInitialization instance2=LazyEagerInitialization.getLazyinstance();
			System.out.println("new_instance1\t"+instance1.hashCode());
			System.out.println("new_instance2\t"+instance2.hashCode());
			break;
	
	 case 3:StaticBlockSingleton static1=StaticBlockSingleton.getNewInstance();
			StaticBlockSingleton static2=StaticBlockSingleton.getNewInstance();
			System.out.println("new_instance1\t"+static1.hashCode());
			System.out.println("new_instance2 \t"+static2.hashCode());
			break;
	 
	 case 4:TreadSafeSingle thread1=TreadSafeSingle.getNewInstance();
			TreadSafeSingle thread2=TreadSafeSingle.getNewInstance();
			System.out.println("new_instance1\t"+thread1.hashCode());
			System.out.println("new_instance2\t"+thread2.hashCode());
			break;
			
	 case 5:BillPushSingleton bill1=BillPushSingleton.getNewInstance();
	 		BillPushSingleton bill2=BillPushSingleton.getNewInstance();
			System.out.println("new_instance1\t"+bill1.hashCode());
			System.out.println("new_instance2\t"+bill2.hashCode());
			break;
	
	 case 6:SingleTonEnum esingle1=SingleTonEnum.INSTANCE;
	 		SingleTonEnum esingle2=SingleTonEnum.INSTANCE;
			System.out.println("new_instance1\t"+esingle1.hashCode());
			System.out.println("new_instance2\t"+esingle2.hashCode());
			break;
	 }
	 sc1.close();
 }
}
