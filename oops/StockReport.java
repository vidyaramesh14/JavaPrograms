package com.bridgelabz.oops;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.utility.Utility;

public class StockReport {

	public static void main(String[] args) {
		
		File file=new File("/home/admin1/Desktop/vidya/JAVA_PROGRAM/src/com/bridgelabz/oops/Stock.json");
		JSONObject obj=(JSONObject)Utility.readJsonFile(file);
		
		JSONArray Turtlemint=(JSONArray)obj.get("Turtlemint");
		System.out.println("\t\t\tTurtlemint");
		System.out.println("\tSHARE_NAME\t SHARE\tPRICE");
		for(int i=0;i<Turtlemint.size();i++)
		{	JSONObject Turtle=(JSONObject)Turtlemint.get(i);
			System.out.printf("\t%s \t%d \t%d",Turtle.get("name"),Turtle.get("share"),Turtle.get("price"));
		}
		
		JSONArray meru=(JSONArray)obj.get("Meru");
		System.out.println("\t\t\tTurtlemint");
		System.out.println("\tSHARE_NAME\t SHARE\tPRICE");
		for(int i=0;i<meru.size();i++)
		{	JSONObject meru_temp=(JSONObject)meru.get(i);
			System.out.printf("\t%s \t%d \t%d",meru_temp.get("name"),meru_temp.get("share"),meru_temp.get("price"));
		}
		
		
	
	}

}
