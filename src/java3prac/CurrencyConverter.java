package java3prac;

import java.text.DecimalFormat;

public class CurrencyConverter {
    private double exchangeRate;

    public CurrencyConverter(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double convert(double amount) {
        return amount * exchangeRate;
    }

    public static void main(String[] args) {
        // Создаем конвертор валют с заданным курсом обмена
        CurrencyConverter converter = new CurrencyConverter(1.15); // Например, курс EUR/USD

        // Сумма в исходной валюте
        double originalAmount = 1000.0;

        // Выполняем конвертацию
        double convertedAmount = converter.convert(originalAmount);

        // Форматируем строки вывода с результатами
        DecimalFormat df = new DecimalFormat("#.##"); // Определяем формат для двух знаков после запятой
        String originalCurrency = "USD";
        String targetCurrency = "EUR";

        System.out.println("Исходная сумма: " + originalAmount + " " + originalCurrency);
        System.out.println("Конвертированная сумма: " + df.format(convertedAmount) + " " + targetCurrency);
        System.out.println("Обменный курс: 1 " + originalCurrency + " = " + converter.exchangeRate + " " + targetCurrency);
    }
}
