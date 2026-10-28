package ud2.ejemplos;

import java.util.Scanner;

public class EjemploExcepciones {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Escribe un número entero: ");
int numero = sc.nextInt();

System.out.println("Escribe otro número entero: ");

int numero2 = sc.nextInt();

System.out.println("a / b = " + numero / numero2);

System.out.print("Escribe una letra: ");
char letra = sc.nextLine().charAt(0);
System.out.println("Has elegido la letra " + letra);

sc.close();

System.out.println("Fin del programa");

    }

public static void recursivoInfinito() {
    double d = 0.0;
    recursivoInfinito();
}

}
