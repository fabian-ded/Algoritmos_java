package ALGORITMOS;
/* Suponga que a partir de una Tonelada de maíz una planta productora obtiene M kilogramos de
harina y N litros de aceite. La planta vende cada bulto de 24 paquetes de un kilogramo de harina en
Bs. B1 y cada caja de 15 envases de aceite en Bs. B2. Suponiendo que la planta vende todo lo que
produce, calcular el ingreso total por la venta de cada tonelada de maíz, sabiendo además que cada
kilogramo de harina y cada litro de aceite que restan del embalaje se venden al detal a los precios de
Bs. B3 y Bs. B4 respectivamente. Pruebe su algoritmo o programa con los sig. Valores: M=452,
N=197, B1=132, B2= 180, B3= 7,50 y B4= 14,50. Respuesta: 4895 */

public class Algoritmo_twentythree {
    public static void main(String[] args) {
        
        double tonelada;
        double M = 452;
        double N = 197;
        double B1 = 132;
        double B2 = 180;
        double B3 = 7.50;
        double B4 = 14.50;

        System.out.println("Cantidad de tonelada: ");
        tonelada = Double.parseDouble(System.console().readLine());

        double tonelada_harina = tonelada*M;
        double tonelada_aceite = tonelada*N;

        int venta_B1 = (int) (tonelada_harina/24);
        int venta_B2 = (int) (tonelada_aceite/15);
        
        double sobrante_harina = tonelada_harina-(venta_B1*24);
        double sobrante_litro = tonelada_aceite-(venta_B2*15);

        double ingreso_harina = (venta_B1*B1) + (sobrante_harina*B3);
        double ingreso_aceite = (venta_B2*B2) + (sobrante_litro*B4);

        double total = ingreso_aceite + ingreso_harina;

        System.out.println("Su total de venta de arina es de: " + ingreso_harina);
        System.out.println("Su total de venta de aceite es de: " + ingreso_aceite);
        System.out.println("Su total de venta de aceite y arina es de: " + total);

    }
}
