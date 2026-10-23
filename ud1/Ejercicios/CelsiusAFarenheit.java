package ud1.Ejercicios;

import java.util.Scanner;

public class CelsiusAFarenheit {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe la temperatura que quieres pasar en ºC a ºF: ");
        double tempC = sc.nextDouble();
        sc.close();
        
        System.out.println("Los grados resultantes en Farenheit son: " + ((tempC * 1.8) + 32));

    }
}
