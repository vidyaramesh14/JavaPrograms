package com.bridgelabz.designpattern;

import java.util.List;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		PrototypeEmployee employee=new PrototypeEmployee();
		employee.loadData();
		PrototypeEmployee new1= (PrototypeEmployee)employee.clone();
		PrototypeEmployee new2= (PrototypeEmployee)employee.clone();
		List<String> list1=new1.getEmpList();
		list1.add("vidya");
		List<String> list2=new2.getEmpList();
		list2.add("chandu");
		list2.add("aadhi");
		list2.remove("David");
		System.out.println("Employee list"+employee.getEmpList());
		System.out.println("list1"+list1);
		System.out.println("list2"+list2);
		
		
	}

}
