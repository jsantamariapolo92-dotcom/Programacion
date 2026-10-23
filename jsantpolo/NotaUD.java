package jsantpolo;

/** author @Juan **/

import java.util.Scanner;

public class NotaUD {
    public static void main(String[] args) {

        // Pedimos las notas al usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribeme la nota de la prueba teórica: ");
        double teorica = sc.nextDouble();
        System.out.println("Escribeme la nota de la prueba práctica: ");
        double practica = sc.nextDouble();
        System.out.println("Escribeme la nota del trabajo de clase: ");
        double trabajo = sc.nextDouble();
        sc.close();

        // Calculo

        double nota = (teorica < 5 || practica < 5) ? 4
                : (trabajo == -1 ? teorica * 0.4 + practica * 0.6
                        : (teorica * 0.4 + practica * 0.6 + trabajo * 0.2) / 1.2);
        System.out.println("La nota final es: " + nota);
    }
}
