package application;

import entities.Account2;
import entities.BusinessAccount2;
import entities.SavingsAccount2;

public class ProgramAccount2 {

	public static void main(String[] args) {

		Account2 acc = new Account2(1001, "Alex", 1000.00);
		acc.withDraw(200.00);
		System.out.println(acc.getBalance());
		BusinessAccount2 bacc = new BusinessAccount2(1002, "Maria", 0.0, 500.00);
		
		//UPCASTING
		
		Account2 acc1 = bacc;
		Account2 acc2 = new BusinessAccount2(1003,"Bob",1000.0,500.00);
		acc2.withDraw(200.0);
		System.out.println(acc2.getBalance());
		Account2 acc3 = new SavingsAccount2(1004,"Anna",1000.0,0.01);
		acc3.withDraw(200.00);
		System.out.println(acc3.getBalance());
		//DownCasting
		
		BusinessAccount2 acc4 = (BusinessAccount2)acc2;
		acc4.loan(100.00);
		
//		BusinessAccount2 acc5 = (BusinessAccount2)acc3;
		if(acc3 instanceof BusinessAccount2) {
			BusinessAccount2 acc5 = (BusinessAccount2)acc3;
			acc5.loan(200.00);
			System.out.println("Loan!");
		}
		if(acc3 instanceof SavingsAccount2) {
			SavingsAccount2 acc5 = (SavingsAccount2)acc3;
			acc5.upDateBalance();
			System.out.println("Update");
		}
		
	}

}
