package ALGORITMOS;

public class Algoritmos_firt {
    public static void main(String[] args) {
        
        double edad1;
        double edad2;
        double edad3;

        System.out.println("ingrese su edad: ");
        edad1 = Integer.parseInt(System.console().readLine()); 
        System.out.println("ingrese su edad: ");
        edad2 = Integer.parseInt(System.console().readLine()); 
        System.out.println("ingrese su edad: ");
        edad3 = Integer.parseInt(System.console().readLine()); 

        double promedio = (edad1 + edad2 + edad3)/3;

        System.out.println("El promedio de edad: " + promedio);

    }
}
