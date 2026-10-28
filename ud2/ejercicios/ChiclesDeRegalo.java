package ud2.ejercicios;

import java.util.Scanner;

public class ChiclesDeRegalo {

    
    
    public static void main(String[] args) {
        totalChicles();
    }

    public static int totalChicles() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el número de chicles comprados inicialmente: ");
        int chiclesInicio = sc.nextInt();
        sc.close();

        if (chiclesInicio % 5 == 0) {
            int envoltorios = chiclesInicio / 5;
            if (chiclesInicio < 0) {
                return (-1);
            }

            if (envoltorios % 5 == 0) {
                System.out.println("El número de envoltorios que tienes " + envoltorios);
                int chiclesRegalo = envoltorios / 5;

                if (envoltorios < 0) {
                    return (-1);
                }

                if (chiclesRegalo < 0) {
                    return (-1);
                }
                System.out.println("El número de chicles gratis que recibes al final es :  " + chiclesRegalo);
            }

        }
        return chiclesInicio;
        

    }

}
