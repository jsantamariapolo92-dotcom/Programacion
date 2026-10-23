package ud2.ejercicios;

public class SumarImpares {
    public static void main(String[] args) {
        int suma = 0;
        int contador = 0;
        int numero = 1;

        System.out.println("=== Suma de los 10 primeros números impares ===");

        while (contador < 10) {
            if (numero % 2 != 0) {
                suma = suma + numero;
                contador++;
                System.out.print(numero);
                if (contador < 10) {
                    System.out.print(" + ");
                }
            }
            numero++;
        }

        System.out.println(" = " + suma);
        System.out.println("La suma de los 10 primeros números impares es: " + suma);
    }
}

