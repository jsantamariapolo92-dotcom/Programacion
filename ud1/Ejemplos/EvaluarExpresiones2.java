package ud1.Ejemplos;

public class EvaluarExpresiones2 {

    public static void main(String[] args) {
        
        int resultado = 10;
resultado += 5 - 3 * 2; //Resultado = 9
System.out.println(resultado);

boolean resultado1 = 4 + 5 > 10 - 3; // 9 > 7 = true
System.out.println(resultado1);

boolean resultado2 = 5 > 3 && 8 < 6 || 3 == 3; // 3 = 3; T && F || T = true
System.out.println(resultado2);


int resultado3 = (4 + 3) * 2 - 6 / 3; //Resultado = 12
System.out.println(resultado3);

int a = 10, b = 20;
int resultado4 = a > b ? a : b; // 20
System.out.println(resultado4);

int x = 5;
int resultado5 = ++x * 2; // 12
System.out.println(resultado5);    

}
}
