public class Main {

    public static void main(String[] args) {
        int base = 2;
        int exponente = 3;
        long resultado = potencia(base, exponente);
        System.out.println(base + "^" + exponente + " = " + resultado);

        }

    public static long potencia(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * potencia(a, b - 1);
        }
    }
}
