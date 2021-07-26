package entities;

public class Age {
	
	public int birthYear;
	public int actualYear;
	
	
	public int yourAge() {
		return actualYear - birthYear;
	}
	
	
}
