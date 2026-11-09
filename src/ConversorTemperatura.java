/**
 * Conversión de temperaturas con validación del cero absoluto.
 */
public class ConversorTemperatura {
    public static double aFahrenheit(double celsius) {
        if (!Double.isFinite(celsius) || celsius < -273.15)
            throw new IllegalArgumentException("Temperatura Celsius no válida");
        return celsius * 9.0 / 5.0 + 32;
    }
    public static double aCelsius(double fahrenheit) {
        if (!Double.isFinite(fahrenheit) || fahrenheit < -459.67)
            throw new IllegalArgumentException("Temperatura Fahrenheit no válida");
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
    public static void main(String[] args) {
        System.out.println("0 °C = " + aFahrenheit(0) + " °F");
        System.out.println("212 °F = " + aCelsius(212) + " °C");
    }
}
