package ALGORTMO_SWITCH;

public class Algoritmo_SW4 {
    public static void main(String[] args) {
        
        double base;
        double altura;
        double v3;
        int resultado;

        System.out.println("Ingrese base: ");
        base = Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese altura: ");
        altura = Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese numero a comparar: ");
        v3 = Double.parseDouble(System.console().readLine());

        double triangulo = (base*altura)/2;
        double circulo = altura*(base*base);
        double rectangulo = base*altura;

        resultado = triangulo == v3 ? 1 :
        circulo == v3 ? 2 :
        rectangulo == v3 ? 3 : 4;

        switch(resultado) {
            case 1:
                System.out.println("Su figura es un triangulo");
                break;
            case 2:
                System.out.println("Su figura es un circulo");
                break;
            case 3:
                System.out.println("Su figura es un rectangulo");
                break;
            case 4:
                System.out.println("No es ninguna figura");
                break;
            default:
                throw new AssertionError();
        }

    }
}
