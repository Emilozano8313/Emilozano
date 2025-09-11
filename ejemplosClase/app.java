//Clase del 11/06/2024

import java.util.ArrayDeque;
import java.util.Queue;


//Queue
public class app {
    public static void main(String[] args) {
        Queue<String> fila = new ArrayDeque<>();
        
        fila.add("Cliente 1");
        fila.add("Cliente 2");
        fila.add("Cliente 3");

        for (String f : fila) {
            System.out.println(f);
        }
        System.out.println("Atendiendo a: " + fila.poll());
        fila.add("NuevoCliente");
       
       //Se utiliza para eliminar el primer elemento de la fila
        fila.poll();
        System.out.println("Fila: " + fila);
        System.out.println("Próximo en ser atendido: " + fila.peek());//Primero en la fila
    }
}
