package ALGORITMOS;
/* Una empresa X trabaja con láminas de hierro para fabricar una pieza. Se conoce que (a) la lámina
mide en promedio 4 metros de largo por 1.5 metros de ancho; (b) la pieza a fabricar consume 0.5
metros en total. Se requiere que calcule y muestre cuántas piezas se fabrican con una lámina y
cuánto será el desperdicio. */

public class Algorirtmo_sixteen {
    public static void main(String[] args) {
        
        double laminas;
        double largo = 4;
        double ancho = 1.5;
        double consumo = 0.5;

        System.out.println("Cantidad de laminas: ");
        laminas = Double.parseDouble(System.console().readLine());

        double material = (largo*ancho)*laminas;
        double cantidad = material/consumo;
        double migajas = material-(cantidad*consumo);

        System.out.println("cantidad : " + cantidad);
        System.out.println("tu porcentaje de sobras es de : " + migajas); 
    }
}
