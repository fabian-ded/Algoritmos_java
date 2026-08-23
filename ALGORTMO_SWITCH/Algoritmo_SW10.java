package ALGORTMO_SWITCH;

public class Algoritmo_SW10 {
    public static void main(String[] args) {
        
        double valor;
        String Nombre;
        int solucion;

        System.out.println("Nombre del cliente: ");
        Nombre = System.console().readLine();
        System.out.println("Valor de la compra: ");
        valor = Double.parseDouble(System.console().readLine());

        solucion = valor >= 15000 ? 1 :
        valor >= 7000 ? 2 :
        valor >= 1000 ? 3 :
        valor >= 500 ? 4 : 5;

        switch (solucion) {
            case 1:
                int descuento = (int) ((valor)-(valor * 0.25));
                System.out.println("Nombre del cliente: " + Nombre);
                System.out.println("Monto de la compra: " + valor);
                System.out.println("Valor a pagar: " + valor);
                System.out.println("Valor de la compra con descuento del 25%: " + descuento);
                break;
            case 2:
                int descuento2 = (int) ((valor)-(valor * 0.18));
                System.out.println("Nombre del cliente: " + Nombre);
                System.out.println("Monto de la compra: " + valor);
                System.out.println("Valor a pagar: " + valor);
                System.out.println("Valor de la compra con descuento del 18%: " + descuento2);
                break;
            case 3:
                int descuento3 = (int) ((valor)-(valor * 0.11));
                System.out.println("Nombre del cliente: " + Nombre);
                System.out.println("Monto de la compra: " + valor);
                System.out.println("Valor a pagar: " + valor);
                System.out.println("Valor de la compra con descuento del 11%: " + descuento3);
                break;
            case 4:
                int descuento4 = (int) ((valor)-(valor * 0.5));
                System.out.println("Nombre del cliente: " + Nombre);
                System.out.println("Monto de la compra: " + valor);
                System.out.println("Valor a pagar: " + valor);
                System.out.println("Valor de la compra con descuento del 5%: " + descuento4);
                break;
            case 5:
                System.out.println("Nombre del cliente: " + Nombre);
                System.out.println("Monto de la compra: " + valor);
                System.out.println("Valor a pagar: " + valor);
                System.out.println("Valor de la compra es de: " + valor);
                break;
            default:
                throw new AssertionError();
        }


    }
}
