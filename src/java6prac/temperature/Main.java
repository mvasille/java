package java6prac.temperature;

public class Main {
    public static void main(String[] args) {
        Convertible converter = new TemperatureConverter();

        double celsiusTemperature = 25.0;
        double kelvinTemperature = converter.convert(celsiusTemperature);
    }
}
