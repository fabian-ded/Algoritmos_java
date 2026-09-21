/* Una compañía almacena la información relacionada con sus proveedores en los siguientes arreglos:
proveedores, el cual guarda el nombre del proveedor y debe ser ordenado alfabéticamente; ciudad
que guarda el nombre de las ciudades donde residen los proveedores y número de artículos que
guarda la cantidad de artículos que suministra cada proveedor. De acuerdo a la información dada
previamente, desarrolle un programa que permita llevar a cabo lo siguiente:
a. Dado el nombre de un proveedor, informar el nombre de la ciudad en la que reside y el
número de artículos que provee.
b. Actualizar el nombre de la ciudad, en caso de que un proveedor cambie de domicilio. Los
datos serán el nombre del proveedor y el nombre de la ciudad a la cual se mudó.
c. Actualizar el número de artículos, manejados por un proveedor en caso de que éste
aumenta o disminuya. */
package Vectores;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){

        ArrayList<String> Nombre = new ArrayList<>();
        ArrayList<String> Ciudad = new ArrayList<>();
        ArrayList<Integer> Articulos = new ArrayList<>();
        Scanner Entrada = new Scanner(System.in);
        String continuar = "SI";


        while (!continuar.equalsIgnoreCase("NO")) {

            System.out.println("Ingrese el Nombre del Proveedor: ");
            Nombre.add( Entrada.nextLine());
            System.out.println("Ingrese la ciudad del Proveedor: ");
            Ciudad.add(Entrada.nextLine());
            System.out.println("Ingrese los articulos del Proveedor: ");
            Articulos.add(Entrada.nextInt());

            Entrada.nextLine();

            System.out.println("¿Desea continuar? (SI/NO)");
            continuar = Entrada.nextLine();
        }



        Entrada.nextLine();

        System.out.println("Ingrese el Provedor que desea buscar: ");
        String Buscar = Entrada.nextLine();

        for (int i = 0; i < Nombre.size(); i++){
            if (Nombre.get(i).equalsIgnoreCase(Buscar)){
                System.out.println("El nombre del Provedor es : " + Nombre.get(i) + " esta en la ciudad de " + Ciudad.get(i) + " y provee " + Articulos.get(i) + " de articulos" );
            }
        }

        System.out.println("Ingrese el nombre del provedor a cambiar de ciudad : ");
        String Cambiar = Entrada.nextLine();
        String Ciu_nueva = "";

        for (int i = 0; i < Nombre.size(); i++){
            if (Nombre.get(i).equalsIgnoreCase(Cambiar)){
                System.out.println("Nombre de la nueva ciudad: ");
                Ciu_nueva = Entrada.nextLine();
                Ciudad.set(i, Ciu_nueva);
                System.out.println("El provedor que cambio de recidencia fue : " + Nombre.get(i) + " y a la ciudad que se mudo fue " + Ciudad.get(i));
            }
        }

        System.out.println("Ingrese el nombre del provedor que ha tenido cambios en sus articulos");
        String Numero_cambiar = Entrada.nextLine();
        int Nuevo = 0;

        for (int i = 0; i < Nombre.size(); i++){
            if (Nombre.get(i).equalsIgnoreCase(Numero_cambiar)){
                System.out.println("Ingrese el nuevo numero de Articulos que se esta obteniendo: ");
                Nuevo = Entrada.nextInt();
                Articulos.set(i, Nuevo);
                System.out.println("El provedor que tuvo un cambio de articulos fue " + Nombre.get(i) + " y sus articulos ahora es de: " + Articulos.get(i));
            }
        }


         for (int i = 0; i < Nombre.size(); i++){
            System.out.println(Nombre.get(i));
            System.out.println(Ciudad.get(i));
            System.out.println(Articulos.get(i));
        }
    }
}
