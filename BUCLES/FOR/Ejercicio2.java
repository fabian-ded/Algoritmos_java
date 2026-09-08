package BUCLES.FOR;

public class Ejercicio2 {
    public static void main(String[] args){

        for (int num = 1; num <= 100; num+=2){
            if (num%7 ==0){
                num++;
            }
            System.out.println(num);
        }
    }
}
