package ud2.ejercicios;

import java.util.Scanner;

public class ValidarDNI {

    // Calcula la letra del DNI usando switch y yield
    public static char letraDNI(int dni) {

        int resto = dni % 23;

        char letra = switch (resto) {
            case 0 -> {
                yield 'T';
            }
            case 1 -> {
                yield 'R';
            }
            case 2 -> {
                yield 'W';
            }
            case 3 -> {
                yield 'A';
            }
            case 4 -> {
                yield 'G';
            }
            case 5 -> {
                yield 'M';
            }
            case 6 -> {
                yield 'Y';
            }
            case 7 -> {
                yield 'F';
            }
            case 8 -> {
                yield 'P';
            }
            case 9 -> {
                yield 'D';
            }
            case 10 -> {
                yield 'X';
            }
            case 11 -> {
                yield 'B';
            }
            case 12 -> {
                yield 'N';
            }
            case 13 -> {
                yield 'J';
            }
            case 14 -> {
                yield 'Z';
            }
            case 15 -> {
                yield 'S';
            }
            case 16 -> {
                yield 'Q';
            }
            case 17 -> {
                yield 'V';
            }
            case 18 -> {
                yield 'H';
            }
            case 19 -> {
                yield 'L';
            }
            case 20 -> {
                yield 'C';
            }
            case 21 -> {
                yield 'K';
            }
            case 22 -> {
                yield 'E';
            }
            default -> {
                yield '?';
            }
        };

        return letra;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dni;

        // Repetimos hasta que se introduzcan 8 cifras
        while (true) {
            System.out.print("Introduce el numero del DNI: ");
            dni = sc.nextInt();

            if (dni < 0 || dni > 99999999) {
                System.out.println("Numero no valido.");
                continue;
            }

            if (dni < 10000000) {
                System.out.println("Debe tener 8 cifras.");
                continue;
            }

            break;
        }

        System.out.println("DNI completo: " + dni + letraDNI(dni));

        sc.close();
    }

}

