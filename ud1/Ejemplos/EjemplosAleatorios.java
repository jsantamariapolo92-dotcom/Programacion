package ud1.Ejemplos;

import java.util.Random;

public class EjemplosAleatorios {

    public static void main(String[] args) {
        final int NUM_ALUMNOS = 30;

        // Generando un número entero aleatorio con Math.random()
        System.out.println(Math.random());
        System.out.println(Math.random() * NUM_ALUMNOS);
        // Genera un número aleatorio entre 1 y NUM_ALEATORIOS
       
        System.out.println(NUM_ALUMNOS);

        // Generando números aleatorios con
        Random rnd = new Random();
        System.out.println(rnd.nextInt());
        System.out.println(rnd.nextInt(NUM_ALUMNOS) + 1);
        System.out.println(rnd.nextInt(1, NUM_ALUMNOS + 1));

    }
}
