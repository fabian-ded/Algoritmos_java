/* Dados como datos los valores enteros P y Q, determine si los mismos satisfacen la siguiente
expresión: P3 + Q4 – 2*P2 > 680. En caso afirmativo debe mostrar los valores de P y Q, de lo contrario
muestre un mensaje alusivo al hecho. */
package ALGORITMOS_IF;

public class Algoritmo_IF9 {
    public static void main(String[] args) {
        
        int P;
        int Q;
         
        System.out.println("Ingrese numero P: ");
        P = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese numero P: ");
        Q = Integer.parseInt(System.console().readLine());

        double resultadoP3 = Math.pow(P, 3);
        double resultadoQ4 = Math.pow(Q, 4);
        double resultadoP2 = Math.pow(P, 2)*2;
        double total = resultadoP3 + resultadoQ4 - resultadoP2;

        if(total>680){
            System.out.println("Resultado de P: " + resultadoP3);
            System.out.println("Resultado de Q: " + resultadoQ4);
        }else{
            System.out.println("No se supero el numero esperado el resultado fue: " + total);
        }
    }
}
