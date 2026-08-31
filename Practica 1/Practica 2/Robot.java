import java.util.UUID;

public class Robot {
    // Identificador único generado por Java
    private UUID id;
    
    // Atributos directos del Robot
    private String nombre;
    private double tamano;
    private double peso;
    private String color;
    private double velocidadMaxima;
    private String categoria;
    private double velocidadActual;
    private double distanciaRecorrida;
    private boolean estaActivo;

    // Composición: El robot "tiene una" Batería
    private Bateria bateria;

    // Constructor: aquí se genera el UUID de forma automática
    public Robot(String nombre, double tamano, double peso, String color, 
                 double velocidadMaxima, String categoria, int nivelBateriaInicial) {
        
        // Asignación automática del UUID único al nacer
        this.id = UUID.randomUUID();
        
        this.nombre = nombre;
        this.tamano = tamano;
        this.peso = peso;
        this.color = color;
        this.velocidadMaxima = velocidadMaxima;
        this.categoria = categoria;
        this.velocidadActual = 0.0;
        this.distanciaRecorrida = 0.0;
        this.estaActivo = true;

        // Composición
        this.bateria = new Bateria(nivelBateriaInicial);
    }

    // Método para mostrar los datos del robot en pantalla
    public void mostrarInformacion() {
        System.out.println("--- DATOS DEL ROBOT ---");
        System.out.println("ID Único (UUID): " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Categoría: " + categoria);
        System.out.println("Color: " + color);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Tamaño: " + tamano + " m");
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
        System.out.println("Velocidad Actual: " + velocidadActual + " km/h");
        System.out.println("Distancia Recorrida: " + distanciaRecorrida + " m");
        System.out.println("Nivel de Batería: " + bateria.getNivelEnergia() + "%");
        System.out.println("¿Está Activo?: " + (estaActivo ? "Sí" : "No"));
        System.out.println("-----------------------\n");
    }
}