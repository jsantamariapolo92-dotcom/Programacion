package ud2.ejercicios;

import java.util.Scanner;

public class Capicua {

    public static boolean esCapicua(long n) {

        if (n < 0) {
            return false;
        }

        long original = n;
        long invertido = 0;

        while (n > 0) {
            long digito = n % 10;
            invertido = invertido * 10 + digito;
            n = n / 10;
        }

        return original == invertido;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        long numero = sc.nextLong();

        if (esCapicua(numero)) {
            System.out.println("Es capicua");
        } else {
            System.out.println("No es capicua");
        }

        sc.close();
    }

}

