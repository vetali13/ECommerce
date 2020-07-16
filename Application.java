package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.github.javafaker.Faker;

import domain.ProductFactory;

public class Application {

	public static void main(String[] args) {
		
		ProductFactory.printAllProducts(ProductFactory.getManyFakeProducts(50));
		
	}

	
}
