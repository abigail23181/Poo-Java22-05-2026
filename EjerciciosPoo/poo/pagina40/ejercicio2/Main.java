package poo.pagina40.ejercicio2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int puntosNivel1 = 100; // Puntos heredados
        int puntosNivel2 = 0;

        System.out.println("--- NIVEL 2 DEL JUEGO ---");
        String[] preguntas = {"¿Java es POO? (s/n)", "¿Usa JVM? (s/n)", "¿Es compilado? (s/n)", "¿Usa punteros? (s/n)"};
        String[] respuestas = {"s", "s", "s", "n"};

        for (int i = 0; i < 4; i++) {
            System.out.println(preguntas[i]);
            if (sc.nextLine().equalsIgnoreCase(respuestas[i])) {
                puntosNivel2 += 20;
            } else {
                puntosNivel2 -= 10;
            }
        }
        System.out.println("Total Acumulado: " + (puntosNivel1 + puntosNivel2));
    }
}