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
	public Object clone() throws CloneNotSupportedException{
			List<String> temp=new ArrayList<String>();
			for(String s:this.getEmpList()){
				temp.add(s);
			}
			return new PrototypeEmployee(temp);
	}
}
