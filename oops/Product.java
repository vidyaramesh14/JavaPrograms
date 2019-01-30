
package com.bridgelabz.oops;

import java.util.List;

public class Product 
{
	String product_name;
	List<ProductList> product_property;
	
	public void setProductName(String product_name)
	{
		this.product_name=product_name;
	}
	public String getProductName()
	{
		return product_name;
	}
	public void setProductProperty(List<ProductList> product_property)
	{
		this.product_property=product_property;
	}
	public List<ProductList> getProductProperty()
	{
		return product_property;
	}

}
