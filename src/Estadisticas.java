/**
 * Recorrido de arrays para calcular media, mínimo y máximo.
 */
public class Estadisticas {
    private static void validar(double[] valores) {
        if (valores == null || valores.length == 0)
            throw new IllegalArgumentException("Introduce al menos un valor");
        for (double valor : valores)
            if (!Double.isFinite(valor))
                throw new IllegalArgumentException("Los valores deben ser finitos");
    }
    public static double media(double[] valores) {
        validar(valores);
        double suma = 0;
        for (double valor : valores) suma += valor / valores.length;
        return suma;
    }
    public static double minimo(double[] valores) {
        validar(valores);
        double resultado = valores[0];
        for (double valor : valores) resultado = Math.min(resultado, valor);
        return resultado;
    }
    public static double maximo(double[] valores) {
        validar(valores);
        double resultado = valores[0];
        for (double valor : valores) resultado = Math.max(resultado, valor);
        return resultado;
    }
    public static void main(String[] args) {
        double[] notas = {6, 8, 10};
        System.out.println("Media: " + media(notas));
        System.out.println("Mínimo: " + minimo(notas));
        System.out.println("Máximo: " + maximo(notas));
    }
}
