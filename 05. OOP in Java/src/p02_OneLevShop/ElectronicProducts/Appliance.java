package p02_OneLevShop.ElectronicProducts;

import p02_OneLevShop.Abstract.ElectronicsProduct;

public class Appliance extends ElectronicsProduct {
	private static final int warrantyMonths = 6;

	public Appliance(String name, double price, int quantity, String purchaseDate) {
		super(name, price, quantity, warrantyDate(purchaseDate, warrantyMonths));
	}

	@Override
	public double getPrice() {
		int quantityForDeal = 50;
		if (this.getQuantity() < quantityForDeal) {
			return this.price * 1.05;
		}
		return price;
	}
}
