package ud1.Ejemplos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

/** @author Polo **/

public class EjemploCompra3 {
    public static void main(String[] args) {
        double precio = 5.20; // precio de las unidades 
        double IVA = 0.21; // porcentaje de IVA 
        double precioUiva = precio*IVA + precio; //precio de una unidad con IVA

       Scanner sc = new Scanner(System.in);
       
        System.out.print("Escribe tu nombre: ");// Para que el usuario ponga su nombre
        String nombre = sc.next();
       
       System.out.println("Escribe el número de unidades");//Para que el usuario ponga las unidades
        int numerou = sc.nextInt();

String dosdeci = String.format( "%.2f %n", numerou*precioUiva ); //Para que calcule el precio final con IVA incluído y me lo de con 2 decimales     
 
 System.out.println( nombre + ", el precio total es "  + dosdeci + " por llevarte " + numerou);//Frase donde dice el precio

System.out.println("La hora de la compra fue " + LocalTime.now());//Hora de compra
System.out.println("El día que se hizo la compra fue " + LocalDate.now());//Día de la Compra

        sc.close();
    }
}
