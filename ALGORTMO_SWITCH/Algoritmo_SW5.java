package ALGORTMO_SWITCH;

public class Algoritmo_SW5 {
    public static void main(String[] args) {
        
        double piezas;
        double valor = 100000;
        double monto_total = 500000;
        int resultado;

        System.out.println("Ingrese la cantidad de piezas: ");
        piezas = Double.parseDouble(System.console().readLine());

        double valor_pieza = piezas*valor;

        resultado = valor_pieza>monto_total ? 1 :
        valor_pieza<monto_total ? 2 : 3;

        switch (resultado) {
            case 1:
                double inversion = (valor_pieza*55)/100;
                double prestamo = (valor_pieza*30)/100;
                double total = valor_pieza-(inversion + prestamo);
                double interes = (total*20)/100;
                System.out.println("La cantidad que se invirtio es de: " + inversion);
                System.out.println("La cantidad a pagar del credito: " + total);
                System.out.println("La cantidad a pagar de credito: " + interes);
                System.out.println("La cantidad a pagar de interes: " + prestamo);
                break;
            case 2:
                double inversion2 = (valor_pieza*70)/100;
                double prestamo2 = (valor_pieza*30)/100;
                double interes2 = (prestamo2*20)/100;
                System.out.println("La cantidad que se invirtio es de: " + inversion2);
                System.out.println("La cantidad a pagar de interes: " + interes2);
                System.out.println("La cantidad a pagar de credito: " + prestamo2);
                break;
            case 3:
                System.out.println("Datos no procesados");
                break;
            default:
                throw new AssertionError();
        }

    }
}
