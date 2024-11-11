public class TestEmpleado {
    public static void main(String[] args) {
        Desarrollador desarrollador = new Desarrollador("Juan Pérez", "12345678", 3000, "Java", 10);
        Gerente gerente = new Gerente("Ana López", "87654321", 5000, 5, 1000);

        System.out.println("Detalles del Desarrollador:");
        desarrollador.mostrarDetalles();

        System.out.println("\nDetalles del Gerente:");
        gerente.mostrarDetalles();
    }
    }
