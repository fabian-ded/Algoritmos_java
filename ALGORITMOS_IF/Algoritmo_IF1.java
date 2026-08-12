package ALGORITMOS_IF;

public class Algoritmo_IF1 {
    public static void main(String[] args) {
        double inversion;
        double interes;

        System.out.println("Ingrese la cantidad de inversion que tiene en el banco");
        inversion = Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese la cantidad de interes");
        interes = Double.parseDouble(System.console().readLine());

        double intereses = inversion*(interes/100);

        if(intereses>7000){
            System.out.println("Su inversion si supiera lo solicitado: " + intereses);
        }else{
            System.out.println("Su inversion no supiera lo solicitado: " + intereses);
        }

    }
}
