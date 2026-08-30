/* Una persona adquiere una deuda de Bs. 12775, la cual cancela mediante pagos de montos crecientes
de los cuales el primero es por Bs. 100 y además la diferencia de dos pagos consecutivos es Bs. 125.
Determinar el número de pagos que realiza la persona así como el monto del último pago. Muestre
en pantalla una tabla con el monto de cada pago y el monto pendiente por cancelar. Respuesta:
número pagos = 14, monto del último = 1725. */

package BUCLES.DO_WHILE;
import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double deuda = 12775;
        double pago = 100;
        double aumento = 125;
        double pendiente = deuda;

        int numeroPago = 0;

        System.out.println("========== TABLA DE PAGOS ==========");
        System.out.println("Pago\tMonto\tPendiente");

        do {

            numeroPago++;

            // Si el pago supera la deuda, se paga solamente lo pendiente
            if (pago > pendiente) {
                pago = pendiente;
            }

            pendiente -= pago;

            System.out.println(
                    numeroPago + "\t"
                            + pago + "\t"
                            + pendiente
            );

            pago += aumento;

        } while (pendiente > 0);

        System.out.println("\nNúmero de pagos: " + numeroPago);
        System.out.println("Monto del último pago: " + pago);

    }
}
