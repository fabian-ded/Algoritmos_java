/* en una tienda efectúan un descuento a los clientes dependiendo del monto de la compra. El
descuento se efectúa con base en el siguiente criterio:
a. Si el monto es inferior a $500, no hay descuento.
b. Si está comprendido entre $500 y $1000 inclusive, se hace un descuento del 5%
c. Si está comprendido entre $1000 y $7000 inclusive, se hace un descuento del 11%
d. Si está comprendido entre $7000 y $15000 inclusive, el descuento es del
18%
e. Si el monto es mayor a $15000, hay un 25% de descuento.
Calcule y muestre el nombre del cliente, el monto de la compra, monto a pagar y descuento recibido. */
package ALGORITMOS_IF;

public class Algoritmo_IF10 {
    public static void main(String[] args) {
        
        double valor;
        String Nombre;
        
        System.out.println("Nombre del cliente: ");
        Nombre = System.console().readLine();
        System.out.println("Valor de la compra: ");
        valor = Double.parseDouble(System.console().readLine());
        
        if(valor>=15000){
            int descuento = (int) ((valor)-(valor * 0.25));
            System.out.println("Nombre del cliente: " + Nombre);
            System.out.println("Monto de la compra: " + valor);
            System.out.println("Valor a pagar: " + valor);
            System.out.println("Valor de la compra con descuento del 25%: " + descuento);
        }else if (valor>=7000) {
            int descuento = (int) ((valor)-(valor * 0.18));
            System.out.println("Nombre del cliente: " + Nombre);
            System.out.println("Monto de la compra: " + valor);
            System.out.println("Valor a pagar: " + valor);
            System.out.println("Valor de la compra con descuento del 18%: " + descuento);
        }else if (valor>=1000) {
            int descuento = (int) ((valor)-(valor * 0.11));
            System.out.println("Nombre del cliente: " + Nombre);
            System.out.println("Monto de la compra: " + valor);
            System.out.println("Valor a pagar: " + valor);
            System.out.println("Valor de la compra con descuento del 11%: " + descuento);
        }else if (valor>=500) {
            int descuento = (int) ((valor)-(valor * 0.5));
            System.out.println("Nombre del cliente: " + Nombre);
            System.out.println("Monto de la compra: " + valor);
            System.out.println("Valor a pagar: " + valor);
            System.out.println("Valor de la compra con descuento del 5%: " + descuento);
        }else{
            System.out.println("Nombre del cliente: " + Nombre);
            System.out.println("Monto de la compra: " + valor);
            System.out.println("Valor a pagar: " + valor);
            System.out.println("Valor de la compra es de: " + valor);
        }
        

    }
}
