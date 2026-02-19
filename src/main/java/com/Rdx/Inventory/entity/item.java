package com.Rdx.Inventory.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class item {

	@Id
	int ItemId;
	String ItemName;
	double price;
	int stock;
	public int getItemId() {
		return ItemId;
	}
	
	public void setItemId(int itemId) {
		ItemId = itemId;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return "inventory [ItemId=" + ItemId + ", ItemName=" + ItemName + ", price=" + price + ", stock=" + stock + "]";
	}
	
	
}
