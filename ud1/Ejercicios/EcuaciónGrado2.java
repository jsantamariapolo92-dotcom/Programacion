package ud1.Ejercicios;

import java.util.Scanner;

public class EcuaciónGrado2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el valor de a:");
        int va = sc.nextInt();

        System.out.println("Escribe el valor de b:");
        int vb = sc.nextInt();

        System.out.println("Escribe el valor de c:");
        int vc = sc.nextInt();

        System.out.println("La x1 tiene un valor de: " + ((-vb + Math.sqrt(Math.pow(vb, 2) - (4 * va * vc))) / 2));
        System.out.println("La x2 tiene un valor de: " + ((-vb - Math.sqrt(Math.pow(vb, 2) - (4 * va * vc))) / 2));

        sc.close();

    }
}
