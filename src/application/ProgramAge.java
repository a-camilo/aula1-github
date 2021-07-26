package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Age;

public class ProgramAge {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Age age = new Age();
		System.out.println("Informe ano de nascimento: ");
		age.birthYear = sc.nextInt();
		System.out.println("Informe ano atual: ");
		age.actualYear = sc.nextInt();
		System.out.println("Sua idade é: "+ age.yourAge());
		sc.close();

	}

}
