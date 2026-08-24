package ALGORTMO_SWITCH;

public class Algoritmo_SW22 {
    public static void main(String[] args) {
        
        double A;
        double B;
        double C;
        int fin;

        System.out.println("Ingrese el valor de A: ");
        A = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el valor de B: ");
        B = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el valor de C: ");
        C = Double.parseDouble(System.console().readLine());

        double D = (B * B) - (4 * A * C);

        fin =  D > 0 ? 1 : 
        D == 0 ? 2 : 3 ;

        switch (fin) {
            case 1:
                double x1 = (-B + Math.sqrt(D)) / (2 * A);
                double x2 = (-B - Math.sqrt(D)) / (2 * A);

                System.out.println("La ecuacion tiene dos soluciones reales.");
                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);
                break;
            case 2:
                double x = -B / (2 * A);

                System.out.println("La ecuacion tiene una solucion real.");
                System.out.println("X = " + x);
                break;
            case 3:
                System.out.println("La ecuacion no tiene soluciones reales.");
                break;
            default:
                throw new AssertionError();
        }

    }
}
