package application;

import java.util.Locale;
import java.util.Scanner;

import entities.MediaNota;

public class ProgramMediaNota {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		MediaNota media = new MediaNota();
		
		System.out.println("Entra com as notas: ");
		media.nota1 = sc.nextDouble();
		media.nota2 = sc.nextDouble();
		media.nota3 = sc.nextDouble();
		
		System.out.printf("Final Grade = %.2f", media.media());
		
		if (media.media() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", media.media());
			}
			else {
			System.out.println("PASS");
			}
		
		sc.close();
	}

}
