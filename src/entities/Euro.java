package entities;

public class Euro extends Currency{
	
	public Euro() {
		super("Euro");
		setExchangeRateToReal(5.41);
		
	}
	
	public double convertFromReal(double amountInReal) {
		return amountInReal / getExchangeRateToReal();
	}

}
