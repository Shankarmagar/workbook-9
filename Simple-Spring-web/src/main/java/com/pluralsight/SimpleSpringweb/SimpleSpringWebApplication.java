package com.pluralsight.SimpleSpringweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SimpleSpringWebApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		context = SpringApplication.run(SimpleSpringWebApplication.class, args);


		SimpleProductDao productDao = context.getBean(SimpleProductDao.class);

		productDao.add(new Product(23, "Macbook", "Technology", 2700.65));
		productDao.add(new Product(32, "Samsung TV", "Technology", 1700.65));

		Scanner scanner = new Scanner(System.in);

		while (true)
		{
			System.out.println("""
     				Choose an option:
     				1. Add a product
     				2. List all products
					""");
			int answer = scanner.nextInt();
			switch (answer)
			{
				case 1 -> addProduct(scanner, productDao);
				case 2 -> getProduct(productDao);
				default -> {
					return;
				}
			}
		}
	}
	private static void addProduct(Scanner scanner, ProductDao productDao) {

		System.out.println("Enter product details:");
		System.out.print("Product ID: ");
		int productId = scanner.nextInt();
		scanner.nextLine(); // Consume the newline character

		System.out.print("Name: ");
		String name = scanner.nextLine();

		System.out.print("Category: ");
		String category = scanner.nextLine();

		System.out.print("Price: ");
		double price = scanner.nextDouble();

		Product product = new Product();
		product.setProductId(productId);
		product.setName(name);
		product.setCategory(category);
		product.setPrice(price);

		productDao.add(product);

		System.out.println("Product added successfully!\n");
	}

	private static void getProduct(ProductDao productDao)
	{
		List<Product> products = productDao.getAll();
		for (Product product: products) {
			System.out.printf("""
                    						%s
                    ------------------------------------------------
                    ProductId: %d
                    Name: %s
                    Category: %s
                    Price: %.2f
                    -------------------------------------------------
					""", product.getName(),product.getProductId(), product.getName(), product.getCategory(), product.getPrice());
		}
	}

}
