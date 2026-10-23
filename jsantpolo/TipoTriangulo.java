package jsantpolo;

import java.util.Scanner;

/** author @Juan **/

public class TipoTriangulo {
    public static void main(String[] args) {

        // Pedimos al usuario las medidas de cada lado del triangulo
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el lado 1 del triangulo: ");
        double lado1 = sc.nextDouble();
        System.out.println("Escribe el lado 2 del triangulo: ");
        double lado2 = sc.nextDouble();
        System.out.println("Escribe el lado 3 del triangulo: ");
        double lado3 = sc.nextDouble();
        sc.close();

        // Clasificación de los lados del triangulo

        String tipoTRI = (lado1 == lado2 && lado2 == lado3) ? "Equilátero"
                : (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) ? "Isósceles" : "Escaleno";
        System.out.println(tipoTRI);

    }
}
