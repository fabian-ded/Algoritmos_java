/* Escriba un algoritmo, que dado como dato el sueldo de un trabajador, le aplique un aumento del
15% si su sueldo es inferior a Bs. 40.000 y 12% en caso contrario. Imprima el nuevo sueldo del
trabajador. */
package ALGORITMOS_IF;

public class Algoritmo_IF2 {
    public static void main(String[] args) {
        
        double sueldo;
        String nombre;

        System.out.println("Ingrese su nombre: ");
        nombre = System.console().readLine();
        System.out.println("Ingrese su sueldo: ");
        sueldo = Double.parseDouble(System.console().readLine());

        if(sueldo < 40000){
            double aumento1 = sueldo*1.15;
            System.out.println("Su sueldo Ms: "+ nombre + "= " + aumento1);
        }else{
            double aumento2 = sueldo*1.12;
            System.out.println("Su sueldo Ms: "+ nombre + "= " + aumento2);
        }
    }
}
