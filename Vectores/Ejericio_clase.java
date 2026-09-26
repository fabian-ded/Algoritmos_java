package Vectores;
import java.util.Scanner;

public class Ejericio_clase {
    public static void main(String[] args){

        Scanner Entrada = new Scanner(System.in);
        int[] Contenido = new int[6];
        int[] Asedente = new int[6];

        for (int i = 0; i < 6; i++){
            System.out.println("Ingrese los numeros que quiera: ");
            Contenido[i] = Entrada.nextInt();
        }

        for (int i = 0; i < 6; i++){
            for (int j = 1; j < 6; j++){
                if (Contenido[i] < Contenido[j]){
                    Asedente[i] = Contenido[i];
                }else {
                    System.out.println("el numero: " + Contenido[i] + "no es menor: " + Contenido[j]);
                }
            }
        }

        int numero = 0;
        System.out.println("-------------------------------------");
        for (int i = 0; i < Asedente.length; i++){
            numero++;
            System.out.println(Asedente[i] + "-" + numero);
        }
    }
}

