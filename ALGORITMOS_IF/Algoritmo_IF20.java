/* El dueño de una empresa desea planificar las decisiones financieras que tomará en el siguiente
año. La manera de planificarlas depende de lo siguiente: Si actualmente su capital se encuentra
con saldo negativo, pedirá un préstamo bancario para que su nuevo saldo sea de $10000. si su
capital tiene actualmente un saldo positivo pedirá un préstamo bancario para tener un nuevo saldo
de $20000, pero si su capital tiene actualmente un saldo superior a los $20000 no pedirá ningún
préstamo.
Posteriormente repartirá su presupuesto de la siguiente manera:
$5000 para equipo de cómputo
$2000 para mobiliario y del resto la mitad será para la compra de insumos y la otra para
otorgar incentivos al personal.
Desplegar qué cantidades se destinarán para la compra de insumos e incentivos al personal y, en caso
de que fuera necesario, a cuánto ascendería la cantidad que se pediría al banco. */
package ALGORITMOS_IF;

public class Algoritmo_IF20 {
    public static void main(String[] args) {

        double capital;
        double prestamo;
        double presupuesto;

        System.out.println("Ingrese el capital actual: ");
        capital = Double.parseDouble(System.console().readLine());

        if (capital < 10000) {

            prestamo = 10000 - capital;
            presupuesto = capital + prestamo;

        } else if (capital <= 20000) {

            prestamo = 20000 - capital;
            presupuesto = capital + prestamo;

        } else {

            prestamo = 0;
            presupuesto = capital;
        }

        double restante = presupuesto - 5000 - 2000;

        double insumos = restante / 2;
        double incentivos = restante / 2;

        System.out.println("Cantidad del prestamo: " + prestamo);
        System.out.println("Cantidad para compra de insumos: " + insumos);
        System.out.println("Cantidad para incentivos al personal: " + incentivos);
    }
}
