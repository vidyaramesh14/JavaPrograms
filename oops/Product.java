
package com.bridgelabz.oops;

import java.util.List;

public class Product 
{	
	private String productName;
	private List<ProductProperties> properties;
	public String getProductName() 
	{
		return productName;
	}
	public void setProductName(String productName)
	{
		this.productName=productName;
	}
	public List<ProductProperties> getProperties() 
	{
		return properties;
	}
	public void setProperties(List<ProductProperties> properties)
	{
		this.properties=properties;
	}

}


