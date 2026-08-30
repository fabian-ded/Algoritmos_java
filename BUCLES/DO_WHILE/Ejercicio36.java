/* 81. Una empresa proveedora de equipos de computación desea una aplicación que le permita controlar
las ventas y las comisiones de venta en los diferentes estados y ciudades donde posean canales de
comercialización. Para cada Estado pueden existir varias ciudades donde la empresa está presente;
a su vez cada ciudad puede contener canales de comercialización con vendedores de tienda (locales)
y de calle. Cada ciudad tiene asignada una cantidad de unidades de venta esperada. Cada estado,
ciudad, canal de comercialización y vendedor es identificado por códigos numéricos de 2,3,4 y 5
dígitos respectivamente. Los dos últimos dígitos del código de ciudad deben ser igual al código del
estado y los dos primeros dígitos del código de vendedor indican si el mismo es de tienda (valor 11)
o de calle (valor 12). La empresa paga un porcentaje de comisión del 10% para los vendedores de
tienda y un 15% de comisión para los vendedores de calle en función del monto total vendido por
los mismos, es decir, que la aplicación debe pedir por vendedor el total de unidades vendidas y el
monto total correspondiente a esa cantidad. La empresa le solicita que desarrolle un programa que
cubra lo siguiente:
• Calcular e imprimir por ciudad el código, el nombre, total de unidades vendidas, monto total bruto,
monto de comisión por vendedores de tienda, monto de comisión por vendedores de calle, código
del canal de comercialización con mayor monto neto de veta y el código del vendedor con menor
número de unidades vendidas.
• Calcular e imprimir por Estado el código, nombre, mono neto vendido, el porcentaje de ciudades que
no alcanzaron las cantidades esperadas y la cantidad de ciudades que obtuvieron de un 40% a un
60% por encima de la cantidad esperada. */

package BUCLES.DO_WHILE;

import java.util.Scanner;

public class Ejercicio36 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cantidadEstados;
        int estado = 1;

        System.out.println("Ingrese la cantidad de estados:");
        cantidadEstados = entrada.nextInt();

        // Variable para controlar el estado
        do {

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

            do {

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

                do {

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

                    do {

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

                        /*
                         * Acumulamos las unidades y el monto
                         * vendido por la ciudad.
                         */
                        totalUnidadesCiudad += unidadesVendidas;
                        totalBrutoCiudad += montoVendido;

                        /*
                         * Acumulamos la venta del canal.
                         */
                        totalVentaCanal += montoVendido;

                        /*
                         * El código comienza por 11:
                         * vendedor de tienda.
                         */
                        int tipoVendedor = codigoVendedor / 1000;

                        if (tipoVendedor == 11) {

                            comisionTiendaCiudad += montoVendido * 0.10;

                        } else if (tipoVendedor == 12) {

                            comisionCalleCiudad += montoVendido * 0.15;
                        }

                        /*
                         * Buscamos el vendedor que vendió
                         * menor cantidad de unidades.
                         */
                        if (unidadesVendidas < menorUnidadesVendedor) {

                            menorUnidadesVendedor = unidadesVendidas;
                            codigoVendedorMenorUnidades = codigoVendedor;
                        }

                        vendedor++;

                    } while (vendedor <= cantidadVendedores);

                    /*
                     * Buscamos el canal con mayor monto
                     * neto de venta.
                     */
                    double comisionCanal = 0;

                    /*
                     * Para determinar el tipo de vendedor del canal
                     * se utilizan las comisiones acumuladas.
                     *
                     * El monto neto será:
                     * venta bruta - comisión.
                     */
                    double ventaNetaCanal =
                            totalVentaCanal - comisionCanal;

                    if (ventaNetaCanal > mayorVentaCanal) {

                        mayorVentaCanal = ventaNetaCanal;
                        codigoCanalMayorVenta = codigoCanal;
                    }

                    canal++;

                } while (canal <= cantidadCanales);

                /*
                 * El monto neto total de la ciudad.
                 */
                double totalComisionesCiudad =
                        comisionTiendaCiudad + comisionCalleCiudad;

                double montoNetoCiudad =
                        totalBrutoCiudad - totalComisionesCiudad;

                /*
                 * Acumulamos el monto neto de la ciudad
                 * para obtener posteriormente el total del Estado.
                 */
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
                 * Si vendió menos del 100% de lo esperado,
                 * la ciudad no alcanzó la meta.
                 */
                if (totalUnidadesCiudad < unidadesEsperadas) {

                    ciudadesNoAlcanzaron++;
                }

                /*
                 * Entre 40% y 60% por encima de lo esperado:
                 *
                 * 40% por encima = 140%
                 * 60% por encima = 160%
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

            } while (ciudad <= cantidadCiudades);

            /*
             * Porcentaje de ciudades que no alcanzaron
             * las unidades esperadas.
             */
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

        } while (estado <= cantidadEstados);

    }
}
