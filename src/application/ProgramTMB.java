package application;

import java.util.Locale;
import java.util.Scanner;

import entities.TMB;

public class ProgramTMB {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		TMB tmb = new TMB();
		System.out.println("Informe seu genero: (m/f)");
		tmb.genero = sc.nextBoolean();
		System.out.println("Informe seu peso em Kg: ");
		tmb.peso = sc.nextDouble();
		System.out.println("Informe sua altura em cm: ");
		tmb.altura = sc.nextInt();
		System.out.println("Informe sua idade: ");
		tmb.idade = sc.nextInt();

		System.out.printf("Sua taxa de metabolismo basal é: %.2f%n" , tmb.calculoBasal());
//		System.out.printf("Sua taxa de metabolismo basal é: %.2f%n" , tmb.calculoBasalFem());
		sc.close();
	}

}
