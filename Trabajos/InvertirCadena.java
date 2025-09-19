public class Main {


    public static void main(String[] args) {
        String textoOriginal = "hola";
        String textoInvertido = invertir(textoOriginal);
        System.out.println("La cadena '" + textoOriginal + "' invertida es: " + textoInvertido);

        String otroTexto = "Emiliano Lozano";
        System.out.println("La cadena '" + otroTexto + "' invertida es: " + invertir(otroTexto));
    }


    public static String invertir(String cadena) {

        if (cadena == null || cadena.length() <= 1) {
            return cadena;
        }

        return invertir(cadena.substring(1)) + cadena.charAt(0);
    }
}