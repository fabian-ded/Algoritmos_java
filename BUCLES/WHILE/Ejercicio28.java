package BUCLES.WHILE;
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

        while (estado <= cantidadEstados) {

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

            while (agencia <= cantidadAgenciasEstado) {

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

                while (cliente <= cantidadClientes) {

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

                    while (pagare <= cantidadPagares) {

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
                    }

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
                }

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
                 * Acumulamos el monto de cada agencia.
                 */
                sumaMaximosAgencias += totalAgencia;
                cantidadAgenciasNacional++;

                agencia++;
            }

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
        }

        /*
         * Promedio de los montos de las agencias.
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
