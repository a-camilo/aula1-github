package util;

public class ConverterCoin {
				
	public  static  double IOF = 0.06;
	
	public static double coin(double amount, double dollarPrice) {
		
		return  amount * dollarPrice * (1.0 + IOF);
	}
}
