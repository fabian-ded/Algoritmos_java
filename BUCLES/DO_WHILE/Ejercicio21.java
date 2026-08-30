/* Una aerolínea está interesada en diseñar un software que le permita calcular y acumular los montos
a pagar por equipaje para cada uno de sus vuelos. El algoritmo debe procesar todos los vuelos del
día con sus respectivos pasajeros y maletas, las cuales están identificadas por un código. Las tarifas
por kilogramos se muestran en la siguiente tabla:
PESOS TARIFA POR Kgs.
1 a 3 Kgs. 0
3.01 a 6 Kgs 600
6.01 a 9 Kgs 1200
9.01 a 12 Kgs 1500
12.01 a 15 Kgs 2000
más de 15 Kgs. 2500

Se quiere un algoritmo en seudocódigo o diagrama estructurado que permita:

i. Imprimir por pasajero el número de vuelo, el código de abordo, el nombre, el total
de kilogramos del equipaje con su respectivo monto a pagar.
ii. Imprimir por pasajero el número de vuelo, el nombre y el código de la maleta con
mayor peso.

1
3

iii. Imprimir para cada vuelo el número de vuelo, el código de abordo, el nombre y el
peso total para el pasajero con mayor y menor peso total del equipaje.
iv. Imprimir para cada vuelo el número de vuelo y el monto total cancelado por
equipaje.
v. Imprimir el porcentaje de pasajeros que no pagaron por equipaje.

NOTA: No se podrán utilizar vectores ni matrices. */

package BUCLES.DO_WHILE;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeroVuelo;
        int codigoAbordo;
        String nombre;

        int cantidadVuelos;
        int cantidadPasajeros;
        int cantidadMaletas;

        int vuelo = 1;
        int pasajero;
        int maleta;

        double peso;
        double pesoTotal;
        double monto;
        double montoTotalVuelo;

        double mayorPesoMaleta;
        String codigoMaletaMayor;

        double mayorPesoPasajero;
        double menorPesoPasajero;

        int pasajerosSinPago = 0;
        int totalPasajeros = 0;

        System.out.println("Ingrese la cantidad de vuelos del día:");
        cantidadVuelos = entrada.nextInt();

        do {

            System.out.println("\n========== VUELO #" + vuelo + " ==========");

            System.out.println("Ingrese el número del vuelo:");
            numeroVuelo = entrada.nextInt();

            System.out.println("Ingrese la cantidad de pasajeros:");
            cantidadPasajeros = entrada.nextInt();

            pasajero = 1;
            montoTotalVuelo = 0;

            // Valores iniciales para comparar pasajeros
            mayorPesoPasajero = 0;
            menorPesoPasajero = Double.MAX_VALUE;

            do {

                System.out.println("\n----- PASAJERO #" + pasajero + " -----");

                entrada.nextLine();

                System.out.println("Ingrese el código de abordo:");
                codigoAbordo = entrada.nextInt();

                entrada.nextLine();

                System.out.println("Ingrese el nombre:");
                nombre = entrada.nextLine();

                System.out.println("Ingrese la cantidad de maletas:");
                cantidadMaletas = entrada.nextInt();

                pesoTotal = 0;

                mayorPesoMaleta = 0;
                codigoMaletaMayor = "";

                maleta = 1;

                do {

                    entrada.nextLine();

                    System.out.println("Ingrese el código de la maleta:");
                    String codigoMaleta = entrada.nextLine();

                    System.out.println("Ingrese el peso de la maleta en Kg:");
                    peso = entrada.nextDouble();

                    pesoTotal += peso;

                    // Determinar tarifa
                    if (peso >= 1 && peso <= 3) {
                        monto = 0;
                    } else if (peso <= 6) {
                        monto = peso * 600;
                    } else if (peso <= 9) {
                        monto = peso * 1200;
                    } else if (peso <= 12) {
                        monto = peso * 1500;
                    } else if (peso <= 15) {
                        monto = peso * 2000;
                    } else {
                        monto = peso * 2500;
                    }

                    montoTotalVuelo += monto;

                    // Determinar maleta de mayor peso
                    if (peso > mayorPesoMaleta) {
                        mayorPesoMaleta = peso;
                        codigoMaletaMayor = codigoMaleta;
                    }

                    maleta++;

                } while (maleta <= cantidadMaletas);

                // Mostrar información del pasajero
                System.out.println("\nNúmero de vuelo: " + numeroVuelo);
                System.out.println("Código de abordo: " + codigoAbordo);
                System.out.println("Nombre: " + nombre);
                System.out.println("Peso total del equipaje: " + pesoTotal + " Kg");
                System.out.println("Monto a pagar: $" + calcularMonto(pesoTotal));

                // Mayor y menor peso total entre pasajeros
                if (pesoTotal > mayorPesoPasajero) {
                    mayorPesoPasajero = pesoTotal;
                }

                if (pesoTotal < menorPesoPasajero) {
                    menorPesoPasajero = pesoTotal;
                }

                // Pasajero sin pago
                if (calcularMonto(pesoTotal) == 0) {
                    pasajerosSinPago++;
                }

                totalPasajeros++;

                System.out.println(
                        "Maleta de mayor peso: "
                                + codigoMaletaMayor
                                + " - "
                                + mayorPesoMaleta
                                + " Kg"
                );

                pasajero++;

            } while (pasajero <= cantidadPasajeros);

            System.out.println("\n========== RESUMEN DEL VUELO ==========");
            System.out.println("Número de vuelo: " + numeroVuelo);
            System.out.println("Monto total cancelado por equipaje: $" + montoTotalVuelo);
            System.out.println("Mayor peso total de equipaje de un pasajero: "
                    + mayorPesoPasajero + " Kg");
            System.out.println("Menor peso total de equipaje de un pasajero: "
                    + menorPesoPasajero + " Kg");

            vuelo++;

        } while (vuelo <= cantidadVuelos);

        double porcentajeSinPago =
                (double) pasajerosSinPago / totalPasajeros * 100;

        System.out.println("\n========== RESULTADOS GENERALES ==========");
        System.out.println(
                "Porcentaje de pasajeros que no pagaron por equipaje: "
                        + porcentajeSinPago + "%"
        );
    }

    public static double calcularMonto(double peso) {

        double monto;

        if (peso >= 1 && peso <= 3) {
            monto = 0;
        } else if (peso <= 6) {
            monto = peso * 600;
        } else if (peso <= 9) {
            monto = peso * 1200;
        } else if (peso <= 12) {
            monto = peso * 1500;
        } else if (peso <= 15) {
            monto = peso * 2000;
        } else {
            monto = peso * 2500;
        }

        return monto;
    }
}
