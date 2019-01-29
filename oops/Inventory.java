package com.bridgelabz.oops;

import java.io.File;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.utility.Utility;

public class Inventory 
{
	public static void main(String[] args) {
		File file=new File("/home/admin1/Desktop/vidya/JAVA_PROGRAM/src/com/bridgelabz/oops/inventory.json");
        JSONObject inventory=(JSONObject)Utility.readJsonFile(file);
        
        //get the rice items
        JSONArray riceList=(JSONArray)inventory.get("Rice");
        Long totalRiceAvailble=0L;
        System.out.println("\t\t\tRice Deatails");
        System.out.println("\tSL No \tName \t\t\t\tQuantity  \t Price");
    
        JSONObject rice=null;
        for(int i=0;i<riceList.size();i++) {
        	rice=(JSONObject)riceList.get(i);
        	totalRiceAvailble+=(Long)rice.get("weight");
        	System.out.printf("\t%d \t%s \t\t%d \t\t %f",i+1,rice.get("name"),rice.get("weight"),rice.get("price"));
        	System.out.println();
        }
        System.out.println("\n\t Total Rice Availbale = "+totalRiceAvailble+"Kgs");
        System.out.println("\t****************************************************************\n\n");
        
        
      //get the pulses
        JSONArray pulseList=(JSONArray)inventory.get("Pulse");
        Long totalPulseAvailble=0L;
        System.out.println("\t\t\t Pulses Deatails");
        System.out.println("\tSL No\tName \t\t\t\t Quantity \t Price");
       
        JSONObject pulse=null;
        for(int i=0;i<pulseList.size();i++)
        {
        	pulse=(JSONObject)pulseList.get(i);
        	totalPulseAvailble=totalPulseAvailble+(Long)pulse.get("weight");
        	System.out.printf("\t%d \t%s \t\t\t %d \t\t %d",i+1,pulse.get("name"),pulse.get("weight"),pulse.get("price"));
        	System.out.println();
        }
        System.out.println("\n\t Total Pulses Availbale = "+totalPulseAvailble+"Kgs");
        System.out.println("\t****************************************************************\n\n");
        //get the wheat
        JSONArray wheatsList=(JSONArray)inventory.get("Wheat");
        Long totalWheatAvailble=0L;
        System.out.println("\t\t\t Wheats Deatails");
        System.out.println("\tSL No\tName \t\t\t\tQuantity \t Price");
       
        JSONObject wheat=null;
        for(int i=0;i<wheatsList.size();i++)
        {
        	wheat=(JSONObject)wheatsList.get(i);
        	totalWheatAvailble+=(Long)wheat.get("weight");
        	System.out.printf("\t%d \t%s \t\t %d \t\t %f",i+1,wheat.get("name"),wheat.get("weight"),wheat.get("price"));
        	System.out.println();
        }
        System.out.println("\n\t Total Wheats Availbale ="+totalWheatAvailble+"Kgs");
        System.out.println("\t****************************************************************\n\n");
}

}

