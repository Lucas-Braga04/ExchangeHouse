/*package application;

import java.util.Scanner;

import entities.Currency;
import entities.ExchangeHouse;

public class ExchangeHouseAPP {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ExchangeHouse exchangeHouse = new ExchangeHouse();

        System.out.println("Digite a taxa de câmbio para Euro (por 1 Real): ");
        exchangeHouse.getEuro().setExchangeRateToReal(in.nextDouble());

        System.out.println("Digite a taxa de câmbio para Dólar (por 1 Real): ");
        exchangeHouse.getDollar().setExchangeRateToReal(in.nextDouble());

        System.out.println("Digite a taxa de câmbio para Yuan (por 1 Real): ");
        exchangeHouse.getYuan().setExchangeRateToReal(in.nextDouble());

        System.out.println("Digite o valor em Reais que deseja converter: ");
        double amountInReal = in.nextDouble();

        System.out.println("Qual moeda deseja comprar:\n1 - Euro\n2 - Dólar\n3 - Chinese Yuan");
        int choice = in.nextInt();

        Currency selectedCurrency = null;

        switch (choice) {
            case 1:
                selectedCurrency = exchangeHouse.getEuro();
                break;
            case 2:
                selectedCurrency = exchangeHouse.getDollar();
                break;
            case 3:
                selectedCurrency = exchangeHouse.getYuan();
                break;
            default:
                System.out.println("Opção inválida");
        }

        if (selectedCurrency != null) {
            performConversion(selectedCurrency, amountInReal);
        }

        in.close();
    }

    private static void performConversion(Currency currency, double amountInReal) {
        double convertedAmount = currency.convertFromReal(amountInReal);
        System.out.println("Com " + amountInReal + " Reais, você teria aproximadamente " + convertedAmount + " " + currency.getName() + ".");
    }

}*/

package application;

import java.text.DecimalFormat;
import java.util.Scanner;
import entities.ExchangeHouse;
import entities.Currency;

public class ExchangeHouseAPP {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ExchangeHouse exchangeHouse = new ExchangeHouse();


        System.out.println("Taxas de câmbio predefinidas:");
        System.out.println("1 Euro = 5.41 Reais");
        System.out.println("1 Dólar = 4.97 Reais");
        System.out.println("1 Yuan = 0.68 Reais");

        System.out.println("\nDigite o valor em Reais que deseja pagar: ");
        double amountInReal = in.nextDouble();

        System.out.println("Qual moeda deseja comprar:\n1 - Euro\n2 - Dólar\n3 - Chinese Yuan");
        int choice = in.nextInt();

        Currency selectedCurrency = null;

        switch (choice) {
            case 1:
                selectedCurrency = exchangeHouse.getEuro();
                break;
            case 2:
                selectedCurrency = exchangeHouse.getDollar();
                break;
            case 3:
                selectedCurrency = exchangeHouse.getYuan();
                break;
            default:
                System.out.println("Opção inválida");
        }

        if (selectedCurrency != null) {
            performConversion(selectedCurrency, amountInReal);
        }

        in.close();
    }

    private static void performConversion(Currency currency, double amountInReal) {
        double convertedAmount = currency.convertFromReal(amountInReal);
        
        DecimalFormat df = new DecimalFormat("#.00");
        String formattedAmount = df.format(convertedAmount);
        
        System.out.println("Com " + amountInReal + " Reais, você teria aproximadamente " + formattedAmount + " " + currency.getName() + ".");
    }
}
