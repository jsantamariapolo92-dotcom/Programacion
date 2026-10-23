package ud2.ejercicios;

public class ComprobarHora {

    static void compruebaHora(int hora, int minutos, int segundos) {

        boolean esHoraCorrecta = !(hora < 0 || hora > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos 59);
    System.out.println(esHoraCorrecta);
    }

    public static void main(String[] args) {
        compruebaHora(0, 0, 0);
        compruebaHora(-1, 0, 0);
        compruebaHora(0, 0, 0);
        compruebaHora(0, 0, 60);
    }
}
