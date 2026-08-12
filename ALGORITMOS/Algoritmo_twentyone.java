package ALGORITMOS;
/* Un mayorista compra a un agricultor un lote de X naranjas a Bs. Y la docena. Después de vender
todas las naranjas a los detallistas, obtiene Bs. K. Calcular el porcentaje de ganancia obtenida en la
inversión. Pruebe su programa con los siguientes valores: X=48000, Y=6, K=42000 para obtener 75%
como resultado. */

public class Algoritmo_twentyone {
    public static void main(String[] args) {
        
        double lote = 48.000;
        double docena = 12;
        double valor_docena = 6;
        double ganancia = 42.000;

        System.out.println("Calculado.... ");

        double naranjas = lote/docena;
        double costo = naranjas*valor_docena;
        double ganancias = ganancia-costo;
        System.out.println("Calculado.... sus ganancias en dinero es de: " + ganancias);

        double porcentaje_ganancia = (ganancias/costo)*100;
        System.out.println("Calculado.... y su porcentaje es de " + porcentaje_ganancia);

    }
}