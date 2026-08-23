package ALGORTMO_SWITCH;

public class Algoritmo_SW2 {
    public static void main(String[] args) {
        
        double sueldo;
    String nombre;
    int opcion;

    System.out.println("Ingrese su nombre: ");
    nombre = System.console().readLine();

    System.out.println("Ingrese su sueldo: ");
    sueldo = Double.parseDouble(System.console().readLine());

    opcion = sueldo < 40000 ? 1 : 2;

    switch (opcion) {
        case 1:
            sueldo = sueldo * 1.15;
            System.out.println("Su sueldo de " + nombre + " con aumento es: " + sueldo);
            break;

        case 2:
            sueldo = sueldo * 1.12;
            System.out.println("Su sueldo de " + nombre + " con aumento es: " + sueldo);
            break;

        default:
            System.out.println("Opción no válida");
            break;
        }

    }
}
