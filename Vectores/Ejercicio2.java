/* 83. Se tiene la siguiente información:
CT
En este arreglo se almacenan los nombres de N centros turísticos del País.
H
En este arreglo se almacena el número de habitaciones de cada tipo (sencilla o doble) de cada centro
turístico. Por ejemplo:
H[1] guarda el número de habitaciones sencillas del centro 1. H[2] guarda
el número de habitaciones dobles del centro 1.
H[3] guarda el número de habitaciones sencillas del centro 2. H[4] guarda
el número de habitaciones dobles del centro 2.
TR
En este arreglo se almacena el número total de restaurantes por centro turístico.
Realice un programa que pueda proporcionar la siguiente información:
a) el nombre del centro turístico que cuenta con más restaurantes.
b) El nombre del centro turístico que cuenta con más habitaciones (sencillas, dobles y total)
c) Dado el nombre de un centro turístico como dato, informar cuántas habitaciones tiene. */

package Vectores;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){

        String[] Centro = new String[4];
        int[] H_sencilla = new int[4];
        int[] H_dobles = new int[4];
        int[] Restaurantes = new int[4];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 4; i++){
            System.out.println("Agregue el nombre turistico " + i + " los Centros turisticos: ");
            String guardar = entrada.nextLine();
            Centro[i] = guardar;
        }

        for (int i = 0; i < 4; i++){
            System.out.println("Agregue la cantidad de habitaciones sencillas del Centro turistico " + i + " : ");
            int guardar = entrada.nextInt();
            H_sencilla[i] = guardar;
        }

        for (int i = 0; i < 4; i++){
            System.out.println("Agregue la cantidad de habitaciones dobles del Centro turistico " + i + " : ");
            int guardar = entrada.nextInt();
            H_dobles[i] = guardar;
        }

        for (int i = 0; i < 4; i++){
            System.out.println("Agregue la cantidad de restaurantes del Centro turistico " + i + " : ");
            int guardar = entrada.nextInt();
            Restaurantes[i] = guardar;
        }

        int Rest_mayor = 0;
        for (int i = 0; i < 4; i++){
            if (Restaurantes[i] > Restaurantes[Rest_mayor]){
                Rest_mayor = i;
            }

        }

        int[] Habitaciones = new int[4];
        for (int i = 0; i < 4; i ++){
            Habitaciones[i] = H_sencilla[i] + H_dobles[i];
        }

        int Habi_Mayor = 0;
        for (int i = 0; i < 4; i++){
            if (Habitaciones[i] > Habitaciones[Habi_Mayor]){
                Habi_Mayor = i;
            }
        }

        System.out.println("El Centro con mas restaurantes es: " + Centro[Rest_mayor]);
        System.out.println("El Centro con mas Habitaciones es: " + Centro[Habi_Mayor]);

        entrada.nextLine();

        System.out.println("Ingrese el Centro turistico que desea buscar: ");
        String Buscar = entrada.nextLine();

        for (int i = 0; i < 4; i++){
            if (Centro[i].equalsIgnoreCase(Buscar)){
                int total_H = H_sencilla[i] + H_dobles[i];

                System.out.println("El centro : " + Centro[i] + " cuenta con " + total_H + " Habitaciones" );
            }
        }

    }
}
