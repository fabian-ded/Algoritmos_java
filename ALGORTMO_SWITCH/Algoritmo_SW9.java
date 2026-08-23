package ALGORTMO_SWITCH;

public class Algoritmo_SW9 {
    public static void main(String[] args) {
        
        int P, Q, resultado;

        System.out.println("Ingrese numero P: ");
        P = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese numero Q: ");
        Q = Integer.parseInt(System.console().readLine());

        double resultadoP3 = Math.pow(P, 3);
        double resultadoQ4 = Math.pow(Q, 4);
        double resultadoP2 = Math.pow(P, 2)*2;
        double total = resultadoP3 + resultadoQ4 - resultadoP2;

        resultado = total > 680 ? 1 : 2;

        switch (resultado) {
            case 1:
                System.out.println("Resultado de P: " + resultadoP3);
                System.out.println("Resultado de Q: " + resultadoQ4);
                break;
            case 2:
                System.out.println("No se supero el numero esperado el resultado fue: " + total);
                break;
            default:
                throw new AssertionError();
        }

    }
}
