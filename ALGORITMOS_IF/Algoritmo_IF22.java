/* 45. Confeccionar un algoritmo que permita resolver una ecuación de segundo grado, de la forma:
AX2+BX+C = 0, sabiendo que el discriminante (D) se calcula con la fórmula: D= Bˆ2­4*A*C. El valor
obtenido se evalúa y se aplica la fórmula correspondiente, según muestra la siguiente tabla: */
package ALGORITMOS_IF;

public class Algoritmo_IF22 {
    public static void main(String[] args) {

        double A;
        double B;
        double C;

        System.out.println("Ingrese el valor de A: ");
        A = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el valor de B: ");
        B = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el valor de C: ");
        C = Double.parseDouble(System.console().readLine());

        double D = (B * B) - (4 * A * C);

        if (D > 0) {

            double x1 = (-B + Math.sqrt(D)) / (2 * A);
            double x2 = (-B - Math.sqrt(D)) / (2 * A);

            System.out.println("La ecuacion tiene dos soluciones reales.");
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);

        } else if (D == 0) {

            double x = -B / (2 * A);

            System.out.println("La ecuacion tiene una solucion real.");
            System.out.println("X = " + x);

        } else {

            System.out.println("La ecuacion no tiene soluciones reales.");
        }
    }
}
