package ud2.ejercicios;

import java.util.Scanner;

/**
 * @author Juan
 */
public class FechaCorrecta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un día: ");
        int dia = sc.nextInt();
        System.out.print("Introduce un mes: ");
        int mes = sc.nextInt();
        System.out.print("Introduce un año: ");
        int ano = sc.nextInt();
        sc.close();

        int diadelmes = 0;

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                diadelmes = 31;
                break;
            case 4, 6, 9, 11:
                diadelmes = 30;
                break;
            case 2:
                diadelmes = 28;
                break;
            default:
                break;
        }

        if (ano > 0 && mes >= 1 && mes <= 12 && dia >= 1 && dia <= diadelmes) {
            System.out.println("Has introducido una fecha correcta " + dia + "/" + mes + "/" + ano);
        } else {
            System.out.println("No has introducido una fecha correcta");
        }

    }
}
