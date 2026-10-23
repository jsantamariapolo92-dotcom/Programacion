package jsantpolo;

/** author @Juan **/

import java.util.Scanner;

public class SalarioSemanal {
    public static void main(String[] args) {

        // Solicitamos el nº de horas
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el nº de horas trabajadas");
        double horas = sc.nextDouble();
        sc.close();

        // Calculos

        double salario = horas <= 40 ? horas * 12.50 : (40 * 12.50) + ((horas - 40) * 25);
        System.out.println("Salario " + salario + " euros");

    }
}