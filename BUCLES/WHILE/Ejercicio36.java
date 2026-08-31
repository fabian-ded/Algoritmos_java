package BUCLES.WHILE;
import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cantidadEstados;
        int estado = 1;

        System.out.println("Ingrese la cantidad de estados:");
        cantidadEstados = entrada.nextInt();

        while (estado <= cantidadEstados) {

            System.out.println("\n========== ESTADO #" + estado + " ==========");

            int codigoEstado;
            String nombreEstado;
            int cantidadCiudades;

            System.out.println("Ingrese el código del estado (2 dígitos):");
            codigoEstado = entrada.nextInt();

            entrada.nextLine();

            System.out.println("Ingrese el nombre del estado:");
            nombreEstado = entrada.nextLine();

            System.out.println("Ingrese la cantidad de ciudades:");
            cantidadCiudades = entrada.nextInt();

            int ciudad = 1;

            double totalNetoEstado = 0;
            int ciudadesNoAlcanzaron = 0;
            int ciudadesEntre40y60 = 0;

            while (ciudad <= cantidadCiudades) {

                System.out.println("\n---------- CIUDAD #" + ciudad + " ----------");

                int codigoCiudad;
                String nombreCiudad;
                int unidadesEsperadas;
                int cantidadCanales;

                System.out.println("Ingrese el código de la ciudad:");
                codigoCiudad = entrada.nextInt();

                entrada.nextLine();

                System.out.println("Ingrese el nombre de la ciudad:");
                nombreCiudad = entrada.nextLine();

                System.out.println("Ingrese la cantidad de unidades esperadas:");
                unidadesEsperadas = entrada.nextInt();

                System.out.println("Ingrese la cantidad de canales:");
                cantidadCanales = entrada.nextInt();

                int canal = 1;

                int totalUnidadesCiudad = 0;
                double totalBrutoCiudad = 0;
                double comisionTiendaCiudad = 0;
                double comisionCalleCiudad = 0;

                double mayorVentaCanal = 0;
                int codigoCanalMayorVenta = 0;

                int menorUnidadesVendedor = Integer.MAX_VALUE;
                int codigoVendedorMenorUnidades = 0;

                while (canal <= cantidadCanales) {

                    System.out.println(
                            "\n------ CANAL #" + canal + " ------"
                    );

                    int codigoCanal;
                    int cantidadVendedores;

                    System.out.println("Ingrese el código del canal:");
                    codigoCanal = entrada.nextInt();

                    System.out.println("Ingrese la cantidad de vendedores:");
                    cantidadVendedores = entrada.nextInt();

                    int vendedor = 1;

                    double totalVentaCanal = 0;
                    double comisionCanal = 0;

                    while (vendedor <= cantidadVendedores) {

                        System.out.println(
                                "\nVendedor #" + vendedor
                        );

                        int codigoVendedor;
                        int unidadesVendidas;
                        double montoVendido;

                        System.out.println("Ingrese el código del vendedor:");
                        codigoVendedor = entrada.nextInt();

                        System.out.println("Ingrese las unidades vendidas:");
                        unidadesVendidas = entrada.nextInt();

                        System.out.println("Ingrese el monto total vendido:");
                        montoVendido = entrada.nextDouble();

                        totalUnidadesCiudad += unidadesVendidas;
                        totalBrutoCiudad += montoVendido;

                        totalVentaCanal += montoVendido;

                        int tipoVendedor = codigoVendedor / 1000;

                        if (tipoVendedor == 11) {

                            comisionTiendaCiudad += montoVendido * 0.10;
                            comisionCanal += montoVendido * 0.10;

                        } else if (tipoVendedor == 12) {

                            comisionCalleCiudad += montoVendido * 0.15;
                            comisionCanal += montoVendido * 0.15;
                        }

                        if (unidadesVendidas < menorUnidadesVendedor) {

                            menorUnidadesVendedor = unidadesVendidas;
                            codigoVendedorMenorUnidades = codigoVendedor;
                        }

                        vendedor++;
                    }

                    /*
                     * Venta neta del canal:
                     * venta bruta - comisión del canal.
                     */
                    double ventaNetaCanal =
                            totalVentaCanal - comisionCanal;

                    if (ventaNetaCanal > mayorVentaCanal) {

                        mayorVentaCanal = ventaNetaCanal;
                        codigoCanalMayorVenta = codigoCanal;
                    }

                    canal++;
                }

                /*
                 * Monto neto total de la ciudad.
                 */
                double totalComisionesCiudad =
                        comisionTiendaCiudad + comisionCalleCiudad;

                double montoNetoCiudad =
                        totalBrutoCiudad - totalComisionesCiudad;

                totalNetoEstado += montoNetoCiudad;

                /*
                 * Porcentaje de unidades alcanzadas
                 * respecto a las unidades esperadas.
                 */
                double porcentajeEsperado = 0;

                if (unidadesEsperadas > 0) {

                    porcentajeEsperado =
                            (double) totalUnidadesCiudad
                                    / unidadesEsperadas * 100;
                }

                /*
                 * Ciudad que no alcanzó las unidades esperadas.
                 */
                if (totalUnidadesCiudad < unidadesEsperadas) {

                    ciudadesNoAlcanzaron++;
                }

                /*
                 * Entre 40% y 60% por encima de lo esperado:
                 * 140% hasta 160%.
                 */
                if (porcentajeEsperado >= 140
                        && porcentajeEsperado <= 160) {

                    ciudadesEntre40y60++;
                }

                System.out.println("\n===== RESULTADO DE LA CIUDAD =====");

                System.out.println(
                        "Código: " + codigoCiudad
                );

                System.out.println(
                        "Nombre: " + nombreCiudad
                );

                System.out.println(
                        "Total unidades vendidas: "
                                + totalUnidadesCiudad
                );

                System.out.println(
                        "Monto bruto: $"
                                + totalBrutoCiudad
                );

                System.out.println(
                        "Comisión vendedores de tienda: $"
                                + comisionTiendaCiudad
                );

                System.out.println(
                        "Comisión vendedores de calle: $"
                                + comisionCalleCiudad
                );

                System.out.println(
                        "Canal con mayor monto neto: "
                                + codigoCanalMayorVenta
                );

                System.out.println(
                        "Vendedor con menor número de unidades: "
                                + codigoVendedorMenorUnidades
                );

                ciudad++;
            }

            double porcentajeNoAlcanzaron =
                    (double) ciudadesNoAlcanzaron
                            / cantidadCiudades * 100;

            System.out.println(
                    "\n========== RESULTADO DEL ESTADO =========="
            );

            System.out.println(
                    "Código del Estado: " + codigoEstado
            );

            System.out.println(
                    "Nombre del Estado: " + nombreEstado
            );

            System.out.println(
                    "Monto neto vendido: $"
                            + totalNetoEstado
            );

            System.out.println(
                    "Porcentaje de ciudades que no alcanzaron "
                            + "lo esperado: "
                            + porcentajeNoAlcanzaron + "%"
            );

            System.out.println(
                    "Cantidad de ciudades entre 40% y 60% "
                            + "por encima de lo esperado: "
                            + ciudadesEntre40y60
            );

            estado++;
        }
    }
}
