package ALGORTMO_SWITCH;

public class Algoritmo_SW11 {
    public static void main(String[] args) {
        
        double sueldo;
        double categoria;
        double cat1 = 1.15;
        double cat2 = 1.10;
        double cat3 = 1.08;
        double cat4 = 1.07;
        int solucion;

        System.out.println("Ingrese sueldo: ");
        sueldo = Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese su categoria del 1 al 4: ");
        categoria = Double.parseDouble(System.console().readLine());

        solucion = categoria==1 ? 1 :
        categoria==2 ? 2:
        categoria==3 ? 3:
        categoria==4 ? 4 : 5;

        switch (solucion) {
            case 1:
                double total = sueldo*cat1;
                System.out.println("Su actualizacion de sueldo es de: " + total);
                System.out.println("Su Categoria es de: " + (int)categoria);
                break;
            case 2:
                double total2 = sueldo*cat2;
                System.out.println("Su actualizacion de sueldo es de: " + total2);
                System.out.println("Su Categoria es de: " + (int)categoria);
                break;
            case 3:
                double total3 = sueldo*cat3;
                System.out.println("Su actualizacion de sueldo es de: " + total3);
                System.out.println("Su Categoria es de: " + (int)categoria);
                break;
            case 4:
                double total4 = sueldo*cat4;
                System.out.println("Su actualizacion de sueldo es de: " + total4);
                System.out.println("Su Categoria es de: " + (int)categoria);
                break;
            case 5:
                System.out.println("Su sueldo sigue siendo igual: " + sueldo);
                System.out.println("Su Categoria es de: " + (int)categoria);
                break;
            default:
                throw new AssertionError();
        }

    }
}
