package p02_OneLevShop.ElectronicProducts;

import p02_OneLevShop.Abstract.ElectronicsProduct;

import java.time.LocalDate;

public class Computer extends ElectronicsProduct {
	private static final int warrantyMonths = 24;

	public Computer(String name, double price, int quantity, String purchaseDate) {
		super(name, price, quantity, warrantyDate(purchaseDate, warrantyMonths));
	}

	@Override
	public double getPrice() {
		int quantityForDeal = 1000;
		if (this.getQuantity() > quantityForDeal) {
			return this.price * 0.95;
		}
		return price;
	}
}
