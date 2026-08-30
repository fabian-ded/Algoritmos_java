/* 73. Un banco está interesado en diseñar un software que le permita calcular y generar ciertos listados
sobre las deudas de sus clientes a créditos. El algoritmo debe procesar para cada estado y sus
agencias los clientes con pagarés pendientes a una fecha (dd/mm/aaaa) dad y generar los recibos
correspondientes para ser enviados a los clientes. Cada estado, agencia y cliente es identificado por
un código. Los pagarés tienen una fecha de vencimiento (dd/mm/aaaa), un monto a pagar y un
número que lo identifica; un cliente debe tener más que un pagaré.
Se quiere un algoritmo o programa que permita:
• Imprimir un recibo para cada cliente cuyo encabezado es su código, nombre, dirección,
código de estado y código de agencia. El detalle del recibo contendrá un número del pagaré,
la fecha de vencimiento y el monto del pagaré. Al final del recibo debe colocar la cantidad
de pagares pendientes y el monto total pendiente.
• Imprimir por agencia su código, estado, la cantidad de clientes con pagares pendientes,
monto total adeudado y el código de cliente con mayor deuda.

1
5

• Imprimir por estado su código, el monto total adeudado en el estado y el código de agencia
con menor y mayor monto adeudado.
• Calcular e imprimir el monto promedio adeudado en razón de los montos máximos
adeudados por las agencias a nivel nacional.

NOTA: Los cálculos se deben realizar en función de una fecha dada. No se podrán utilizar vectores
ni matrices. */

package BUCLES.DO_WHILE;

import java.util.Scanner;

public class Ejercicio28 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int diaCorte;
        int mesCorte;
        int anioCorte;

        System.out.println("Ingrese el día de la fecha de corte:");
        diaCorte = entrada.nextInt();

        System.out.println("Ingrese el mes de la fecha de corte:");
        mesCorte = entrada.nextInt();

        System.out.println("Ingrese el año de la fecha de corte:");
        anioCorte = entrada.nextInt();

        int fechaCorte = anioCorte * 10000 + mesCorte * 100 + diaCorte;

        int cantidadEstados;

        System.out.println("Ingrese la cantidad de estados:");
        cantidadEstados = entrada.nextInt();

        int estado = 1;

        double sumaMaximosAgencias = 0;
        int cantidadAgenciasNacional = 0;

        do {

            System.out.println("\n========== ESTADO #" + estado + " ==========");

            int codigoEstado;

            System.out.println("Ingrese el código del estado:");
            codigoEstado = entrada.nextInt();

            int cantidadAgenciasEstado;

            System.out.println("Ingrese la cantidad de agencias:");
            cantidadAgenciasEstado = entrada.nextInt();

            int agencia = 1;

            double totalEstado = 0;

            double mayorMontoAgencia = 0;
            double menorMontoAgencia = 0;

            int codigoAgenciaMayor = 0;
            int codigoAgenciaMenor = 0;

            do {

                System.out.println("\n========== AGENCIA #" + agencia + " ==========");

                int codigoAgencia;

                System.out.println("Ingrese el código de la agencia:");
                codigoAgencia = entrada.nextInt();

                int cantidadClientes;

                System.out.println("Ingrese la cantidad de clientes:");
                cantidadClientes = entrada.nextInt();

                int cliente = 1;

                double totalAgencia = 0;
                int clientesConDeuda = 0;

                double mayorDeudaCliente = 0;
                int codigoClienteMayorDeuda = 0;

                do {

                    entrada.nextLine();

                    System.out.println("\n---------- CLIENTE #" + cliente + " ----------");

                    int codigoCliente;
                    String nombre;
                    String direccion;

                    System.out.println("Código del cliente:");
                    codigoCliente = entrada.nextInt();

                    entrada.nextLine();

                    System.out.println("Nombre del cliente:");
                    nombre = entrada.nextLine();

                    System.out.println("Dirección:");
                    direccion = entrada.nextLine();

                    int cantidadPagares;

                    System.out.println("Cantidad de pagarés:");
                    cantidadPagares = entrada.nextInt();

                    int pagare = 1;

                    int pagaresPendientes = 0;
                    double totalCliente = 0;

                    do {

                        System.out.println("\nPagaré #" + pagare);

                        int numeroPagare;

                        System.out.println("Número del pagaré:");
                        numeroPagare = entrada.nextInt();

                        System.out.println("Día de vencimiento:");
                        int diaVencimiento = entrada.nextInt();

                        System.out.println("Mes de vencimiento:");
                        int mesVencimiento = entrada.nextInt();

                        System.out.println("Año de vencimiento:");
                        int anioVencimiento = entrada.nextInt();

                        System.out.println("Monto del pagaré:");
                        double montoPagare = entrada.nextDouble();

                        int fechaVencimiento =
                                anioVencimiento * 10000
                                        + mesVencimiento * 100
                                        + diaVencimiento;

                        /*
                         * El pagaré está pendiente a la fecha de corte
                         * si su fecha de vencimiento ya llegó.
                         */
                        if (fechaVencimiento <= fechaCorte) {

                            pagaresPendientes++;
                            totalCliente += montoPagare;

                            System.out.println(
                                    "Pagaré pendiente: " + numeroPagare
                            );
                        }

                        pagare++;

                    } while (pagare <= cantidadPagares);

                    /*
                     * Solo contamos clientes que tengan
                     * al menos un pagaré pendiente.
                     */
                    if (pagaresPendientes > 0) {

                        clientesConDeuda++;

                        totalAgencia += totalCliente;

                        System.out.println("\n========== RECIBO ==========");

                        System.out.println(
                                "Código del cliente: " + codigoCliente
                        );

                        System.out.println(
                                "Nombre: " + nombre
                        );

                        System.out.println(
                                "Dirección: " + direccion
                        );

                        System.out.println(
                                "Código del estado: " + codigoEstado
                        );

                        System.out.println(
                                "Código de agencia: " + codigoAgencia
                        );

                        System.out.println(
                                "Cantidad de pagarés pendientes: "
                                        + pagaresPendientes
                        );

                        System.out.println(
                                "Monto total pendiente: "
                                        + totalCliente
                        );

                        if (totalCliente > mayorDeudaCliente) {

                            mayorDeudaCliente = totalCliente;
                            codigoClienteMayorDeuda = codigoCliente;
                        }
                    }

                    cliente++;

                } while (cliente <= cantidadClientes);

                /*
                 * Información de la agencia.
                 */
                System.out.println("\n========== DATOS DE LA AGENCIA ==========");

                System.out.println(
                        "Código de agencia: " + codigoAgencia
                );

                System.out.println(
                        "Código de estado: " + codigoEstado
                );

                System.out.println(
                        "Clientes con pagarés pendientes: "
                                + clientesConDeuda
                );

                System.out.println(
                        "Monto total adeudado: "
                                + totalAgencia
                );

                System.out.println(
                        "Cliente con mayor deuda: "
                                + codigoClienteMayorDeuda
                );

                /*
                 * Acumulamos el total de la agencia
                 * para obtener el total del estado.
                 */
                totalEstado += totalAgencia;

                /*
                 * Determinamos la agencia con mayor
                 * y menor deuda dentro del estado.
                 */
                if (agencia == 1) {

                    mayorMontoAgencia = totalAgencia;
                    menorMontoAgencia = totalAgencia;

                    codigoAgenciaMayor = codigoAgencia;
                    codigoAgenciaMenor = codigoAgencia;

                } else {

                    if (totalAgencia > mayorMontoAgencia) {

                        mayorMontoAgencia = totalAgencia;
                        codigoAgenciaMayor = codigoAgencia;
                    }

                    if (totalAgencia < menorMontoAgencia) {

                        menorMontoAgencia = totalAgencia;
                        codigoAgenciaMenor = codigoAgencia;
                    }
                }

                /*
                 * Para el punto d necesitamos sumar
                 * el monto máximo de cada agencia.
                 */
                sumaMaximosAgencias += totalAgencia;
                cantidadAgenciasNacional++;

                agencia++;

            } while (agencia <= cantidadAgenciasEstado);

            /*
             * Información del estado.
             */
            System.out.println("\n========== DATOS DEL ESTADO ==========");

            System.out.println(
                    "Código del estado: " + codigoEstado
            );

            System.out.println(
                    "Monto total adeudado en el estado: "
                            + totalEstado
            );

            System.out.println(
                    "Agencia con mayor monto adeudado: "
                            + codigoAgenciaMayor
            );

            System.out.println(
                    "Agencia con menor monto adeudado: "
                            + codigoAgenciaMenor
            );

            estado++;

        } while (estado <= cantidadEstados);

        /*
         * Promedio de los montos máximos de las agencias.
         */
        if (cantidadAgenciasNacional > 0) {

            double promedioMaximosAgencias =
                    sumaMaximosAgencias / cantidadAgenciasNacional;

            System.out.println(
                    "\n========== RESULTADO NACIONAL =========="
            );

            System.out.println(
                    "Promedio de los montos máximos de las agencias: "
                            + promedioMaximosAgencias
            );

        } else {

            System.out.println(
                    "No existen agencias para calcular el promedio."
            );
        }
    }
}
