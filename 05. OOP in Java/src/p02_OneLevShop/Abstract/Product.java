package p02_OneLevShop.Abstract;

import p02_OneLevShop.AgeRestriction;
import p02_OneLevShop.Interfaces.Buyable;

public abstract class Product implements Buyable {
	protected String name;
	protected double price;
	protected int quantity;
	protected AgeRestriction ageRestriction;

	protected Product(String name, double price, int quantity) {
		this.setName(name);
		this.setQuantity(quantity);
		this.setPrice(price);
		this.setAgeRestriction(ageRestriction);
	}

	protected Product(String name, double price, int quantity, AgeRestriction ageRestriction) {
		this(name, price, quantity);
		this.setAgeRestriction(ageRestriction);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public AgeRestriction getAgeRestriction() {
		return ageRestriction;
	}

	public void setAgeRestriction(AgeRestriction ageRestriction) {
		this.ageRestriction = ageRestriction;
	}
}
