package ALGORTMO_SWITCH;

public class Algoritmo_SW17 {
    public static void main(String[] args) {
        
        double lecturaAnterior;
        double lecturaActual;

        System.out.println("Ingrese la lectura anterior: ");
        lecturaAnterior = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese la lectura actual: ");
        lecturaActual = Double.parseDouble(System.console().readLine());

        double consumo = lecturaActual - lecturaAnterior;
        double monto;
        int solucion;

        solucion = consumo >= 0 && consumo <= 100 ? 1 :
        consumo <= 300 ? 2 :
        consumo <= 500 ? 3 : 4;

        switch (solucion) {
            case 1:
                monto = consumo * 2622;
                break;
            case 2:
                monto = consumo * 79.78;
                break;
            case 3:
                monto = consumo * 89.52;
                break;
            case 4:
                monto = consumo * 97.95;
                break;
            default:
                throw new AssertionError();
        }
        System.out.println("Consumo de energia: " + consumo + " KWh");
        System.out.println("Monto a pagar: " + monto + " Bs.");
    }
}
