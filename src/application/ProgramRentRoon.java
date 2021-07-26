package application;

import java.util.Locale;
import java.util.Scanner;

import entities.RentRoon;

public class ProgramRentRoon {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		RentRoon[] rent = new RentRoon[10];

		System.out.print("How many roons wil be rented? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			rent[room] = new RentRoon(name, email);
		}
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if (rent[i] != null) {
				System.out.println(i + ": " + rent[i]);
			}
		}

		sc.close();
	}

}
