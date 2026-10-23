package ud1.Ejercicios;

import java.util.Scanner;

public class Par {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número entero");
        int numEnt = sc.nextInt();
        sc.close();

        System.out.println((numEnt % 2 == 0) ? "Es par" : "Es impar");

    }

}
