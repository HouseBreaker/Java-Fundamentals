package p02_OneLevShop;

import p02_OneLevShop.Abstract.Product;
import p02_OneLevShop.Interfaces.Expirable;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FoodProduct extends Product implements Expirable {
	private static final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
	private static final String NO_EXPIRATION = "31.12.999999999";

	private LocalDate expirationDate;
	private AgeRestriction ageRestriction;

	public FoodProduct(String name, double price, int quantity, String expirationDate) {
		super(name, price, quantity);

		this.setExpirationDate(expirationDate);
		this.setAgeRestriction(AgeRestriction.None);
	}

	public FoodProduct(String name, double price, int quantity, AgeRestriction ageRestriction) {
		super(name, price, quantity, ageRestriction);
		this.setExpirationDate(NO_EXPIRATION);
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
