/* 78. Una empresa comercializadora de productos cerámicos con sucursales y puntos de venta a nivel
nacional está interesada en desarrollar un software que le permita controlar sus ventas. Cada
sucursal posee un monto de venta esperado el cual debe cubrir y tiene asignados varios puntos de
venta, los cuales debe controlar. La sucursal es identificada con un código entero positivo de dos

1
6

dígitos y los puntos de venta por un código entero positivo de cuatro dígitos, en el cual los dos
primeros dígitos corresponden al código de la sucursal a la cual reporta. Los productos
comercializados por la empresa son identificados por un código que va del 1 al 3, el PVP de cada uno
es dado como constante y todos los puntos de venta, venden los 3 tipos de productos. El 10% de las
ventas brutas de cada punto de venta es repartido entre los vendedores de la misma en forma
equitativa como comisión de venta. Se requiere que desarrolle un programa que responda a lo
siguiente:
• Imprimir por punto de venta: su código, las unidades vendidas, el monto neto de la venta,
el monto pagado por comisión a los vendedores y el código del producto con menor número
de unidades vendidas.
• Calcular y mostrar por sucursal su código, descripción, el monto total vendido, el porcentaje
de venta alcanzado en función de lo esperado y el código y monto del punto de venta que
más pagó por comisión de venta.
• Calcular y mostrar el porcentaje de las sucursales que alcanzaron el monto de venta
esperado. */

package BUCLES.DO_WHILE;

import java.util.Scanner;

public class Ejercicio33 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cantidadSucursales;
        int sucursal = 1;

        int sucursalesAlcanzaron = 0;

        System.out.println("Ingrese la cantidad de sucursales:");
        cantidadSucursales = entrada.nextInt();

        do {

            System.out.println("\n========== SUCURSAL #" + sucursal + " ==========");

            int codigoSucursal;
            String descripcion;
            double ventaEsperada;

            System.out.println("Ingrese el código de la sucursal:");
            codigoSucursal = entrada.nextInt();

            entrada.nextLine();

            System.out.println("Ingrese la descripción de la sucursal:");
            descripcion = entrada.nextLine();

            System.out.println("Ingrese el monto de venta esperado:");
            ventaEsperada = entrada.nextDouble();

            int cantidadPuntosVenta;

            System.out.println("Ingrese la cantidad de puntos de venta:");
            cantidadPuntosVenta = entrada.nextInt();

            int puntoVenta = 1;

            double totalSucursal = 0;

            double mayorComision = 0;
            int codigoPuntoMayorComision = 0;

            do {

                System.out.println(
                        "\n---------- PUNTO DE VENTA #" + puntoVenta + " ----------"
                );

                int codigoPuntoVenta;

                System.out.println("Ingrese el código del punto de venta:");
                codigoPuntoVenta = entrada.nextInt();

                int producto = 1;

                int unidadesTotales = 0;

                int unidadesProducto1 = 0;
                int unidadesProducto2 = 0;
                int unidadesProducto3 = 0;

                double ventasBrutas = 0;

                do {

                    System.out.println(
                            "Ingrese las unidades vendidas del producto "
                                    + producto + ":"
                    );

                    int unidades = entrada.nextInt();

                    unidadesTotales += unidades;

                    if (producto == 1) {

                        unidadesProducto1 = unidades;

                    } else if (producto == 2) {

                        unidadesProducto2 = unidades;

                    } else {

                        unidadesProducto3 = unidades;
                    }

                    double precio;

                    if (producto == 1) {

                        precio = 100;

                    } else if (producto == 2) {

                        precio = 200;

                    } else {

                        precio = 300;
                    }

                    ventasBrutas += unidades * precio;

                    producto++;

                } while (producto <= 3);

                double comision = ventasBrutas * 0.10;

                double ventaNeta = ventasBrutas - comision;

                int productoMenor;

                if (unidadesProducto1 <= unidadesProducto2
                        && unidadesProducto1 <= unidadesProducto3) {

                    productoMenor = 1;

                } else if (unidadesProducto2 <= unidadesProducto1
                        && unidadesProducto2 <= unidadesProducto3) {

                    productoMenor = 2;

                } else {

                    productoMenor = 3;
                }

                System.out.println("\n----- INFORMACIÓN DEL PUNTO DE VENTA -----");

                System.out.println(
                        "Código: " + codigoPuntoVenta
                );

                System.out.println(
                        "Unidades vendidas: " + unidadesTotales
                );

                System.out.println(
                        "Monto neto de la venta: $" + ventaNeta
                );

                System.out.println(
                        "Comisión pagada: $" + comision
                );

                System.out.println(
                        "Producto con menor número de unidades: "
                                + productoMenor
                );

                totalSucursal += ventaNeta;

                if (comision > mayorComision) {

                    mayorComision = comision;
                    codigoPuntoMayorComision = codigoPuntoVenta;
                }

                puntoVenta++;

            } while (puntoVenta <= cantidadPuntosVenta);

            double porcentajeVenta =
                    (totalSucursal / ventaEsperada) * 100;

            System.out.println("\n========== RESULTADO DE LA SUCURSAL ==========");

            System.out.println(
                    "Código de sucursal: " + codigoSucursal
            );

            System.out.println(
                    "Descripción: " + descripcion
            );

            System.out.println(
                    "Monto total vendido: $" + totalSucursal
            );

            System.out.println(
                    "Porcentaje alcanzado: " + porcentajeVenta + "%"
            );

            System.out.println(
                    "Punto de venta que más pagó por comisión: "
                            + codigoPuntoMayorComision
            );

            System.out.println(
                    "Monto de comisión: $" + mayorComision
            );

            if (totalSucursal >= ventaEsperada) {

                sucursalesAlcanzaron++;
            }

            sucursal++;

        } while (sucursal <= cantidadSucursales);

        double porcentajeSucursales =
                (double) sucursalesAlcanzaron / cantidadSucursales * 100;

        System.out.println("\n========== RESULTADO GENERAL ==========");

        System.out.println(
                "Porcentaje de sucursales que alcanzaron "
                        + "el monto esperado: "
                        + porcentajeSucursales + "%"
        );
    }
}
