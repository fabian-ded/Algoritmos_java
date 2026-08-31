package BUCLES.WHILE;
import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cantidadSucursales;
        int sucursal = 1;

        int sucursalesAlcanzaron = 0;

        System.out.println("Ingrese la cantidad de sucursales:");
        cantidadSucursales = entrada.nextInt();

        while (sucursal <= cantidadSucursales) {

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

            while (puntoVenta <= cantidadPuntosVenta) {

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

                while (producto <= 3) {

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
                }

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
            }

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
        }

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
