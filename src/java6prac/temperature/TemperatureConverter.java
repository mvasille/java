package java6prac.temperature;

interface Convertible {
    double convert(double celsius);
}

class TemperatureConverter implements Convertible {
    @Override
    public double convert(double celsius) {
        // Конвертация в Кельвины
        double kelvin = celsius + 273.15;

        // Конвертация в Фаренгейты
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println(celsius + "°C равно:");
        System.out.println(kelvin + "K");
        System.out.println(fahrenheit + "°F");

        return kelvin;
    }
}

