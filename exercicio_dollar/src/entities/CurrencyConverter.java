package entities;

public class CurrencyConverter {
	public static double priceDollar;
	public static double dollars;
	
	public static double result(){
		double percent = 6 * (priceDollar * dollars) / 100 ;
		return priceDollar * dollars + percent;
	}

}
