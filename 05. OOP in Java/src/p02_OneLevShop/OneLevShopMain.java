package p02_OneLevShop;

import p02_OneLevShop.Abstract.Product;
import p02_OneLevShop.Utility.PurchaseManager;

import java.time.LocalDate;

public class OneLevShopMain {
	public static void main(String[] args) {
		Product cigarettes = new FoodProduct("cigarettes", 6.90, 1400, AgeRestriction.Adult);
		Product milk = new FoodProduct("beer", 1.50, 20, "25.11.2015", AgeRestriction.Adult);
		Product cheese = new FoodProduct("cheese", 9.5, 1, "05.11.2015");

		Customer gosho = new Customer("Gosho", 18, 30.00);

		PurchaseManager.processPurchase(milk, gosho);
		PurchaseManager.processPurchase(cheese, gosho);
		PurchaseManager.processPurchase(cheese, gosho); // he can't buy it because it's out of stock
	}
}
