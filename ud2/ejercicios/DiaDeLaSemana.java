package ud2.ejercicios;

import java.util.Scanner;

/**
 * @author Juan
 */
public class DiaDeLaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número del 1-7: ");
        int num = sc.nextInt();
        sc.close();

        switch (num) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;

            default:
                System.out.println("No has introducido un número valido");
                break;
        }
    }
}
