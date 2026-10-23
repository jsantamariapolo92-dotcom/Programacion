package ud1.Ejercicios;
import java.util.Scanner;

/**
 *  @author Alexandre
 */

public class CirculoJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el radio en cm: ");
        double radio = sc.nextDouble();
        sc.close();

        double perimetro = 2 * Math.PI * radio;
        double area = Math.PI * (radio * radio);
        
        System.out.println("El perímetro es: " + String.format("%.2f", perimetro) + " cm");
        System.out.println("El área es: " + String.format("%.2f", area) + " cm^2");

    }

}
