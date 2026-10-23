package ud1.Ejercicios;

import java.util.Scanner;

/** @author Polo **/

public class Triangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribeme la longitud de la base");
        double b = sc.nextDouble();

        System.out.println("Escribeme la longitud de la altura");
        double h = sc.nextDouble();

        System.out.println("El área del triangulo es " + b * h / 2 + " cm ");
        sc.close();

    }
}
