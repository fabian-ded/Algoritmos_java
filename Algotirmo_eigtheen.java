/* Resuelva el problema que tienen en una gasolinera. Los surtidores de la misma registran lo que
surten en galones, pero el precio de la gasolina está fijado en litros. Se requiere que calcule y muestre
lo que hay que cobrarle a un cliente, considerando que: (a) cada galón tiene 3.785 litros; (b) el precio
del litro es de 100 Bolívares. */

public class Algotirmo_eigtheen {
    public static void main(String[] args) {
        
        double galones;
        double precio = 100;
        double litros =3.785; 

        System.out.println("Total de galones a comprar: ");
        galones = Double.parseDouble(System.console().readLine());

        double lit_galones = (galones*litros);
        double valor_total = lit_galones*precio;

        System.out.println("Valor a pagar: " + valor_total);

    }
}
