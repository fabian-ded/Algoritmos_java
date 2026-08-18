/* Dados tres datos enteros positivos, que representan las longitudes de los lados de un probable
triángulo, desarrolle un algoritmo que determine si los datos corresponden a un triángulo. En caso
de que sí correspondan, escriba si el triángulo es equilátero, isósceles o escaleno. Calcule además
su área. Considere que es triángulo si se cumple que la suma de los dos lados menores es mayor
que la del lado mayor. Tome en cuenta además que el área de un triángulo la calculamos como:
area = √S(S­A)(S­B)(S­C) donde S es la mitad de la suma de los lados A, B y C.
Recuerde:
Equilátero: todos los lados son iguales.
Isósceles: 2 lados iguales y 1 diferente.
Escaleno: Todos los lados diferentes. */
package ALGORITMOS_IF;

public class Algoritmo_IF14 {
    public static void main(String[] args) {

        int A;
        int B;
        int C;

        System.out.println("Ingrese el lado A: ");
        A = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el lado B: ");
        B = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el lado C: ");
        C = Integer.parseInt(System.console().readLine());

        int mayor;

        if (A >= B && A >= C) {
            mayor = A;
        } else if (B >= A && B >= C) {
            mayor = B;
        } else {
            mayor = C;
        }

        int menores = A + B + C - mayor;

        if (menores > mayor) {

            System.out.println("Los lados forman un triangulo.");

            if (A == B && B == C) {
                System.out.println("El triangulo es equilatero.");
            } else if (A == B || A == C || B == C) {
                System.out.println("El triangulo es isosceles.");
            } else {
                System.out.println("El triangulo es escaleno.");
            }

            double S = (A + B + C) / 2;

            double area = Math.sqrt(S * (S - A) * (S - B) * (S - C));

            System.out.println("El area del triangulo es: " + area);

        } else {

            System.out.println("Los lados no forman un triangulo.");
        }
    }
}
