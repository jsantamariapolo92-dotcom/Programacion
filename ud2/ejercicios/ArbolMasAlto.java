package ud2.ejercicios;

import java.util.Scanner;

public class ArbolMasAlto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String etiquetaMasAlta = "";
        int alturaMasAlta = -1;
        String etiqueta;
        int altura;

        System.out.println("=== Árbol más alto ===");
        System.out.println("Introduce la etiqueta del árbol y su altura en cm.");
        System.out.println("Para terminar: etiqueta vacía o altura -1.");
        System.out.println();

        while (true) {
            System.out.print("Etiqueta del árbol: ");
            etiqueta = sc.nextLine().trim();

            if (etiqueta.isEmpty()) {
                break;
            }

            System.out.print("Altura (cm): ");
            altura = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            if (altura == -1) {
                break;
            }

            if (altura > alturaMasAlta) {
                alturaMasAlta = altura;
                etiquetaMasAlta = etiqueta;
            }
        }

        if (alturaMasAlta == -1) {
            System.out.println("No se ha introducido ningún árbol.");
        } else {
            System.out.println();
            System.out.println("El árbol más alto es:");
            System.out.println("Etiqueta: " + etiquetaMasAlta);
            System.out.println("Altura: " + alturaMasAlta + " cm");
        }

        sc.close();
    }
}

