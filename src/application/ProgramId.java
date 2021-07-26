package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Id;

public class ProgramId {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Id> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			
			System.out.println();
			
			System.out.println("Employee #" + i + ":");
			sc.nextLine();
			
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while(hasId(list,id)) {
				System.out.println("Id, already taken! Try again ");
				id = sc.nextInt();
				}
					
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			
			Id emp = new Id(id, name, salary);
			list.add(emp);
			

		}
		
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");
		int idsalary = sc.nextInt();
		
		Id emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
//		Integer pos = position(list,idsalary);
		if(emp == null) {
			System.out.println("This Id does not exist!");
		}else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
		System.out.println();
		System.out.println("List of employees:");
		for(Id e : list) {
			System.out.println(e);
		}
		sc.close();
	}
	
		private static boolean hasId(List<Id> list, Integer id) {
		Id emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

		public static Integer position(List<Id> list, int id) {
			for(int i = 0; i<list.size();i++) {
				if(list.get(i).getId() == id) {
					return i;
				}
							
			}
			return null;
		}
}