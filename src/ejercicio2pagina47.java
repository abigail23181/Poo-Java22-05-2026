// Clase abstracta
abstract class Personal {

    String nombre;

    // Método abstracto
    abstract void registrar();

    // Método abstracto
    abstract double calcularSueldo();
}

// Clase que hereda de Personal
class Empleado extends Personal {

    double salarioBase;
    int horasTrabajadas;

    // Constructor
    public Empleado(String nombre, double salarioBase, int horasTrabajadas) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    void registrar() {
        System.out.println("Empleado registrado: " + nombre);
    }

    @Override
    double calcularSueldo() {
        return salarioBase * horasTrabajadas;
    }
}

// Clase principal
public class ejercicio2pagina47 {

    public static void main(String[] args) {

        Empleado emp = new Empleado("Carlos", 10, 40);

        emp.registrar();

        System.out.println("Sueldo total: $" + emp.calcularSueldo());
    }
}