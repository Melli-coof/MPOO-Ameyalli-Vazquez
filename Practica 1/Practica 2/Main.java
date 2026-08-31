public class Main {
    public static void main(String[] args) {
        // Creación del primer robot
        Robot robot1 = new Robot("Megatron", 1.5, 12.5, "Rojo", 25.0, "Sumo", 100);
        
        // Creación del segundo robot
        Robot robot2 = new Robot("Speedy", 0.8, 5.0, "Azul", 40.0, "Velocista", 95);

        // Mostrar información para verificar los UUIDs únicos
        robot1.mostrarInformacion();
        robot2.mostrarInformacion();
    }
}