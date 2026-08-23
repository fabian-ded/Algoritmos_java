package ALGORTMO_SWITCH;

public class Algoritmo_SW8 {
    public static void main(String[] args) {
        
        double km;
        double cancelar = 5000;
        double adiccional_km = 200;
        int solucion;

        System.out.println("Ingrese los kilometros recorrido: ");
        km = Double.parseDouble(System.console().readLine());

        solucion = km>=1000 ? 1 :
        km>=300 ? 2 : 3;

        switch (solucion) {
            case 1:
                double adiccional = 1000-300;
                double mas = adiccional*adiccional_km;
                double mas_mil = km-1000;
                double mas_valor = mas_mil * 150;
                double total = cancelar + mas + mas_valor;
                System.out.println("Valor a pagar por superar los 1000Km es de: " + total );
                break;
            case 2:
                double adiccional1 = km-300;
                double mas1 = adiccional1*adiccional_km;
                double total1 = mas1 + cancelar;
                System.out.println("Valor a pagar por superar los 300Km es de: " + total1 );
                break;
            case 3:
                System.out.println("Valor a pagar por no superar los 300Km es de: " + cancelar );
                break;
            default:
                throw new AssertionError();
        }

    }
}
