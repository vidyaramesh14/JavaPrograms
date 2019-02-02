package com.bridgelabz.oops;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.codehaus.jackson.map.ObjectMapper;

public class InventoryManager 
{

	public static void main(String[] args) throws IOException 
	{
		try 
		{
				//to map json to pojo obj and vice-versa
				ObjectMapper objectMapper=new ObjectMapper();
				
				//Reading from a file as json string
				File file=new File("/home/admin1/Desktop/vidya/JAVA_PROGRAM/src/Inven.json");
				InventoryFactory inventoryFactory=objectMapper.readValue(file, InventoryFactory.class);
				 List<Product> products=inventoryFactory.getInventoryFactory();
				Scanner sc1=new Scanner(System.in);
				 System.out.println("Enter the name of the product ");
					String inputProductName=sc1.next();
					
					
					boolean productFlag=products.stream().filter(prd->prd.getProductName().equals(inputProductName)).findFirst().isPresent();
					 Product product;
					 List<ProductProperties> properties=new ArrayList<ProductProperties>();
					
					//if product does not  exist
					 if(!productFlag)
					{
						product=new Product();
						product.setProductName(inputProductName);
						ProductProperties productProperty=input();
						properties.add(productProperty);
						
						//add properties to the product
						product.setProperties(properties);
						
						//adding every product to list
						products.add(product);
						
						//setting product list to file 
						 inventoryFactory.setInventoryFactory(products);
						 sc1.close();
					}
				//
					 else 
					 {
						 product=products.stream().filter(prd->prd.getProductName().equals(inputProductName)).findFirst().get();
						 //To Set the product properties 
						 properties=product.getProperties();
						ProductProperties productProperty=input();
						//Adding properties to list 
						properties.add(productProperty);
						
				}
					
					 //Writtting to a file
					objectMapper.writeValue(file, inventoryFactory);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Input Incorrect");
		}

	}
	/*
	 * To take input from user for product properties
	 * @return is class type of productproperty
	 */
	public static ProductProperties input()
	{
		Scanner sc1=new Scanner(System.in);
		ProductProperties productProperty=new ProductProperties();
		
		System.out.println("Enter the name of product type ");
		String inputPropertyName=sc1.next();
		productProperty.setName(inputPropertyName);
		System.out.println("Enter the Weight ");
		double inputPropertyWeight=sc1.nextDouble();
		productProperty.setWeight(inputPropertyWeight);
		System.out.println("Enter the Price ");
		double inputPropertyprice=sc1.nextDouble();
		productProperty.setPrice(inputPropertyprice);
		sc1.close();
		return productProperty;
		
	}

}