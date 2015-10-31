package p02_OneLevShop;

import p02_OneLevShop.Abstract.Product;
import p02_OneLevShop.Interfaces.Expirable;

import java.time.LocalDate;

public class FoodProduct extends Product implements Expirable {
	private static final LocalDate NO_EXPIRATION = LocalDate.MAX;

	private LocalDate expirationDate;
	private AgeRestriction ageRestriction;

	public FoodProduct(String name, double price, int quantity, String expirationDate) {
		super(name, price, quantity);

		this.setExpirationDate(expirationDate);
		this.setAgeRestriction(AgeRestriction.None);
	}

	public FoodProduct(String name, double price, int quantity, AgeRestriction ageRestriction) {
		super(name, price, quantity, ageRestriction);
		this.expirationDate = NO_EXPIRATION;
	}

	public FoodProduct(String name, double price, int quantity, String expirationDate, AgeRestriction ageRestriction) {
		this(name, price, quantity, expirationDate);
		this.setAgeRestriction(ageRestriction);
	}

	@Override
	public double getPrice() {
		LocalDate currentDate = LocalDate.now();
		LocalDate expirationThreshold = this.expirationDate.minusDays(15);

		if (currentDate.isAfter(expirationThreshold)) {
			return this.price * 0.7;
		}
		return this.price;
	}

	@Override
	public LocalDate getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = LocalDate.parse(expirationDate, dateFormat);
	}

	@Override
	public AgeRestriction getAgeRestriction() {
		return ageRestriction;
	}

	@Override
	public void setAgeRestriction(AgeRestriction ageRestriction) {
		this.ageRestriction = ageRestriction;
	}
}
