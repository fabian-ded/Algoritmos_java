/* El gobierno del estado de México desea reforestar un bosque que mide determinado número de
hectáreas. Si la superficie del terreno excede a 1 millón de metros cuadrados, entonces decidirá
sembrar de la siguiente manera:
PORCENTAJE DE LA SUPERFICIE DEL BOSQUE TIPO DE ÁRBOL
70% Pino
20% Oyamel
10% Cedro
Si la superficie del terreno es menor o igual a un millón de metros cuadrados, entonces decidirá
sembrar de la siguiente manera:
PORCENTAJE DE LA SUPERFICIE DEL BOSQUE TIPO DE ÁRBOL
50% Pino
30% Oyamel
20% Cedro
El gobierno desea saber el número de pinos, oyameles y cedros que tendrá que sembrar en el bosque,
si se sabe que en 10 metros cuadrados caben 8 pinos, en 15 metros cuadrados caben 15 oyameles y
en 18 metros cuadrados caben 10 cedros. También se sabe que una hectárea equivale a 10 mil
metros cuadrados. */
package ALGORITMOS_IF;

public class Algoritmo_IF18 {
    public static void main(String[] args) {

        double hectareas;
        double pinos;
        double oyameles;
        double cedros;

        System.out.println("Ingrese la cantidad de hectareas: ");
        hectareas = Double.parseDouble(System.console().readLine());

        double superficie = hectareas * 10000;

        if (superficie > 1000000) {

            double superficiePino = superficie * 0.70;
            double superficieOyamel = superficie * 0.20;
            double superficieCedro = superficie * 0.10;

            pinos = (superficiePino * 8) / 10;
            oyameles = (superficieOyamel * 15) / 15;
            cedros = (superficieCedro * 10) / 18;

        } else {

            double superficiePino = superficie * 0.50;
            double superficieOyamel = superficie * 0.30;
            double superficieCedro = superficie * 0.20;

            pinos = (superficiePino * 8) / 10;
            oyameles = (superficieOyamel * 15) / 15;
            cedros = (superficieCedro * 10) / 18;
        }

        System.out.println("Cantidad de pinos: " + pinos);
        System.out.println("Cantidad de oyameles: " + oyameles);
        System.out.println("Cantidad de cedros: " + cedros);
    }
}
