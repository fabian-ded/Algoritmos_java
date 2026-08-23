package ALGORTMO_SWITCH;

public class Algoritmo_SW6 {
    public static void main(String[] args) {
        
        double Cundinamarca;
        double Meta;
        double Antioquia;
        double Porcentaje = 33;
        double Salario;
        int valor1;
        int valor2;
        int valor3;

        System.out.println("Ingrese la cantidad de las ventas en Cundinamarca: ");
        Cundinamarca = Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese la cantidad de las ventas en Meta: ");
        Meta = Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese la cantidad de las ventas en Antioquia: ");
        Antioquia = Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese sueldo: ");
        Salario = Double.parseDouble(System.console().readLine());

        double ventas_totales = Cundinamarca + Meta + Antioquia;
        double Ven_cundi = (Cundinamarca/ventas_totales)*100;
        double Ven_Meta = (Meta/ventas_totales)*100;
        double Ven_Antioquia = (Antioquia/ventas_totales)*100;

        valor1 = Ven_cundi>Porcentaje ? 1: 2;
        valor2 = Ven_Meta>Porcentaje ? 1: 2;
        valor3 = Ven_Antioquia>Porcentaje ? 1: 2;

        switch(valor1){
            case 1:
                double Total_Cundi = Salario*1.20;
                System.out.println("El sueldo total del grupo de cundinamarca es: " + Total_Cundi); 
            break;
            case 2:
                System.out.println("El sueldo total del grupo es: " + Salario);
                break;
        default:
            throw new AssertionError();
        }
        switch(valor2) {
            case 1:
                double Total_Meta = Salario*1.20;
                System.out.println("El sueldo total del grupo de Meta es: " + Total_Meta);
                break;
            case 2:
                System.out.println("El sueldo total del grupo es: " + Salario);
                break;
            default:
                throw new AssertionError();
        }
        switch (valor3) {
            case 1:
                double Total_Antioquia = Salario*1.20;
                System.out.println("El sueldo total del grupo de Antioquia es: " + Total_Antioquia);
            break;
            case 2:
                System.out.println("El sueldo total del grupo es: " + Salario);
                break;
            default:
                throw new AssertionError();
        }
            

    }
}
