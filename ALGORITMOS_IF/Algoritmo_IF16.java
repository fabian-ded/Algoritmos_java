/* Una persona se encuentra en la disyuntiva de comprar un automóvil o un terreno, los cuales
cuestan exactamente la misma cantidad de dinero. Sabe que mientras el automóvil se devalúa,
con el terreno sucede lo contrario. Esta persona comprará el automóvil si al cabo de tres años la
devaluación de éste no es mayor que la mitad del incremento del valor del terreno. Ayúdele a esta
persona a determinar si debe o no comprar el automóvil. */
package ALGORITMOS_IF;

public class Algoritmo_IF16 {
    public static void main(String[] args) {

        double precio;
        double devaluacion;
        double incremento;

        System.out.println("Ingrese el precio del automovil y del terreno: ");
        precio = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el porcentaje de devaluacion anual del automovil: ");
        devaluacion = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el porcentaje de incremento anual del terreno: ");
        incremento = Double.parseDouble(System.console().readLine());

        double valorAuto = precio * Math.pow(1 - devaluacion / 100, 3);
        double perdidaAuto = precio - valorAuto;

        double valorTerreno = precio * Math.pow(1 + incremento / 100, 3);
        double gananciaTerreno = valorTerreno - precio;

        double mitadGanancia = gananciaTerreno / 2;

        if (perdidaAuto <= mitadGanancia) {
            System.out.println("Debe comprar el automovil.");
            System.out.println("Mitad de la ganancia del terreno: " + mitadGanancia);
        } else {
            System.out.println("No debe comprar el automovil.");
            System.out.println("Perdida del automovil: " + perdidaAuto);
            System.out.println("Ganancia del terreno: " + gananciaTerreno);
        }

    }
}