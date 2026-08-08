/* El cambio de divisas en la bolsa de Madrid el 25/08/1987 fue el siguiente
100 chelines austríacos = 956.871 pesetas
1 dólar EEUU = 122.499 pesetas
100 dracmas griegos = 88.607 pesetas
100 francos belgas = 323.728 pesetas
1 franco francés = 20.110 pesetas
1 libra esterlina = 178.938 pesetas
100 liras italianas = 9.289 pesetas
Lea una cantidad en chelines austriacos e imprima el equivalente en pesetas. ya
Lea una cantidad en dracmas griegos e imprima su equivalente en francos franceses.  
Finalmente, lea una cantidad en pesetas e imprima su equivalente en dólares y liras italianas. */

public class Algoritmo_ten {
    public static void main(String[] args) {
        
        double moneda_aus;
        double moneda_drag;
        double pesetas;

        System.out.println("Monedas en chelines austriacos");
        moneda_aus = Double.parseDouble(System.console().readLine());
        double valor_drag = (moneda_aus*956.871)/100;
        System.out.println("Moneda de chelines autriacos a pesetas es de: " + valor_drag);

        System.out.println("Monedas en dragma");
        moneda_drag = Double.parseDouble(System.console().readLine());
        double valor_en_pesetas = (moneda_drag*88.607)/100;
        double valor_fran = valor_en_pesetas/20.110;
        System.out.println("Moneda de dracmas griegos a francos franceses es de: " + valor_fran);

        System.out.println("Monedas en pesetas");
        pesetas = Double.parseDouble(System.console().readLine());
        double valor_dol = pesetas/122.499;
        double valor_liras = (pesetas*9.289)/100;
        System.out.println("Moneda de pesetas a dólar EEUU es de: " + valor_dol);
        System.out.println("Moneda de pesetas a liras italianas es de: " + valor_liras);
    }
}