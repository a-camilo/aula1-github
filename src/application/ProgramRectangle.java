package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class ProgramRectangle {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		Rectangle retangle = new Rectangle();
		
		System.out.println("Enter rectangle  width and height");
		retangle.width = sc.nextDouble();
		retangle.height = sc.nextDouble();
		
		
		System.out.println("Perimeter : " + retangle.area());
		System.out.println("Perimeter : " + retangle.perimeter());
		System.out.println("Perimeter : " + retangle.diagonal());
		
		
	
		sc.close();
	}
}
