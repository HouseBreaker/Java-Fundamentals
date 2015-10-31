package p02_OneLevShop.Abstract;

import p02_OneLevShop.AgeRestriction;
import p02_OneLevShop.Interfaces.Buyable;

import java.time.format.DateTimeFormatter;

public abstract class Product implements Buyable {
	public static final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");

	protected String name;
	protected double price;
	protected int quantity;
	protected AgeRestriction ageRestriction = AgeRestriction.None;

	protected Product(String name, double price, int quantity) {
		this.setName(name);
		this.setQuantity(quantity);
		this.setPrice(price);
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
