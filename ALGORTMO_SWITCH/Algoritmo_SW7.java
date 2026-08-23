package ALGORTMO_SWITCH;

public class Algoritmo_SW7 {
    public static void main(String[] args) {
        
        int A, B, C, D;
        int resultado;

        System.out.println("Ingrese numero para A: ");
        A = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese numero para B: ");
        B = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese numero para C: ");
        C = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese numero para D: ");
        D = Integer.parseInt(System.console().readLine());

        resultado = C < 5 ? 1 : 2;

        switch(resultado){
            case 1:
            int redon_menor = (A*1000)+(B*100);
            System.out.println("El numero redondeado es1: " + redon_menor);
            break;
            case 2:
            int redon_mayor = (A*1000)+((B+1)*100);
            System.out.println("El numero redondeado es2: " + redon_mayor);
            break;
        default:
            throw new AssertionError();
        }


    }
}
