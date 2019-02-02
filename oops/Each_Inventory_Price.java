package com.bridgelabz.oops;

import java.util.List;

public class Each_Inventory_Price 
{
	 //To print Each Inventory Price
	static int	 count=0;
		
	public static void main(String[] args)
	{	InventoryFactory inventoryFactory=new InventoryFactory();
		List<Product> products=inventoryFactory.getInventoryFactory();
	
		System.out.println(" Inventory Price");
		System.out.println();
		System.out.println("Price of each Inventory : ");
		while(count!=inventoryFactory.getInventoryFactory().size()) 
		{
		Product prod=products.get(count);
		for(ProductProperties  produproperty: prod.getProperties())
		{
			System.out.print(produproperty.getName()+" - ");
			double eachinventory=(produproperty.getPrice());
			System.out.println(eachinventory);
		}
		count++;
		}
	}
}
