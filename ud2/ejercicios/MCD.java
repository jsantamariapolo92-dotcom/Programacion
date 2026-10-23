package ud2.ejercicios;

import java.util.Scanner;

public class MCD {

    public static int mcd(int a, int b) {

        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else if (a >= b) {
            return mcd(a - b, b);
        } else {
            return mcd(a, b - a);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        int a = Math.abs(sc.nextInt());

        System.out.print("Introduce el segundo numero: ");
        int b = Math.abs(sc.nextInt());

        System.out.println("MCD = " + mcd(a, b));

        sc.close();
    }

}

