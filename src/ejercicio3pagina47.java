// Interface
interface Profesion {

    double calcularSueldo();
}

// Clase Doctor
class Doctor implements Profesion {

    double pagoPorConsulta;
    int consultas;

    public Doctor(double pagoPorConsulta, int consultas) {
        this.pagoPorConsulta = pagoPorConsulta;
        this.consultas = consultas;
    }

    @Override
    public double calcularSueldo() {
        return pagoPorConsulta * consultas;
    }
}

// Clase Ingeniero
class Ingeniero implements Profesion {

    double salarioMensual;

    public Ingeniero(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSueldo() {
        return salarioMensual;
    }
}

// Clase principal
public class ejercicio3pagina47 {

    public static void main(String[] args) {

        Doctor doc = new Doctor(25, 20);
        Ingeniero ing = new Ingeniero(1200);

        System.out.println("Sueldo del doctor: $" + doc.calcularSueldo());
        System.out.println("Sueldo del ingeniero: $" + ing.calcularSueldo());
    }
}