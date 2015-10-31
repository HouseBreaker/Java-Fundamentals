package p02_OneLevShop.Abstract;

import java.time.LocalDate;

public abstract class ElectronicsProduct extends Product {
	protected static int warrantyMonths;
	protected LocalDate warranty;

	protected ElectronicsProduct(String name, double price, int quantity, String purchaseDate) {
		super(name, price, quantity);
		this.setWarranty(LocalDate.parse(purchaseDate, dateFormat));
	}

	protected static String warrantyDate(String purchaseDate, int warrantyMonths) {
		return LocalDate.parse(purchaseDate, dateFormat)
				.plusMonths(warrantyMonths)
				.format(dateFormat);
	}

	public LocalDate getWarranty() {
		return warranty;
	}

	public void setWarranty(LocalDate warranty) {
		this.warranty = warranty;
	}
}
