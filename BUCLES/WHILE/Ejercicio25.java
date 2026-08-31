package BUCLES.WHILE;
import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double temperaturaMaxima;
        double temperaturaMinima;

        int dias = 0;
        int errores = 0;

        double sumaMaximas = 0;
        double sumaMinimas = 0;

        System.out.println("Ingrese la temperatura máxima:");
        temperaturaMaxima = entrada.nextDouble();

        System.out.println("Ingrese la temperatura mínima:");
        temperaturaMinima = entrada.nextDouble();

        while (temperaturaMaxima != 0 || temperaturaMinima != 0) {

            dias++;

            if (temperaturaMaxima < 14 || temperaturaMaxima > 30 ||
                    temperaturaMinima < 14 || temperaturaMinima > 30) {

                errores++;

            } else {

                sumaMaximas += temperaturaMaxima;
                sumaMinimas += temperaturaMinima;
            }

            System.out.println("\nIngrese la temperatura máxima:");
            temperaturaMaxima = entrada.nextDouble();

            System.out.println("Ingrese la temperatura mínima:");
            temperaturaMinima = entrada.nextDouble();
        }

        System.out.println("\n========== RESULTADOS ==========");

        // g. Número de días
        System.out.println("g. Número de días proporcionados: " + dias);

        // h. Medias máxima y mínima
        if (dias - errores > 0) {

            double mediaMaxima = sumaMaximas / (dias - errores);
            double mediaMinima = sumaMinimas / (dias - errores);

            System.out.println("h. Media máxima: " + mediaMaxima);
            System.out.println("   Media mínima: " + mediaMinima);

        } else {

            System.out.println(
                    "h. No existen temperaturas válidas para calcular las medias."
            );
        }

        // i. Número de errores
        System.out.println("i. Número de errores: " + errores);

        // j. Porcentaje de errores
        if (dias > 0) {

            double porcentajeErrores =
                    (double) errores / dias * 100;

            System.out.println(
                    "j. Porcentaje de errores: "
                            + porcentajeErrores + "%"
            );

        } else {

            System.out.println("j. No se ingresaron días.");
        }
    }
}
