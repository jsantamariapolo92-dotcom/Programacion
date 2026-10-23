package ud1.Ejemplos;

public class EjerciciosConversion {
    public static void main(String[] args) {

        // Ejercicio 1: Conversión implícita entre enteros y decimales

        int a = 10;
        double b = a;
        System.out.println(b);

        // Ejercicio 2: Conversión explícita con casting entre double e int

        double x = 9.99;
        int y = (int) x;
        System.out.println(y);

        // Ejercicio 3: Conversión implícita entre tipos primitivos

        short s = 5;
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        System.out.println(d);

        // Ejercicio 4: Divisiones

        int a2 = 5;
        int b2 = 2;
        double resultado = a2 / b2;
        System.out.println(resultado);

        // Ejercicio 5: Casting de int a char

        int num = 80;
        char letra = (char) num;
        System.out.println(letra);
        letra += ('a' - 'A');
        System.out.println(letra);

        // Ejercicio 6: Conversión de tipos en operaciones con literales

        int x2 = 100;
        double y2 = 20.5;
        int resultado2 = (int) (x2 + y2);
        System.out.println(resultado2);

        // Ejercicio 7: Casting con pérdida de información

        long grande = 9876543210L;
        int pequeno = (int) grande;
        System.out.println(pequeno);
        // Ejercicio 8: Conversión de tipos con caracteres y números

        char c = 'A';
        int ascii = (int) c;
        System.out.println(ascii);

        // Ejercicio 9: Conversión de tipos con byte y operaciones aritméticas

        byte b3 = 127;
        b3++;
        System.out.println(b3);
        b3--;
        System.out.println(b3);

        // Ejercicio 10: Conversión de String a tipos numéricos

        String numeroEnTexto = "100";
        int numero4 = Integer.parseInt(numeroEnTexto);
        System.out.println(numero4);

        // Ejercicios Combinados
        // Ejercicio 1:

        int a4 = 5;
        double b4 = 6.4;
        float c4 = (float) b4 + a4 / 2.0f;
        System.out.println(c4);

        // Ejercicio 2:

        byte x1 = 50;
        int y1 = 200;
        double resultado5 = (double) ((x1 + y1) / 3);
        System.out.println(resultado5);

        //Ejemplos Libres

        boolean resultado6 = 4 + 5 > 10 - 3;
        System.out.println(resultado6);

        int a6 = 8, b6 = 3, c6= 6;
        c6 -= a6 / b6 + 2 * (b6++);
        System.out.println(c6);
        System.out.println(b6);

        boolean resultado7 = (8 * 2 + 1) >= (5 + 10 / 2) && 7 % 2 == 1;
        System.out.println(resultado7);

        int x8 = 4, y8 = 7;
        int resultado8 = ++x8 * (y8-- + 2) - x8++;
        System.out.println(resultado8);
        System.out.println(x8);
        System.out.println(y8);

    }
}
