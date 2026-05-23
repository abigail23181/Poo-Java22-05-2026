package poo.pagina43.ejercicio1;

class Integrante {
    protected int id;
    protected String nombre;
    public void viajar() { System.out.println("Viajando..."); }
}

class Futbolista extends Integrante {
    private int dorsal;
    public void jugar() { System.out.println("Jugando..."); }
}

class Entrenador extends Integrante {
    private String idFederacion;
    public void dirigir() { System.out.println("Dirigiendo..."); }
}

public class Main {
    public static void main(String[] args) {
        Futbolista f = new Futbolista();
        f.nombre = "Messi";
        f.viajar();
        f.jugar();
    }
}