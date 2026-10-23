package ud1.Ejemplos;

import java.util.Random;

public class SorteoAlumnadoDAM1 {

    public static void main(String[] args) {
        final int NUM_ALUMNOS = 30;
Random rnd = new Random();
int numeroElegido = rnd.nextInt(NUM_ALUMNOS) + 1;
System.out.println("Número elegido: " + numeroElegido);

System.out.println(numeroElegido == 1 ? "Juan A" : "");
System.out.println(numeroElegido == 2 ? "Matías" : "");
System.out.println(numeroElegido == 3 ? "Pablo C" : "");
System.out.println(numeroElegido == 4 ? "Alex M" : "");
System.out.println(numeroElegido == 5 ? "Juan P" : "");

    }
}
