package ALGORTMO_SWITCH;

public class Algoritmo_SW20 {
    public static void main(String[] args) {
        
        double capital;
        double prestamo;
        double presupuesto;
        int solucion;

        System.out.println("Ingrese el capital actual: ");
        capital = Double.parseDouble(System.console().readLine());

        solucion = capital < 10000 ? 1 :
        capital <= 20000 ? 2 : 3;

        switch (solucion) {
            case 1:
                prestamo = 10000 - capital;
                presupuesto = capital + prestamo;
                break;
            case 2:
                prestamo = 20000 - capital;
                presupuesto = capital + prestamo;
                break;
            case 3:
                prestamo = 0;
                presupuesto = capital;
                break;
            default:
                throw new AssertionError();
        }
        
        double restante = presupuesto - 5000 - 2000;

        double insumos = restante / 2;
        double incentivos = restante / 2;

        System.out.println("Cantidad del prestamo: " + prestamo);
        System.out.println("Cantidad para compra de insumos: " + insumos);
        System.out.println("Cantidad para incentivos al personal: " + incentivos);

    }
}
