package ud2.ejercicios;

import java.util.Scanner;

public class EstadisticaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Estadística de notas ===");
        System.out.print("¿Cuántas notas vas a introducir? ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("El número de notas debe ser mayor que 0.");
            sc.close();
            return;
        }

        int aprobados = 0;
        int condicionados = 0;
        int suspensos = 0;

        System.out.println("Introduce las " + n + " notas (0-10):");

        for (int i = 1; i <= n; i++) {
            System.out.print("Nota del alumno " + i + ": ");
            double nota = sc.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota no válida. Se considera como 0 (suspenso).");
                nota = 0;
            }

            if (nota >= 5) {
                aprobados++;
            } else if (nota == 4) {
                condicionados++;
            } else {
                suspensos++;
            }
        }

        System.out.println();
        System.out.println("=== Resultados ===");
        System.out.println("Aprobados (nota >= 5): " + aprobados);
        System.out.println("Condicionados (nota = 4): " + condicionados);
        System.out.println("Suspensos (nota < 4): " + suspensos);

        sc.close();
    }
}

