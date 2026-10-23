package ud2.ejercicios;

import java.util.Scanner;

public class CasiCero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número decimal: ");
        double numD = sc.nextDouble();
        sc.close();

        if (numD > -1 && numD < 1 && numD != 0) {
            System.out.println("Este número es un casi-cero");
        } else {
            System.out.println("Este número no es casi-cero");
        }

    }
}
