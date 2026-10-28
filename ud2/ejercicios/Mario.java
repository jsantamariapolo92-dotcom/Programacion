package ud2.ejercicios;

import java.util.Scanner;

public class Mario {

    public static void main(String[] args) {

        int arriba = 0;
        int abajo = 0;

        // Scanner para leer la altura de los muros

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la secuencia de la altura de los muros: ");
        int altura = sc.nextInt();

        // Bucle para leer la secuencia de alturas hasta que se introduzca -1

        while (altura != -1) {
            int altura2 = sc.nextInt();
            if (altura2 != -1) {
                if (altura2 > altura) {
                    arriba++;
                } else if (altura2 < altura) {
                    abajo++;
                }
            }
            altura = altura2;
        }
        sc.close();

    System.out.println("Número de muros que sube: " + arriba);
    System.out.println("Número de muros que baja: " + abajo);
    
    }

}

