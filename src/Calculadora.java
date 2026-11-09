/**
 * Operaciones básicas y control de la división por cero.
 */
public class Calculadora {
    public static double sumar(double a, double b) { return a + b; }
    public static double restar(double a, double b) { return a - b; }
    public static double multiplicar(double a, double b) { return a * b; }
    public static double dividir(double a, double b) {
        if (b == 0) throw new IllegalArgumentException("El divisor no puede ser cero");
        return a / b;
    }
    public static void main(String[] args) {
        System.out.println("Suma: " + sumar(12, 4));
        System.out.println("Resta: " + restar(12, 4));
        System.out.println("Producto: " + multiplicar(12, 4));
        System.out.println("Cociente: " + dividir(12, 4));
        try {
            dividir(12, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Validación: " + e.getMessage());
        }
    }
}
