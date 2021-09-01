package udemy;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		Product p = new Product(name, price);
		System.out.print("Quantity in stock: ");
		p.addProducts(sc.nextInt());

		System.out.println();
		System.out.println("Product data: " + p.toString());
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		p.addProducts(sc.nextInt());
		System.out.println();
		System.out.println("Updated data: " + p.toString());
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		p.removeProducts(sc.nextInt());
		System.out.println();
		System.out.print("Updated data: " + p.toString());
		
		sc.close();
	}
}
