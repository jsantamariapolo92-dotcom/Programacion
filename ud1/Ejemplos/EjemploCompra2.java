package ud1.Ejemplos;

/** @author Polo **/

public class EjemploCompra2 {
    public static void main(String[] args) {
        double precio = 5.20; // precio de las unidades
        double unidades = 20; // numero de unidades 
        double IVA = 0.21; // porcentaje de IVA 
        double importe = precio*unidades; // precio total de 20 unidades a 5.20
double importeIVA = importe*IVA; // el 21% del total
        System.out.println(importeIVA+importe); //precio total+ el porcentaje con el IVA
    }
}
