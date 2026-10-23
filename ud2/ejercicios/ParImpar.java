package ud2.ejercicios;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número");
        int numero = sc.nextInt();
        sc.close();

        if (numero % 2 == 0) {
            System.out.println("Este número es par");
        } else {
            System.out.println("Este número es impar");
        }
    }
}
