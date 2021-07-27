package entities;

public class BusinessAccount2 extends Account2 {
	private Double loanLimt;
	
	public BusinessAccount2() {
		super();
	}

	public BusinessAccount2(Integer number, String holder, 
			Double balance, Double loanLimt) {
		
		super(number, holder, balance);
		this.loanLimt = loanLimt;
	}

	public Double getLoanLimt() {
		return loanLimt;
	}

	public void setLoanLimt(Double loanLimt) {
		this.loanLimt = loanLimt;
	}
	public void loan(Double amount) {
		if(amount <= loanLimt) {
		balance += amount - 10.0;
		
		}
	}
	@Override
	public void withDraw(double amount) {
		super.withDraw(amount);
		balance -=2.0;
	}
	
}
