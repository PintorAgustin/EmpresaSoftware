public class Gerente extends Empleado {
    private int antiguedad;
    private double bonusGestion;

    public Gerente(String nombre, String dni, double salarioBase, int antiguedad, double bonusGestion) {
        super(nombre, dni, salarioBase);
        this.antiguedad = antiguedad;
        this.bonusGestion = bonusGestion;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonusGestion + antiguedad;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Antigüedad: " + antiguedad);
        System.out.println("Bonus de Gestión: " + bonusGestion);
        System.out.println("Salario Total: " + calcularSalario());
    }
}
