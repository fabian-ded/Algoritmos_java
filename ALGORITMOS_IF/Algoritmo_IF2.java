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
