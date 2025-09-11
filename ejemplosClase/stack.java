import java.util.ArrayDeque;
import java.util.Deque;

public class stack {
     public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        stack.push("Libro 1");
        stack.push("Libro 2");
        stack.push("Libro 3");
        for (String l : stack) {
            System.out.println(l);
        }
        //quitar
        System.out.println("Quitando: " + stack.pop());
        System.out.println("Stack: " + stack);

        stack.push("NuevoLibro");
        stack.pop();
        System.out.println("Stack: " + stack);

    }

}
