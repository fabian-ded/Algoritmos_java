/* Desarrolle un programa que calcule el promedio de N alumnos, el promedio de la clase,
cantidad de alumnos con promedio menor que el de la clase y cantidad de alumnos con
promedio mayor que el de la clase, de acuerdo a los siguientes datos:
NOMBRE NOTAS
María 16 14 15 13 09
Juan Carlos 10 09 07 11 14
Josefina 13 12 15 17 13
José Luis
Se pide mostrar por pantalla,

07 11 10 08 17

Número Nombre Promedio
1 María 13.4

1
8

2 Juan Carlos 10.2
3 Josefina 14
4 José Luis10.6
Promedio de la clase: 12.05
Alumnos con definitiva menor al promedio: 2 Alumnos con
definitiva mayor al promedio: 2 */
package Vectores;

public class Ejercicio1 {
    public static void main(String[] args){

        int[] Maria = {16,14,15,13,9};
        int[] Juan_Carlos = {10,9,7,11,14};
        int[] Josefina = {13,12,15,17,13};
        int[] Jose_Luis = {7,11,10,8,17};
        double res_mar = 0;
        double res_juncar = 0;
        double res_josfi = 0;
        double res_joselu = 0;
        int mayor1 = 0, menor = 0;
        double[] esperar1 = new double[2];
        double[] esperar2 = new double[2];


        for (int i=0; i<5; i++){
            res_mar = Maria[i] + res_mar;
            res_juncar = Juan_Carlos[i] + res_juncar;
            res_josfi = Josefina[i] + res_josfi;
            res_joselu = Jose_Luis[i] + res_joselu;
            }
        double res_total = ((res_mar + res_juncar + res_josfi + res_joselu)/4)/5;
        res_mar = res_mar/5;
        res_juncar = res_juncar/5;
        res_josfi = res_josfi/5;
        res_joselu = res_joselu/5;
        double[] mayor = {res_mar,res_juncar,res_josfi,res_joselu};
        String[] nombres = {"Maria","Juan carlos", "Josefina","Jose Luis"};
        String[] nombres_mayor = new String[2];
        String[] nombres_menor = new String[2];
        double[] est_mayor = new double[2];
        double[] est_menor = new double[2];
        for (int e = 0; e < 4; e++){
            if (mayor[e]>res_total){
                esperar1[mayor1] = mayor[e];
                nombres_mayor[mayor1] = nombres[e];
                est_mayor[mayor1] = mayor[e];
                mayor1++;
            }else {
                esperar2[menor] = mayor[e];
                nombres_menor[menor] = nombres[e];
                est_menor[menor]= mayor[e];
                menor++;
            }
        }
        String nom1 = "", nom2 = "";
        String nom_m1 = "", nom_m2 = "";
        double est_1 = 0, est_2 = 0, est_3 = 0, est_4 = 0;
        for (int alumno = 0; alumno<1; alumno++){
            for (int alumno1 = 1; alumno1<2; alumno1++){
                if (esperar1[alumno] > esperar1[alumno1]) {
                    nom1 = nombres_mayor[alumno];
                    nom2 = nombres_mayor[alumno1];
                    est_1 = est_mayor[alumno];
                    est_2 = est_mayor[alumno1];
                }else {
                    nom1 = nombres_mayor[alumno1];
                    nom2 = nombres_mayor[alumno];
                    est_1 = est_mayor[alumno1];
                    est_2 = est_mayor[alumno];
                }

                if (esperar2[alumno]>esperar2[alumno1]){
                    nom_m1 = nombres_menor[alumno];
                    nom_m2 = nombres_menor[alumno1];
                    est_3 = est_mayor[alumno];
                    est_4 = est_mayor[alumno1];
                }else {
                    nom_m1 = nombres_menor[alumno1];
                    nom_m2 = nombres_menor[alumno];
                    est_3 = est_mayor[alumno1];
                    est_4 = est_mayor[alumno];
                }
            }
        }

        System.out.println("Nombre: " + nom1 + ",  Promedio: " + est_1);
        System.out.println("Nombre: " + nom2 + ",  Promedio: " + est_2);
        System.out.println("Nombre: " + nom_m1 + ",  Promedio: " + est_3);
        System.out.println("Nombre: " + nom_m2 + ",  Promedio: " + est_4);
        System.out.println("promedio de la clase es de: " + res_total);
        System.out.println("Alumnos con el promedio mayor: " + mayor1);
        System.out.println("Alumnos con el promedio menor: " + menor);
    }
}
