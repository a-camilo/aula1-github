package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {
		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			Employee emp = new Employee();
			System.out.println("Nome: " );
			emp.name = sc.nextLine();
			System.out.println("Salary: ");
			emp.salary = sc.nextDouble();
			System.out.println("Tax: ");
			emp.tax = sc.nextDouble();
			System.out.println();
			System.out.println("Employee: "+emp);
			System.out.println();
			System.out.println("Percentage to increse salary: "+ emp);
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
			
			System.out.println();
			System.out.println("Uppdate data: "+emp);
			
			
			sc.close();
		}
}
