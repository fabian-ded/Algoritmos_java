package ALGORTMO_SWITCH;

public class Algoritmo_SW18 {
    public static void main(String[] args) {
        
        double hectareas;
        double pinos;
        double oyameles;
        double cedros;
        int conteo;

        System.out.println("Ingrese la cantidad de hectareas: ");
        hectareas = Double.parseDouble(System.console().readLine());

        double superficie = hectareas * 10000;

        conteo = superficie > 1000000 ? 1 : 2;

        switch (conteo) {
            case 1:
                double superficiePino = superficie * 0.70;
                double superficieOyamel = superficie * 0.20;
                double superficieCedro = superficie * 0.10;

                pinos = (superficiePino * 8) / 10;
                oyameles = (superficieOyamel * 15) / 15;
                cedros = (superficieCedro * 10) / 18;
                
                System.out.println("Cantidad de pinos: " + pinos);
                System.out.println("Cantidad de oyameles: " + oyameles);
                System.out.println("Cantidad de cedros: " + cedros);

                break;
            case 2:
                double superficiePino1 = superficie * 0.50;
                double superficieOyamel1 = superficie * 0.30;
                double superficieCedro1 = superficie * 0.20;

                double pinos1 = (superficiePino1 * 8) / 10;
                double oyameles1 = (superficieOyamel1 * 15) / 15;
                double cedros1 = (superficieCedro1 * 10) / 18;

                System.out.println("Cantidad de pinos: " + pinos1);
                System.out.println("Cantidad de oyameles: " + oyameles1);
                System.out.println("Cantidad de cedros: " + cedros1);
                break;
            default:
                throw new AssertionError();
        }
        

    }
}
