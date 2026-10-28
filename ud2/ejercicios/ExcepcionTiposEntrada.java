package ud2.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionTiposEntrada {
public static void main(String[] args) {
   
   try{

    Scanner sc = new Scanner(System.in);
    System.out.print("Escribe un número: ");
    int numero = sc.nextInt();
    sc.close();


} catch (InputMismatchException e) {
 System.out.println("Introduce un caracter válido ");
}
}
}
