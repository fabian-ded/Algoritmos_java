/* Se tienen 4 dígitos en las variables A, B, C, D que forman un entero positivo N. Se desea redondear
N a la centena más próxima y mostrar el resultado. Considere los siguientes ejemplos: Si A es 2, B
es 3, C es 6 y D es 2, entonces N es 2362 y el resultado redondeado es 2400. Si N es 2342, el
resultado redondeado será 2300 y si N es 2962, el resultado redondeado será 3000. */
package ALGORITMOS_IF;

public class Algoritmo_IF7 {
    public static void main(String[] args) {
        
        int A;
        int B;
        int C;
        int D;

        System.out.println("Ingrese numero para A: ");
        A = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese numero para B: ");
        B = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese numero para C: ");
        C = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese numero para D: ");
        D = Integer.parseInt(System.console().readLine());

        if(C<5){
            int redon_menor = (A*1000)+(B*100);
            System.out.println("El numero redondeado es1: " + redon_menor);
        }else if (C>=5){
            int redon_mayor = (A*1000)+((B+1)*100);
            System.out.println("El numero redondeado es2: " + redon_mayor);
        }

    }
}
