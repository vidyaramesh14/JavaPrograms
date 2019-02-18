package com.bridgelabz.designpattern;

import java.util.ArrayList;
import java.util.List;

public class PrototypeEmployee implements Cloneable{
private List<String> empList;
	
	public PrototypeEmployee(){
		empList=new ArrayList<String>();
	}
	
	public PrototypeEmployee(List<String> list){
		this.empList=list;
	}
	public void loadData(){
		//read all employees from database and put into the list
		empList.add("adc");
		empList.add("xyz");
		empList.add("David");
		empList.add("shree");
	}
	
	public List<String> getEmpList() {
		return empList;
	}

	@Override
	/*object cloning refers to creation of exact copy of an object.it creates a new instance of the class
	of current object and initialize all the fields.
	**/
	public Object clone() throws CloneNotSupportedException{
			List<String> temp=new ArrayList<String>();
			for(String s:this.getEmpList()){
				temp.add(s);
			}
			return new PrototypeEmployee(temp);
	}
}
