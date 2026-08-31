package BUCLES.WHILE;
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

        while (vuelo <= cantidadVuelos) {

            System.out.println("\n========== VUELO #" + vuelo + " ==========");

            System.out.println("Ingrese el número del vuelo:");
            numeroVuelo = entrada.nextInt();

            System.out.println("Ingrese la cantidad de pasajeros:");
            cantidadPasajeros = entrada.nextInt();

            pasajero = 1;
            montoTotalVuelo = 0;

            mayorPesoPasajero = 0;
            menorPesoPasajero = Double.MAX_VALUE;

            while (pasajero <= cantidadPasajeros) {

                System.out.println("\n----- PASAJERO #" + pasajero + " -----");

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

                while (maleta <= cantidadMaletas) {

                    entrada.nextLine();

                    System.out.println("Ingrese el código de la maleta:");
                    String codigoMaleta = entrada.nextLine();

                    System.out.println("Ingrese el peso de la maleta en Kg:");
                    peso = entrada.nextDouble();

                    pesoTotal += peso;

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

                    if (peso > mayorPesoMaleta) {
                        mayorPesoMaleta = peso;
                        codigoMaletaMayor = codigoMaleta;
                    }

                    maleta++;
                }

                System.out.println("\nNúmero de vuelo: " + numeroVuelo);
                System.out.println("Código de abordo: " + codigoAbordo);
                System.out.println("Nombre: " + nombre);
                System.out.println("Peso total del equipaje: " + pesoTotal + " Kg");
                System.out.println("Monto a pagar: $" + calcularMonto(pesoTotal));

                if (pesoTotal > mayorPesoPasajero) {
                    mayorPesoPasajero = pesoTotal;
                }

                if (pesoTotal < menorPesoPasajero) {
                    menorPesoPasajero = pesoTotal;
                }

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
            }

            System.out.println("\n========== RESUMEN DEL VUELO ==========");
            System.out.println("Número de vuelo: " + numeroVuelo);
            System.out.println("Monto total cancelado por equipaje: $" + montoTotalVuelo);
            System.out.println("Mayor peso total de equipaje de un pasajero: "
                    + mayorPesoPasajero + " Kg");
            System.out.println("Menor peso total de equipaje de un pasajero: "
                    + menorPesoPasajero + " Kg");

            vuelo++;
        }

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
