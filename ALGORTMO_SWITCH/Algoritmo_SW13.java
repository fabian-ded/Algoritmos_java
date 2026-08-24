package ALGORTMO_SWITCH;

public class Algoritmo_SW13 {
    public static void main(String[] args) {

        System.out.println("Ingrese la cantidad de dinero: ");
        int cantidad = Integer.parseInt(System.console().readLine());

        int opcion;

        // Paso 1: decidir qué billete corresponde
        opcion = cantidad >= 50000 ? 1 :
                cantidad >= 20000 ? 2 :
                cantidad >= 10000 ? 3 :
                cantidad >= 5000 ? 4 :
                cantidad >= 2000 ? 5 :
                cantidad >= 1000 ? 6 :
                cantidad >= 500 ? 7 :
                cantidad >= 100 ? 8 :
                cantidad >= 50 ? 9 :
                cantidad >= 20 ? 10 :
                cantidad >= 10 ? 11 : 12;

        switch (opcion) {

            case 1:
                int billetes50000 = cantidad / 50000;
                cantidad = cantidad % 50000;
                System.out.println("Billetes de 50000: " + billetes50000);
            case 2:
                int billetes20000 = cantidad / 20000;
                cantidad = cantidad % 20000;
                System.out.println("Billetes de 20000: " + billetes20000);
            case 3:
                int billetes10000 = cantidad / 10000;
                cantidad = cantidad % 10000;
                System.out.println("Billetes de 10000: " + billetes10000);
            case 4:
                int billetes5000 = cantidad / 5000;
                cantidad = cantidad % 5000;
                System.out.println("Billetes de 5000: " + billetes5000);
            case 5:
                int billetes2000 = cantidad / 2000;
                cantidad = cantidad % 2000;
                System.out.println("Billetes de 2000: " + billetes2000);
            case 6:
                int billetes1000 = cantidad / 1000;
                cantidad = cantidad % 1000;
                System.out.println("Billetes de 1000: " + billetes1000);
            case 7:
                int billetes500 = cantidad / 500;
                cantidad = cantidad % 500;
                System.out.println("Billetes de 500: " + billetes500);
            case 8:
                int billetes100 = cantidad / 100;
                cantidad = cantidad % 100;
                System.out.println("Billetes de 100: " + billetes100);
            case 9:
                int billetes50 = cantidad / 50;
                cantidad = cantidad % 50;
                System.out.println("Billetes de 50: " + billetes50);
            case 10:
                int billetes20 = cantidad / 20;
                cantidad = cantidad % 20;
                System.out.println("Billetes de 20: " + billetes20);
            case 11:
                int billetes10 = cantidad / 10;
                cantidad = cantidad % 10;
                System.out.println("Billetes de 10: " + billetes10);
                break;
        }

        System.out.println("Dinero restante: " + cantidad);

    }
}
