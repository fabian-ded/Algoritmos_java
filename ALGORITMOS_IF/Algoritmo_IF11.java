/* Construya un programa que, dados como datos la categoría y el sueldo del trabajador, calcule el
aumento correspondiente teniendo en cuenta la siguiente tabla:
categoria  % aumento
1               15%
2               10%
3               8%
4               7%
Como salida, mostrar la categoría del trabajador y su nuevo sueldo. */
package ALGORITMOS_IF;

public class Algoritmo_IF11 {
    public static void main(String[] args) {
        
        double sueldo;
        double categoria;
        double cat1 = 1.15;
        double cat2 = 1.10;
        double cat3 = 1.08;
        double cat4 = 1.07;

        System.out.println("Ingrese sueldo: ");
        sueldo = Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese su categoria: ");
        categoria = Double.parseDouble(System.console().readLine());

        if(categoria==1){
            double total = sueldo*cat1;
            System.out.println("Su actualizacion de sueldo es de: " + total);
            System.out.println("Su Categoria es de: " + (int)categoria);
        }else if (categoria==2) {
            double total = sueldo*cat2;
            System.out.println("Su actualizacion de sueldo es de: " + total);
            System.out.println("Su Categoria es de: " + (int)categoria);
        }else if (categoria==3) {
            double total = sueldo*cat3;
            System.out.println("Su actualizacion de sueldo es de: " + total);
            System.out.println("Su Categoria es de: " + (int)categoria);
        }else if (categoria==4) {
            double total = sueldo*cat4;
            System.out.println("Su actualizacion de sueldo es de: " + total);
            System.out.println("Su Categoria es de: " + (int)categoria);
        }else{
            System.out.println("Su sueldo sigue siendo igual: " + sueldo);
            System.out.println("Su Categoria es de: " + (int)categoria);
        }

    }
}
