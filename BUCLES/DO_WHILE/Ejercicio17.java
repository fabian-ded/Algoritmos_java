/* Para cada una de las empresas del País se tienen como datos: actividad, localización y número de
trabajadores. La actividad y la localización, se codifican de la siguiente forma:

ACTIVIDAD  LOCALIZACION
1= agricola  1= norte
2=industria  2=sur
3=minera  3=este
4=pesquera  4=oeste

Desarrolle un algoritmo / programa que calcule y muestre:
i. Porcentaje de empresas agrícolas del País.
ii. Porcentaje de empresas mineras del sur respecto al total de empresas que realizan
esa actividad.
iii. Promedio de trabajadores de las empresas de cada tipo de actividad.
iv.Localización con mayor número de empresas industriales. */

package BUCLES.DO_WHILE;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int actividad;
        int localizacion;
        int trabajadores;

        int totalEmpresas = 0;

        int totalAgricolas = 0;
        int totalIndustriales = 0;
        int totalMineras = 0;
        int totalPesqueras = 0;

        int trabajadoresAgricolas = 0;
        int trabajadoresIndustria = 0;
        int trabajadoresMineria = 0;
        int trabajadoresPesquera = 0;

        int industrialesNorte = 0;
        int industrialesSur = 0;
        int industrialesEste = 0;
        int industrialesOeste = 0;

        int minerasSur = 0;

        String continuar;

        do {

            totalEmpresas++;

            System.out.println("\n===== EMPRESA #" + totalEmpresas + " =====");

            System.out.println("Ingrese la actividad:");
            System.out.println("1 = Agricola");
            System.out.println("2 = Industria");
            System.out.println("3 = Minera");
            System.out.println("4 = Pesquera");
            actividad = entrada.nextInt();

            System.out.println("Ingrese la localización:");
            System.out.println("1 = Norte");
            System.out.println("2 = Sur");
            System.out.println("3 = Este");
            System.out.println("4 = Oeste");
            localizacion = entrada.nextInt();

            System.out.println("Ingrese el número de trabajadores:");
            trabajadores = entrada.nextInt();

            switch (actividad) {

                case 1:
                    totalAgricolas++;

                    trabajadoresAgricolas += trabajadores;

                    break;

                case 2:
                    totalIndustriales++;
                    trabajadoresIndustria += trabajadores;
                    switch (localizacion) {

                        case 1:
                            industrialesNorte++;
                            break;

                        case 2:
                            industrialesSur++;
                            break;

                        case 3:
                            industrialesEste++;
                            break;

                        case 4:
                            industrialesOeste++;
                            break;

                        default:
                            System.out.println("Localización inválida.");
                    }

                    break;

                case 3:
                    totalMineras++;
                    trabajadoresMineria += trabajadores;
                    if (localizacion == 2) {
                        minerasSur++;
                    }

                    break;

                case 4:
                    totalPesqueras++;
                    trabajadoresPesquera += trabajadores;
                    break;

                default:
                    System.out.println("Actividad inválida.");
            }

            entrada.nextLine();

            System.out.println("¿Desea ingresar otra empresa? (si/no)");
            continuar = entrada.nextLine();

        } while (continuar.equalsIgnoreCase("si"));

        double porcentajeAgricolas = 0;
        double porcentajeMinerasSur = 0;

        if (totalEmpresas > 0) {
            porcentajeAgricolas = (double) totalAgricolas / totalEmpresas * 100;
        }

        if (totalMineras > 0) {
            porcentajeMinerasSur = (double) minerasSur / totalMineras * 100;
        }

        double promedioAgricolas = 0;
        double promedioIndustria = 0;
        double promedioMineria = 0;
        double promedioPesquera = 0;

        if (totalAgricolas > 0) {
            promedioAgricolas = (double) trabajadoresAgricolas / totalAgricolas;
        };

        if (totalIndustriales > 0) {
            promedioIndustria = (double) trabajadoresIndustria / totalIndustriales;
        }

        if (totalMineras > 0) {
            promedioMineria = (double) trabajadoresMineria / totalMineras;
        }

        if (totalPesqueras > 0) {
            promedioPesquera = (double) trabajadoresPesquera / totalPesqueras;
        }

        String localizacionMayor = "Norte";

        int mayor = industrialesNorte;

        if (industrialesSur > mayor) {

            mayor = industrialesSur;
            localizacionMayor = "Sur";
        }

        if (industrialesEste > mayor) {

            mayor = industrialesEste;
            localizacionMayor = "Este";
        }

        if (industrialesOeste > mayor) {

            mayor = industrialesOeste;
            localizacionMayor = "Oeste";
        }

        System.out.println("\n========== RESULTADOS ==========");
        System.out.println("Total de empresas: " + totalEmpresas);
        System.out.println("Empresas agrícolas: " + totalAgricolas);
        System.out.println("Empresas industriales: " + totalIndustriales);
        System.out.println("Empresas mineras: " + totalMineras);
        System.out.println("Empresas pesqueras: " + totalPesqueras);
        System.out.println("\nPorcentaje de empresas agrícolas: " + porcentajeAgricolas + "%");
        System.out.println("Porcentaje de empresas mineras del sur: " + porcentajeMinerasSur + "%");
        System.out.println("\n. Promedio de trabajadores de empresas agrícolas: " + promedioAgricolas);
        System.out.println("Promedio de trabajadores de empresas industriales: " + promedioIndustria);
        System.out.println("Promedio de trabajadores de empresas mineras: " + promedioMineria);
        System.out.println("Promedio de trabajadores de empresas pesqueras: " + promedioPesquera);
        System.out.println("\n. Localización con mayor número de empresas industriales: " + localizacionMayor);
    }
}
