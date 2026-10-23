package ud2.ejercicios;

import java.util.Scanner;

/** @author Juan **/
public class EdadMaximaMinima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce las edades de los alumnos (termina con -1):");

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        if (edad == -1) {
            System.out.println("No se introdujo ninguna edad.");
        } else {
            int maxima = edad;
            int minima = edad;

            while (true) {
                System.out.print("Edad: ");
                edad = sc.nextInt();

                if (edad == -1) {
                    break; // Sale del bucle
                }

                if (edad > maxima) {
                    maxima = edad;
                }
                if (edad < minima) {
                    minima = edad;
                }
            }

            System.out.println("Edad máxima: " + maxima);
            System.out.println("Edad mínima: " + minima);
        }

        sc.close();
    }
}
