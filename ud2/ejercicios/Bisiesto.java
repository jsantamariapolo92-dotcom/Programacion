package ud2.ejercicios;

import java.util.Scanner;

public class Bisiesto {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe un año: ");
    double año = sc.nextInt();
    sc.close();

    if (año % 400 == 0 || año % 4 == 0 && año % 100 != 0) {
        System.out.println("El año que has introducido es bisiesto");
    } else {
System.out.println("El año que has introducido no es bisiesto");
    }
}
}
