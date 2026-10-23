package ud2.ejercicios;

import java.util.Scanner;

/**@author MFallCarr */

public class UnSegundoMas { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe las horas: ");
        int hora = sc.nextInt();
        System.out.print("Escribe los minutos: ");
        int minutos = sc.nextInt();
         System.out.print("Escribe los segundos: ");
        int segundos = sc.nextInt();
        sc.close();

segundos++;

if (segundos == 60) {
    segundos = 0;
    minutos++;

    if (minutos == 60) {
        minutos = 0;
        hora++;

        if (hora == 24) 
            hora = 0;
        }
    }

System.out.printf("Hora incrementada: %02d,%02d,%02d \n", hora , minutos, segundos);
}
   
}



