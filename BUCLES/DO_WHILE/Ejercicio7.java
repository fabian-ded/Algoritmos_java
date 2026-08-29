/* Una persona debe realizar un muestreo con 100 personas para determinar el promedio de peso de
los niños, jóvenes, adultos y viejos que existen en su zona habitacional. Para ello, conforme
encuentra a las personas introduce los datos a su computadora, la cual mediante un programa las
clasifica y despliega los cuatro promedios que la persona requiere. Las categorías se trabajan de
acuerdo a la siguiente tabla:
categoria   edad
Niños 0-12
joven 13-29
adulto 30-59
viejos 60 en adelante
*/
package BUCLES.DO_WHILE;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args){

        int Niño, Joven, Adulto, Viejo;
        int res1 = 0;
        int cantidad = 100;
        double pes_N, pes_J, pes_A, pes_V;
        double por_N, por_J, por_A, por_V;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de Niños que viven en el lugar");
        Niño = entrada.nextInt();
        System.out.println("Ingrese la cantidad de Jovenes que viven en el lugar");
        Joven = entrada.nextInt();
        System.out.println("Ingrese la cantidad de Adultos que viven en el lugar");
        Adulto = entrada.nextInt();
        System.out.println("Ingrese la cantidad de Viejos que viven en el lugar");
        Viejo = entrada.nextInt();

        do {

            System.out.println("ingrese el peso del niños: ");
            pes_N = entrada.nextDouble();
            System.out.println("ingrese el peso del Joven: ");
            pes_J = entrada.nextDouble();
            System.out.println("ingrese el peso del Adulto: ");
            pes_A = entrada.nextDouble();
            System.out.println("ingrese el peso del Viejo: ");
            pes_V = entrada.nextDouble();

            res1 += 1;

            pes_N = Niño*pes_N;
            pes_J = Joven*pes_J;
            pes_A = Adulto*pes_A;
            pes_V = Viejo*pes_V;

            por_N = pes_N/Niño;
            por_J = pes_J/Joven;
            por_A = pes_A/Adulto;
            por_V = pes_V/Viejo;


            System.out.println("la cantidad de Niños es de: " + Niño);
            System.out.println("la cantidad de Jovenes es de: " + Joven);
            System.out.println("la cantidad de Adultos es de: " + Adulto);
            System.out.println("la cantidad de Viejos es de: " + Viejo);

            System.out.println("la cantidad de peso en los Niños es de: " + por_N);
            System.out.println("la cantidad de peso en los Jovenes es de: " + por_J);
            System.out.println("la cantidad de peso en los Adultos es de: " + por_A);
            System.out.println("la cantidad de peso en los Viejos es de: " + por_V);


        }while (cantidad > res1);

    }
}
