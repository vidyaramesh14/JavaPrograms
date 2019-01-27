package com.bridgelabz.oops;

import java.util.List;

public class Inventory {

}
class InventoryFactory
{

private List<Product> inventory;

public void setInventory(List<Product> inventory)
{
	this.inventory=inventory;
}
public List<Product> getInventory()
{
	return inventory;
}

}