package ALGORTMO_SW;

public class Algoritmo_SW3 {
    public static void main(String[] args) {
        
        double A,B,C,D;
        int valor;

        System.out.println("Ingrese el numero para A: ");
        A = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el numero para B: ");
        B = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el numero para C: ");
        C = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el numero para D: ");
        D = Integer.parseInt(System.console().readLine());

        valor = D==0 ? 1 : 2;

        switch (valor) {
            case 1:
                double cero = (A-C)*(A-C);
                System.out.println("El resultado es: " + cero);
                break;
            case 2:
                double uno = ((A-B)*(A-B)*(A-B))/D;
                System.out.println("El resultado es: " + uno);
                break;
            default:
                throw new AssertionError();
        }

    }
}
