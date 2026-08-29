/* Calcule e imprima el número de términos necesarios para que el valor de la siguiente sumatoria se
aproxime los más cercanamente a 1000 sin que lo exceda: ∑((k∧2+1)/k), donde k=1,2,3,4,... */

package BUCLES.DO_WHILE;

public class Ejercicio10 {
    public static void main(String[] args) {

        double K = 1;
        double suma= 0;
        double solucion = 0;

        do {

            if (suma < 1000){
                solucion = ((K*K)+1)/K;
                suma += solucion;
                K++;
                System.out.println("Numero: " + suma);
            }

        }while (suma + solucion <= 1000);

    }
}
