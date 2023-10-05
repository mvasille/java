package java3prac;

import java.text.DecimalFormat;
import java.util.Scanner;

public class OnlineStoreApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        // Задаем курс обмена для выбранных валют (например, USD и EUR)
        double exchangeRateUSDToEUR = 0.85; // 1 USD = 0.85 EUR

        System.out.print("Введите стоимость товара в USD: ");
        double priceInUSD = scanner.nextDouble();

        // Выбор валюты для оплаты
        System.out.println("Выберите валюту для оплаты:");
        System.out.println("1. USD");
        System.out.println("2. EUR");

        int currencyChoice = scanner.nextInt();
        double priceInSelectedCurrency = 0;

        switch (currencyChoice) {
            case 1:
                priceInSelectedCurrency = priceInUSD;
                break;
            case 2:
                priceInSelectedCurrency = priceInUSD * exchangeRateUSDToEUR;
                break;
            default:
                System.out.println("Неверный выбор валюты.");
                return;
        }

        System.out.println("Стоимость товара в выбранной валюте: " + df.format(priceInSelectedCurrency));
    }
}

