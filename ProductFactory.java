package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.github.javafaker.Faker;

public class ProductFactory {
	
	public static List<Product> products;
	
	
	public static Product getProduct(String name) {
		return null;
	}
	
	public static Product getFakeProduct() {
		return null;
	}
	
	public static List<Product> getManyFakeProducts(int quantity) {
	
		Faker faker = new Faker();
		
		products = new ArrayList<>();
		
		while( products.size() < quantity) {
			
			products.add(new Product(
					faker.commerce().productName(),
					new Money(faker.currency().name(), (float)faker.number().randomDouble(2, 0, 1000)),
					Integer.valueOf(faker.number().numberBetween(0, 1000)),
					faker.date().birthday(),
					faker.country().name(),
					new Category(faker.commerce().department())
					) );
		}
		
		return products;
	}
	
	public static void printAllProducts(List<Product> products) {
		products.forEach(System.out::println);
	}
	
	static private class Product implements ProductInterface {
		private String name;
		private Money price;
		private Integer quantity;
		private Date expiration;
		private String manufactured;
		private Category category;


		
		public Product(String name, Money price, Integer quantity, Date expiration, String manufactured,
				Category category) {
			super();
			this.name = name;
			this.price = price;
			this.quantity = quantity;
			this.expiration = expiration;
			this.manufactured = manufactured;
			this.category = category;
		}

		public String getName() {		
			return this.name;
		}
		
		public void setName(String name) {
			this.name = name;
		}

		public Money getPrice() {
			return this.price;
		}

		public void setPrice(Money price) {
			this.price = price;
			
		}

		public Integer getQuantity() {
			return this.quantity;
		}
		
		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
			
		}

		public Date getExpiration() {
			return this.expiration;
		}

		public void setExpiration(Date expiration) {
			this.expiration = expiration;
		}

		public String getManufactured() {
			return this.manufactured;
		}

		public void setManufactured(String manufactured) {
			this.manufactured = manufactured;
			
		}

		public Category getCategory() {
			return this.category;
		}

		public void setCategory(Category category) {
			this.category = category;
			
		}

		@Override
		public String toString() {
			return "Product: " + this.getName() + ", price: " + this.getPrice() + ", quantity: " + this.getQuantity() + ", exp: "
					+ this.getExpiration() + ", manufactured in:" + this.getManufactured() + ", " + this.getCategory();
		}
		
		
		
	}

}
