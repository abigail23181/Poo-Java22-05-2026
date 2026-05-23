package poo.pagina40.ejercicio1;

class Animal {
    private String nombre;
    private String orden;
    private int extremidades;

    public Animal(String nombre, String orden, int extremidades) {
        this.nombre = nombre;
        this.orden = orden;
        this.extremidades = extremidades;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getOrden() { return orden; }
    public void setOrden(String orden) { this.orden = orden; }
    public int getExtremidades() { return extremidades; }
    public void setExtremidades(int extremidades) { this.extremidades = extremidades; }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal("Tigre", "Carnívoro", 4);
        System.out.println("Animal: " + a.getNombre() + " de orden " + a.getOrden());
    }
}