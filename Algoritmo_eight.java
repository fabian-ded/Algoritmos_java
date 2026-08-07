/* Calcule el área de un triángulo en función de las longitudes de sus lados, utilizando la fórmula:
√p(p­a)(p­b)(p­c) donde p = (a+b+c) / 2 */

public class Algoritmo_eight {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        System.out.println("Ingresar valor de primer longitud: ");
        a = Double.parseDouble(System.console().readLine());
        System.out.println("Ingresar valor de primer longitud: ");
        b = Double.parseDouble(System.console().readLine());
        System.out.println("Ingresar valor de primer longitud: ");
        c = Double.parseDouble(System.console().readLine());
        double triangulo = (a + b + c );
        double trianfulo_medida = (triangulo/2);
        double formula1 = (trianfulo_medida - a);
        double formula2 = (trianfulo_medida - b);
        double formula3 = (trianfulo_medida - c);
        double formula_fin = (trianfulo_medida * formula1 * formula2 * formula3);
        double raiz = Math.sqrt(formula_fin);
        System.out.println("El valor es de: " + raiz);
    }
}