package p02_OneLevShop;

import com.sun.xml.internal.ws.util.StringUtils;
import p02_OneLevShop.Abstract.Product;
import p02_OneLevShop.ElectronicProducts.Appliance;
import p02_OneLevShop.ElectronicProducts.Computer;
import p02_OneLevShop.Interfaces.Expirable;
import p02_OneLevShop.Utility.PurchaseManager;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class OneLevShopMain {
	public static void main(String[] args) {
		Product cigar = new FoodProduct("cigar", 6.90, 1400, AgeRestriction.Adult);
		Product beer = new FoodProduct("beer", 1.50, 20, "25.11.2015", AgeRestriction.Adult);
		Product cheese = new FoodProduct("cheese", 9.5, 1, "05.11.2015");
		Product asus = new Computer("Asus PC", 750, 6000, "01.01.2015");
		Product microwave = new Appliance("Bosch Microwave", 320, 340, "01.12.2015");
		Product expiredCheese = new FoodProduct("expired cheese", 3.00, 5, "05.10.2015");

		Customer gosho = new Customer("Gosho", 18, 30);
		Customer barovec = new Customer("Pesho Kamika", 25, 3000);
		Customer nakov = new Customer("Nakov", 35, Double.MAX_VALUE);
		Customer ivancho = new Customer("Ivancho", 8, 2.50);
		Customer boikoTheBum = new Customer("Boiko the bum", 33, 1.20);

		PurchaseManager.processPurchase(microwave, barovec);
		PurchaseManager.processPurchase(cigar, barovec);

		PurchaseManager.processPurchase(beer, gosho);
		PurchaseManager.processPurchase(cheese, gosho);
		PurchaseManager.processPurchase(asus, nakov);

		PurchaseManager.processPurchase(cheese, gosho); // gosho can't buy cheese because it's out of stock
		PurchaseManager.processPurchase(cigar, ivancho); // ivancho is too young for cigars
		PurchaseManager.processPurchase(beer, boikoTheBum); // not enough money
		PurchaseManager.processPurchase(expiredCheese, gosho); // it's expired. obviously.

		List<Product> listOfProducts = Arrays.asList(
				new FoodProduct("cigarettes", 6.90, 1400, AgeRestriction.Adult),
				new FoodProduct("beer", 1.50, 20, "25.11.2015", AgeRestriction.Adult),
				new FoodProduct("cheese", 9.5, 1, "05.11.2015"),
				new Computer("Asus PC", 750, 6000, "01.01.2015"),
				new Appliance("Bosch Microwave", 320, 340, "01.12.2015"),
				new FoodProduct("expired cheese", 3.00, 5, "05.10.2015")
		);

		getSoonestExpiringProduct(listOfProducts);
		sortAdultProductsByPrice(listOfProducts);
	}

	static void sortAdultProductsByPrice(List<Product> listOfProducts) {
		Comparator<Product> byPrice = (p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice());
		ArrayList<Product> adultProductsSortedByPrice = new ArrayList<>(listOfProducts.stream()
				.filter(p -> p.getAgeRestriction() == AgeRestriction.Adult)
				.sorted(byPrice)
				.collect(Collectors.toList()));

		System.out.println();
		System.out.println("Adult products sorted by price:");
		for (Product product : adultProductsSortedByPrice) {
			System.out.printf("%s -> %.2f\r\n", product.getName(), product.getPrice());
		}
	}

	static void getSoonestExpiringProduct(List<Product> listOfProducts) {
		Comparator<Product> byExpirationDate = (p1, p2) -> {
			Expirable product1 = (Expirable) p1;
			Expirable product2 = (Expirable) p2;

			LocalDate expirationDate1 = product1.getExpirationDate();
			LocalDate expirationDate2 = product2.getExpirationDate();

			return expirationDate1.isBefore(expirationDate2) ? -1 : expirationDate1.isAfter(expirationDate2) ? 1 : 0;
		};

		Optional<Product> soonestExpiringProductOptional = listOfProducts.stream()
				.filter(a -> a instanceof Expirable)
				.sorted(byExpirationDate)
				.findFirst();

		FoodProduct soonestExpiringProduct = ((FoodProduct) soonestExpiringProductOptional.get());
		String soonestExpiringProductDate = soonestExpiringProduct.getExpirationDate().format(Product.dateFormat);

		System.out.printf("%s is the soonest expiring product, expiring on %s\r\n",
				StringUtils.capitalize(soonestExpiringProduct.getName()), soonestExpiringProductDate);
	}
}
