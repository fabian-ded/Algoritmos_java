package ALGORTMO_SWITCH;

public class Algoritmo_SW14 {
    public static void main(String[] args) {
        
        int A,B,C, resultado;

        System.out.println("Ingrese el lado A: ");
        A = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el lado B: ");
        B = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el lado C: ");
        C = Integer.parseInt(System.console().readLine());

        int mayor;

        mayor = A >= B && A >=C ? 1 :
        B >= A && B >= C ? 2: 3;

        switch (mayor) {
            case 1:
                mayor = A;
                break;
            case 2:
                mayor = B;
                break;
            case 3:
                mayor = C;
                break;
            default:
                throw new AssertionError();
        }

        int menores = A + B + C - mayor;

        
        resultado = menores > mayor ? 1 : 2;

        int resultado2 = A == B && B == C ? 3 :
        A == B || A == C || B == C ? 4 : 5;

        switch (resultado) {
            case 1:
                System.out.println("Los lados forman un triangulo.");
                switch (resultado2) {
                    case 3:
                        System.out.println("El triangulo es equilatero.");
                        break;
                    case 4:
                        System.out.println("El triangulo es isosceles.");
                        break;
                    case 5:
                        System.out.println("El triangulo es escaleno.");
                        break;
                    default:
                        throw new AssertionError();
                }
                double S = (A + B + C) / 2;
                double area = Math.sqrt(S * (S - A) * (S - B) * (S - C));
                System.out.println("El area del triangulo es: " + area);
                break;
            case 2:
                System.out.println("Los lados no forman un triangulo.");
                break;
            default:
                throw new AssertionError();
        }

    }
}
