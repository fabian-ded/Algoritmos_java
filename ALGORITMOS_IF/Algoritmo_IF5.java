/* Una empresa quiere hacer una compra de varias piezas de la misma clase a un fabricante de
refacciones. La empresa dependiendo del monto total de la compra, decidirá qué hacer para pagar
al fabricante. Si el monto total de la compra excede de $500000 la empresa tendrá la capacidad
de invertir de su propio dinero un 55% del monto de la compra, pedir presta al banco un 30% y el
resto lo pagará solicitando un crédito al fabricante. Si el monto total de la compra no excede de
$500000 la empresa tendrá capacidad de invertir de su propio dinero un 70% y el restante 30% lo
pagará solicitando crédito al fabricante. El fabricante cobra por concepto de intereses un 20%
sobre la cantidad que se le pague a crédito. Calcule y muestre la cantidad a invertir de los fondos
de la empresa, la cantidad a pagar a crédito, el monto a pagar por intereses y si es necesario, la
cantidad prestada al banco. */
package ALGORITMOS_IF;

public class Algoritmo_IF5 {
    public static void main(String[] args) {
        
        double piezas;
        double valor = 100000;
        double monto_total = 500000;


        System.out.println("Ingrese la cantidad de piezas: ");
        piezas = Double.parseDouble(System.console().readLine());

        double valor_pieza = piezas*valor;

        if(valor_pieza>monto_total){
            double inversion = (valor_pieza*55)/100;
            double prestamo = (valor_pieza*30)/100;
            double total = valor_pieza-(inversion + prestamo);
            double interes = (total*20)/100;
            System.out.println("La cantidad que se invirtio es de: " + inversion);
            System.out.println("La cantidad a pagar del credito: " + total);
            System.out.println("La cantidad a pagar de credito: " + interes);
            System.out.println("La cantidad a pagar de interes: " + prestamo);
        }else if (valor_pieza<=monto_total) {
            double inversion = (valor_pieza*70)/100;
            double prestamo = (valor_pieza*30)/100;
            double interes = (prestamo*20)/100;
            System.out.println("La cantidad que se invirtio es de: " + inversion);
            System.out.println("La cantidad a pagar de interes: " + interes);
            System.out.println("La cantidad a pagar de credito: " + prestamo);
        }

    }
}
