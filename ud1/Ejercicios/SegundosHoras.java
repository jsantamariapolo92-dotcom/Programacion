package ud1.Ejercicios;

import java.util.Scanner;

public class SegundosHoras {
public static void main(String[] args) {
 
   Scanner sc = new Scanner(System.in);
   System.out.println("Introduce el número de segundos: ");
   int numeroDeSegundos = sc.nextInt();
   sc.close();

   int Horas = numeroDeSegundos / 3600;
   int Minutos = numeroDeSegundos % 3600 / 60;
   int segundos = numeroDeSegundos % 3600 % 60;

   System.out.println(Horas + "h ");
   System.out.println(Minutos + "m ");
   System.out.println(segundos + "s");
   System.out.println( Horas + "h " + Minutos + "m " + segundos + "s");
    
}

}
