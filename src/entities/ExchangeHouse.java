package entities;

public class ExchangeHouse {

	private Euro euro;
	private Dollar dolar;
	private Yuan yuan;
	
	public ExchangeHouse() {
		euro = new Euro();
		dolar = new Dollar();
		yuan = new Yuan();
	}
	
	public Euro getEuro() {
		return euro;
	}
	public Dollar getDollar() {
		return dolar;
	}
	public Yuan getYuan() {
		return yuan;
	}
	
}