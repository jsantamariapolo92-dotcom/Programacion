package jsantpolo;

import java.util.Scanner;

/** author @Juan **/

public class Esfera {
    public static void main(String[] args) {

        // Introduccion r por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el radio de la Esfera:");
        double r = sc.nextDouble();

        // Calculos
        double Aesfera = 4 * Math.PI * (Math.pow(r, 2));
        System.out.println(Aesfera);
        double Vesfera = (4 / 3.0) * Math.PI * (Math.pow(r, 3));
        System.out.println(Vesfera);

        sc.close();
    }
}
