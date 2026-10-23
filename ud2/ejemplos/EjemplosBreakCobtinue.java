package ud2.ejemplos;

public class EjemplosBreakCobtinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Terminamos en la posición: " + i);
                break;
            }
        }
    
      for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Terminamos en la posición: " + i);
                continue;
            }
        System.out.println(i);
        }
    
    
    }
}
