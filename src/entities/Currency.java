package entities;

/*public abstract class Currency {
	
	private String name;
    private double exchangeRateToReal;

    public Currency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getExchangeRateToReal() {
        return exchangeRateToReal;
    }

    public void setExchangeRateToReal(double exchangeRateToReal) {
        this.exchangeRateToReal = exchangeRateToReal;
    }

    public abstract double convertFromReal(double amountInReal);

    public double convertToReal(double amount) {
        return amount / exchangeRateToReal;
    }
}*/
public abstract class Currency {
    private String name;
    private double exchangeRateToReal;

    public Currency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getExchangeRateToReal() {
        return exchangeRateToReal;
    }
    
    public void setExchangeRateToReal(double exchangeRateToReal) {
    	this.exchangeRateToReal = exchangeRateToReal;
    }

    public abstract double convertFromReal(double amountInReal);

    public double convertToReal(double amount) {
        return amount / exchangeRateToReal;
    }
}