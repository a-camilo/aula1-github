package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramProduct {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		Product product = new Product(name, price);
		
		product.setName("Computador");
		System.out.println("Uppadated name: "+ product.getName());
		product.setPrice(1000.00);
		System.out.printf("Uppdate price: $%.2f%n",product.getPrice());
		
		
		System.out.println();
		System.out.println("Product data: "+product);
		System.out.println();
		System.out.println("Enter with product to be addes on stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println("Uppdated data: "+product);
		System.out.println();
		System.out.println("Enter with product to be removed on stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println("Remove data: "+product);

		sc.close();
	}
}
