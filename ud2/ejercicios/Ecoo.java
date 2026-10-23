package ud2.ejercicios;

import java.util.Scanner;

public class Ecoo {

    public static void Eco() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el parametro N: ");
        int n = sc.nextInt();
        sc.close();

        while (n > 0) {
            System.out.println("Eco");
            n--;
        }
    }

    public static void main(String[] args) {

        Eco();
    }
}
