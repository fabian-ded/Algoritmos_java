package ALGORTMO_SWITCH;

public class Algoritmo_SW16 {
    public static void main(String[] args) {
        
        double precio;
        double devaluacion;
        double incremento;
        int resultado;

        System.out.println("Ingrese el precio del automovil y del terreno: ");
        precio = Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese el porcentaje de devaluacion anual del automovil: ");
        devaluacion = Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese el porcentaje de incremento anual del terreno: ");
        incremento = Double.parseDouble(System.console().readLine());

        double valorAuto = precio * Math.pow(1 - devaluacion / 100, 3);
        double perdidaAuto = precio - valorAuto;

        double valorTerreno = precio * Math.pow(1 + incremento / 100, 3);
        double gananciaTerreno = valorTerreno - precio;

        double mitadGanancia = gananciaTerreno / 2;

        resultado = perdidaAuto <= mitadGanancia ? 1 : 2;

        switch (resultado) {
            case 1:
                System.out.println("Debe comprar el automovil.");
                System.out.println("Mitad de la ganancia del terreno: " + mitadGanancia);
                break;
            case 2:
                System.out.println("No debe comprar el automovil.");
                System.out.println("Perdida del automovil: " + perdidaAuto);
                System.out.println("Ganancia del terreno: " + gananciaTerreno);
            default:
                throw new AssertionError();
        }

    }
}
