public class Desarrollador extends Empleado{
    private String lenguajePrincipal;
    private int horasExtras;
    private double pagoPorHoraExtra = 50.0; // Valor del plus por hora extra, puedes cambiarlo según sea necesario

    public Desarrollador(String nombre, String dni, double salarioBase, String lenguajePrincipal, int horasExtras) {
        super(nombre, dni, salarioBase);
        this.lenguajePrincipal = lenguajePrincipal;
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (horasExtras * pagoPorHoraExtra);
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Lenguaje Principal: " + lenguajePrincipal);
        System.out.println("Horas Extras: " + horasExtras);
        System.out.println("Salario Total: " + calcularSalario());
    }
}
