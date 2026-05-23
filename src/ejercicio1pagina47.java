// Clase principal
class Vehiculo {

    public void mover() {
        System.out.println("El vehículo se está moviendo.");
    }
}

// Clase derivada Automovil
class Automovil extends Vehiculo {

    @Override
    public void mover() {
        System.out.println("El automóvil se mueve por la carretera.");
    }
}

// Clase derivada Barco
class Barco extends Vehiculo {

    @Override
    public void mover() {
        System.out.println("El barco navega por el mar.");
    }
}

// Clase derivada Avion
class Avion extends Vehiculo {

    @Override
    public void mover() {
        System.out.println("El avión vuela por el cielo.");
    }
}

// Clase principal para ejecutar
public class ejercicio1pagina47 {

    public static void main(String[] args) {

        Vehiculo v1 = new Automovil();
        Vehiculo v2 = new Barco();
        Vehiculo v3 = new Avion();

        v1.mover();
        v2.mover();
        v3.mover();
    }
}
