package entities;

public class Dollar extends Currency{

	public Dollar() {
		super("Dólar");
		setExchangeRateToReal(4.97);
	}

	public double convertFromReal(double amountInReal) {
		return amountInReal / getExchangeRateToReal();
	}
	
}
