/* Una empresa que comercializa cosméticos tiene organizados a sus vendedores en tres
departamentos y ha establecido un programa de incentivos para incrementar su productividad. El
gerente, al final del mes, pide el importe global de las ventas de los tres departamentos y aquellos
que excedan el 33% de las ventas totales se les paga una cantidad extra equivalente al 20% de su
salario mensual. Si todos los vendedores ganan lo mismo, determinar cuánto recibirán los
vendedores de los tres departamentos al finalizar el mes. */
package ALGORITMOS_IF;

public class Algoritmo_IF6 {
    public static void main(String[] args) {
        
    double Cundinamarca;
    double Meta;
    double Antioquia;
    double Porcentaje = 33;
    double Salario;

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

    if(Ven_cundi>Porcentaje){
        double Total_Cundi = Salario*1.20;
        System.out.println("El sueldo total del grupo de cundinamarca es: " + Total_Cundi);   
    }else{
        System.out.println("El sueldo total del grupo es: " + Salario);
    }
    if(Ven_Meta>Porcentaje){
        double Total_Meta = Salario*1.20;
        System.out.println("El sueldo total del grupo de Meta es: " + Total_Meta);
    }else{
        System.out.println("El sueldo total del grupo es: " + Salario);
    }
    if(Ven_Antioquia>Porcentaje){
        double Total_Antioquia = Salario*1.20;
        System.out.println("El sueldo total del grupo de Antioquia es: " + Total_Antioquia);
    }else{
        System.out.println("El sueldo total del grupo es: " + Salario);
    }

    }

}
