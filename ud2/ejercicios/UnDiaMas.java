package ud2.ejercicios;

import java.util.Scanner;

/** @author Yubay */

public class UnDiaMas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el día: ");
        int dia = sc.nextInt();

        System.out.print("Introduce el mes: ");
        int mes = sc.nextInt();

        System.out.print("Introduce el año: ");
        int anio = sc.nextInt();

        int diasMes = 0;

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diasMes = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diasMes = 30;
                break;
            case 2:
                diasMes = 28;
                break;
        }

        dia++;

        if (dia > diasMes) {
            dia = 1;
            mes++;
        }
        if (mes > 12) {
            mes = 1;
            anio++;
        }

        System.out.println("El día siguiente es: "
                + dia + "/" + mes + "/" + anio);

        sc.close();
    }
}