package ALGORTMO_SW;

public class Algoritmo_SW1 {
    public static void main(String[] args) {
        
        double inversion;
        double interes;
        int resultado;

        System.out.println("Ingrese la cantidad de inversion que tiene el banco");
        inversion = Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese la cantidad de interes");
        interes = Double.parseDouble(System.console().readLine());

        double intereses = inversion*(interes/100);
        resultado = intereses > 7000 ? 1 : 2;

        switch (resultado) {
            case 1:
                System.out.println("Su inversion si supero lo solicitado: " + intereses);
                break;
            case 2:
                System.out.println("Su inversion no supiera lo solicitado: " + intereses);
                break;
            default:
                throw new AssertionError();
        }

    }
}
