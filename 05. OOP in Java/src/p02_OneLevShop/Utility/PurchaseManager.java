package p02_OneLevShop.Utility;

import com.sun.xml.internal.ws.util.StringUtils;
import p02_OneLevShop.Abstract.Product;
import p02_OneLevShop.Customer;
import p02_OneLevShop.FoodProduct;

import java.time.LocalDate;

public final class PurchaseManager {
	private PurchaseManager() {
		throw new RuntimeException("Class should not be instantiated."); // to avoid instantiation through reflection
	}

	public static void processPurchase(Product product, Customer customer) {
		if (product.getQuantity() <= 0) {
			System.err.printf("%s is out of stock, %s!\r\n", StringUtils.capitalize(product.getName()), customer.getName());
			return;
		}

		int[] ageRestrictionAges = {0, 15, 18};
		boolean customerIsTooYoung = customer.getAge() < ageRestrictionAges[product.getAgeRestriction().ordinal()];

		if (customerIsTooYoung) {
			System.err.printf("%s is too young to buy %s!\r\n", customer.getName(), product.getName());
			return;
		}

		if (product.getClass() == FoodProduct.class) {
			boolean productIsExpired = LocalDate.now().isAfter(((FoodProduct) product).getExpirationDate());

			if (productIsExpired) {
				System.err.printf("The %s is expired. %s cannot buy this product!\r\n",
						product.getName(), customer.getName());
				return;
			}
		}

		double netBalance = customer.getBalance() - product.getPrice();

		if (netBalance < 0) {
			System.err.printf("%s does not have enough money to buy %s!\r\n",
					customer.getName(), product.getName());
			return;
		}

		// if all the checks passed we process the purchase
		product.setQuantity(product.getQuantity() - 1);
		customer.setBalance(netBalance);

		System.out.printf("%s bought %s for %.2f BGN!\r\n",
				customer.getName(), product.getName(), product.getPrice());

		String isOrAre = product.getQuantity() <= 1 ? "is" : "are";
		String pluralOrNot = product.getQuantity() <= 1 ? "" : "s";
		System.out.printf("There %s %d %s%s left in the store.\r\n\r\n",
				isOrAre, product.getQuantity(), product.getName(), pluralOrNot);
	}
}
