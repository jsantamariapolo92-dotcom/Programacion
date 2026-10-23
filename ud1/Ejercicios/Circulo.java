package ud1.Ejercicios;

import java.util.Scanner;

/**@author Polo **/

public class Circulo {
    
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
     
        System.out.println("Escribe el radio del círculo");
         double radio = sc.nextDouble();
       
      double area = 2 * Math.PI * radio;
      double perimetro = Math.PI * Math.pow(radio, 2);

           System.out.println("El perímetro es: " + String.format("%.2f", perimetro));
        System.out.println("El área es: " + String.format("%.2f", area));

sc.close();
}
}
