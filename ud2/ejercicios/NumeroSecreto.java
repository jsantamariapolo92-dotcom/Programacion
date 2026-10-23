package ud2.ejercicios;

import java.util.Scanner;
import java.util.Random;

public class NumeroSecreto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int intentos = 0;
        int numeroUsuario;
        boolean acertado = false;

        System.out.println("=== Juego del Número Secreto ===");
        System.out.println("Adivina el número entre 1 y 100.");
        System.out.println("Introduce -1 si quieres rendirte.");
        System.out.println();

        do {
            System.out.print("Introduce un número: ");
            numeroUsuario = sc.nextInt();

            if (numeroUsuario == -1) {
                System.out.println("Te has rendido.");
                System.out.println("El número secreto era: " + numeroSecreto);
                break;
            }

            intentos++;

            if (numeroUsuario == numeroSecreto) {
                acertado = true;
                System.out.println("¡Correcto! Has acertado el número secreto.");
                System.out.println("Número de intentos: " + intentos);
            } else if (numeroUsuario > numeroSecreto) {
                System.out.println("El número secreto es MENOR.");
            } else {
                System.out.println("El número secreto es MAYOR.");
            }

        } while (!acertado);

        sc.close();
    }
}
