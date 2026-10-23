package ud1.Ejemplos;

import java.util.Scanner;

/** @author Polo **/

public class DistanciaEntreDosPuntos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribeme la coordenada x1:");
        double x1 = sc.nextInt();

        System.out.println("Escribeme la coordenada x2:");
        double x2 = sc.nextInt();

        System.out.println("Escribeme la coordenada y1:");
        double y1 = sc.nextInt();

        System.out.println("Escribeme la coordenada y2:");
        double y2 = sc.nextInt();

        System.out.println(
                "La distancia entre los dos puntos es:" + Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
        sc.close();

    }
}
