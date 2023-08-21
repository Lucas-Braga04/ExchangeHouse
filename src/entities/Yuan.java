package entities;

public class Yuan extends Currency{


	public Yuan() {
		super("Chinese Yuan");
		setExchangeRateToReal(0.68);
	}
	
	public double convertFromReal(double amountInReal) {
		return amountInReal / getExchangeRateToReal();
	}
	
}
