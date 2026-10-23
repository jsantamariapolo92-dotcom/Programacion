package ud1.Ejercicios;

import java.util.Scanner;

/** @author Aiko **/

public class ecuacion2grado {
    public static void main(String[] args) {
        System.out.println("Este es un programa para resolver ecuaciones cuadráticas de la forma ax^2 + bx + c = 0");
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el coeficiente a: ");
        double a = sc.nextDouble();

        System.out.print("Introduce el coeficiente b: ");
        double b = sc.nextDouble();

        System.out.print("Introduce el coeficiente c: ");
        double c = sc.nextDouble();

        sc.close();

        double discriminante = b * b - 4 * a * c;
        System.out.println("El discriminante es: " + discriminante);
        System.out.println((discriminante >= 0) ? "La ecuación tiene soluciones reales." : "La ecuación no tiene soluciones reales.");

        System.out.println((discriminante >= 0) ? "la solucion 1 es " + (-b + Math.sqrt(discriminante)) / (2 * a): "");
        System.out.println((discriminante >= 0) ? "la solucion 2 es " + (-b - Math.sqrt(discriminante)) / (2 * a) : "");
    }
}