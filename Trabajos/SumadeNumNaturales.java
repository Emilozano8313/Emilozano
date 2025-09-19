public class Main {

    public static void main(String[] args) {
        int numero = 5;
        int resultado = suma(numero);
        System.out.println("La suma de los primeros " + numero + " números es: " + resultado);

        }

    public static int suma(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + suma(n - 1);
        }
    }
}
