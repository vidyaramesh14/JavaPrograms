package com.bridgelabz.oops;

public class Stock {
	private String sharename;
	private int shares;
	private  double price;
	
	public String getShareName() {
		return sharename;
	}
	public void setName(String sharename) {
		this.sharename=sharename;
	}
	public int getShares() {
		return shares;
	}
	public void setNumberOfShares(int shares) {
		this.shares=shares;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	/**
	 * gives the total stock value of a firm
	 * @return total stock value
	 */
	public double getTotalStockValue() {
		return getShares()*getPrice();
}

}
