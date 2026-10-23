package ud1.Ejercicios;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribeme tu nota del primer trimestre");
        double nota1 = sc.nextDouble();

        System.out.println("Escribeme tu nota del segundo trimestre");
        double nota2 = sc.nextDouble();

        System.out.println("Escribeme tu nota del tercer trimestre");
        double nota3 = sc.nextDouble();

        double notaF = (nota1 + nota2 + nota3) / 3;
        System.out.println("Tu nota final es: " + notaF);
    
        
        sc.close();

    }

}
