package BUCLES.WHILE;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int actividad;
        int localizacion;
        int trabajadores;

        int totalEmpresas = 0;

        int totalAgricolas = 0;
        int totalMineras = 0;
        int minerasSur = 0;
        int totalPesqueras = 0;

        int trabajadoresAgricolas = 0;
        int trabajadoresIndustria = 0;
        int trabajadoresMineria = 0;
        int trabajadoresPesquera = 0;

        int industrialesNorte = 0;
        int industrialesSur = 0;
        int industrialesEste = 0;
        int industrialesOeste = 0;

        String continuar = "si";

        while (continuar.equalsIgnoreCase("si")) {

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
            }

            entrada.nextLine();

            System.out.println("¿Desea ingresar otra empresa? (si/no)");
            continuar = entrada.nextLine();
        }

        // i. Porcentaje de empresas agrícolas
        double porcentajeAgricolas =
                (double) totalAgricolas / totalEmpresas * 100;

        // ii. Porcentaje de empresas mineras del sur
        double porcentajeMinerasSur =
                (double) minerasSur / totalMineras * 100;

        // iii. Promedio de trabajadores por actividad
        double promedioAgricolas =
                (double) trabajadoresAgricolas / totalAgricolas;

        double promedioIndustria =
                (double) trabajadoresIndustria /
                        (totalEmpresas - totalAgricolas - totalMineras - totalPesqueras);

        double promedioMineria =
                (double) trabajadoresMineria / totalMineras;

        double promedioPesquera =
                (double) trabajadoresPesquera / totalPesqueras;

        // iv. Localización con más empresas industriales
        String localizacionMayor;
        int mayor = industrialesNorte;

        localizacionMayor = "Norte";

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

        System.out.println(
                "i. Porcentaje de empresas agrícolas: "
                        + porcentajeAgricolas + "%"
        );

        System.out.println(
                "ii. Porcentaje de empresas mineras del sur: "
                        + porcentajeMinerasSur + "%"
        );

        System.out.println(
                "iii. Promedio de trabajadores de empresas agrícolas: "
                        + promedioAgricolas
        );

        System.out.println(
                "Promedio de trabajadores de empresas industriales: "
                        + promedioIndustria
        );

        System.out.println(
                "Promedio de trabajadores de empresas mineras: "
                        + promedioMineria
        );

        System.out.println(
                "Promedio de trabajadores de empresas pesqueras: "
                        + promedioPesquera
        );

        System.out.println(
                "iv. Localización con mayor número de empresas industriales: "
                        + localizacionMayor
        );
    }
}
