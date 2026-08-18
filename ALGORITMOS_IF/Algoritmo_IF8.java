/* Una compañía de alquiler de automóviles sin conductor, desea calcular y mostrar lo que debe pagar
cada cliente, de acuerdo a las siguientes condiciones:
a. Si no se rebasan los 300 km, se cancelan 5000 Bolívares
b. Si la distancia recorrida es superior a 300 km
 Pero inferior a 1000 se cobran 5000 Bolívares más 200 Bolívares por cada kilómetro
superior a 300.
 Si es superior a 1000 se cobran 5000 Bolívares más 200 Bolívares por cada kilómetro,
para las distancias entre 300 y 1000 kilómetros y 150 Bolívares por cada kilómetro para
las distancias mayores a 1000. */
package ALGORITMOS_IF;

public class Algoritmo_IF8 {
    public static void main(String[] args) {
        
        double km;
        double cancelar = 5000;
        double adiccional_km = 200;

        System.out.println("Ingrese los kilometros recorrido: ");
        km = Double.parseDouble(System.console().readLine());

        if(km>=1000){
            double adiccional = 1000-300;
            double mas = adiccional*adiccional_km;
            double mas_mil = km-1000;
            double mas_valor = mas_mil * 150;
            double total = cancelar + mas + mas_valor;
            System.out.println("Valor a pagar por superar los 1000Km es de: " + total );
        }else if(km>=300){
            double adiccional = km-300;
            double mas = adiccional*adiccional_km;
            double total = mas + cancelar;
            System.out.println("Valor a pagar por superar los 300Km es de: " + total );
        }else if (km<300) {
            System.out.println("Valor a pagar por no superar los 300Km es de: " + cancelar );
        }

    }
}
