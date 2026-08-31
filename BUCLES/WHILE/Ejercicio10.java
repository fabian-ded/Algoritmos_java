package BUCLES.WHILE;

public class Ejercicio10 {
    public static void main(String[] args) {

        double K = 1;
        double suma= 0;
        double solucion = 0;

        while (suma + solucion <= 1000){
            if (suma < 1000){
                solucion = ((K*K)+1)/K;
                suma += solucion;
                K++;
                System.out.println("Numero: " + suma);
            }
        }

    }
}
