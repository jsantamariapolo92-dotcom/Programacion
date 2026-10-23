package ud2.ejercicios;

/** @author Matías Centeno Plá */
public class TrianguloPascal {

    public static void main(String[] args) {

        int numFilas = 5;

        trianguloPascal(numFilas);
    }

    private static void trianguloPascal(int numFilas) {
        for (int n = 0; n < numFilas; n++) {
            for (int m = 0; m <= n; m++) { 

                long num = factorial(n) / (factorial(m) * factorial(n - m)); 
                System.out.print(num + "  "); 
            }
            System.out.println();
        }
    }

    public static long factorial(long numero) {

        long factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
