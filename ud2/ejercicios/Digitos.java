package ud2.ejercicios;

import java.util.Scanner;

public class Digitos {

    // Muestra los digitos desde el final hasta el principio
    public static void mostrarAlReves(long n) {

        if (n < 0) {
            n = -n;
        }

        if (n == 0) {
            System.out.println(0);
            return;
        }

        while (n > 0) {
            long digito = n % 10;
            System.out.println(digito);
            n = n / 10;
        }
    }

    // Muestra los digitos en orden normal
    public static void mostrarNormal(long n) {

        String texto = Long.toString(n);

        if (texto.startsWith("-")) {
            texto = texto.substring(1);
        }

        for (int i = 0; i < texto.length(); i++) {
            System.out.println(texto.charAt(i));
        }
    }

    // Cuenta los digitos
    public static int contarDigitos(long n) {

        String texto = Long.toString(n);

        if (texto.startsWith("-")) {
            texto = texto.substring(1);
        }

        return texto.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero entero: ");
        long numero = sc.nextLong();

        System.out.println("Digitos al reves:");
        mostrarAlReves(numero);

        System.out.println("Digitos en orden normal:");
        mostrarNormal(numero);

        System.out.println("Numero de digitos: " + contarDigitos(numero));

        sc.close();
    }

}

