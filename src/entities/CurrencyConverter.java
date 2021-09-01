package entities;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double converter(double price, double quantity) {
		double value = price*quantity;
		return value*IOF + value;
	}
}