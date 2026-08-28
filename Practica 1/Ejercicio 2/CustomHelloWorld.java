import java.util.Scanner;

public class CustomHelloWorld {
    public static void main(String[] args) {
        // Crear la instancia de Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el nombre por consola
        System.out.print("Escribe tu nombre: ");
        String nombre = scanner.nextLine();
        
        // Mostrar el mensaje personalizado
        System.out.println("Hello " + nombre + "!");
        
        // Cerrar el scanner
        scanner.close();
    }
}