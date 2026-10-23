package ud1.Ejercicios;

import java.util.Scanner;

public class FarenheitACelsius {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe los grados Farenheit que quieres convertir: ");
        double tempF = sc.nextDouble();
        sc.close();
        double FaC = (5 / 9.0) * ((tempF - 32));
        System.out.printf("La temperatura pasada a grados celsius dá: %.2 ºC", FaC);

    }
}
