package ud2.ejercicios;
import java.util.Scanner;

/** author @Juan **/

public class Factura {
    public static void main(String[] args) {
        final double IVA = 0.21;
       final double DESCUENTO = 0.05;
        Scanner sc = new Scanner(System.in);
        System.out.print("Que precio tiene el producto sin iva: ");
        double precio = sc.nextDouble();
        System.out.print("Cuantas unidades va ha comprar? ");
        double unidades = sc.nextDouble();
        sc.close();

        double importeConIva = (unidades * precio) * (1 + IVA);

        if (importeConIva > 100) {
            double importeDescuento = importeConIva * DESCUENTO; 
            importeConIva -= importeDescuento;
            System.out.println("Enhorabuena, tiene un descuento del " + DESCUENTO * 100 + "%: " + importeDescuento);           
        }
        System.out.println("El precio con iva es de: " + importeConIva + " euros");
    }
}
