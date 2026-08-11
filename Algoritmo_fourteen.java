/* El siguiente sistema de ecuaciones lineales:
aX + bY = c
dX + eY = f

se resuelve con las fórmulas:
ce - bf af - cd
X = --------- Y = --------- calcule y muestre el valor de X e Y.
ae – bd ae – bd */

public class Algoritmo_fourteen {
    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double d;
        double e;
        double f;

        System.out.println("Ingresar valor de a: ");
        a = Double.parseDouble(System.console().readLine());

        System.out.println("Ingresar valor de b: ");
        b = Double.parseDouble(System.console().readLine());

        System.out.println("Ingresar valor de c: ");
        c = Double.parseDouble(System.console().readLine());

        System.out.println("Ingresar valor de d: ");
        d = Double.parseDouble(System.console().readLine());

        System.out.println("Ingresar valor de e: ");
        e = Double.parseDouble(System.console().readLine());

        System.out.println("Ingresar valor de f: ");
        f = Double.parseDouble(System.console().readLine());

        double formula1 = (a * e) - (b * d);
        double X = ((c * e) - (b * f)) / formula1;
        double Y = ((a * f) - (c * d)) / formula1;

        System.out.println("El valor de X es: " + X);
        System.out.println("El valor de Y es: " + Y);
    }
}
