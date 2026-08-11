/* Un comerciante de computadores ofrece P precio por compra al contado ó 12 cuotas de T Bolívares
cada una. Desarrolle un programa para calcular y mostrar cuál es el porcentaje que se cobra por el
recargo en el pago del computador por cuotas. */

public class Algoritmo_twentytwo {
    public static void main(String[] args) {
        
        double cuota = 12;
        double pre_cuotas;
        double precio_contado;
        
        System.out.println("precio de contado: ");
        precio_contado = Double.parseDouble(System.console().readLine());
        System.out.println("precio por cada cuota: ");
        pre_cuotas = Double.parseDouble(System.console().readLine());

        double total_cuotas = pre_cuotas*cuota;
        double recargo = total_cuotas - precio_contado;
        double por_recargo = (recargo/precio_contado)*100;

        System.out.println("Porcentaje a pagar por recargo es de: " + por_recargo);
    }
}
