package ud2.ejercicios;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Cálculo del Factorial ===");
        System.out.print("Introduce un número entero no negativo: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Error: El factorial no está definido para números negativos.");
        } else if (numero == 0 || numero == 1) {
            System.out.println(numero + "! = 1");
        } else {
            long factorial = 1;
            System.out.print(numero + "! = ");

            for (int i = numero; i >= 1; i--) {
                factorial = factorial * i;
                System.out.print(i);
                if (i > 1) {
                    System.out.print(" × ");
                }
            }
            System.out.println(" = " + factorial);
        }

        sc.close();
    }
}

