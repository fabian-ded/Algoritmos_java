/* Un científico desea que un algoritmo le ayude en su trabajo analizándole tres valores que se
suministran, para determinar si los dos primeros son las medidas de una figura conocida. Para ello,
calcule el área de cada una de las figuras que se mencionan a continuación y compárela con el
tercer valor suministrado; si hay coincidencia, imprima un mensaje que indique de qué figura se
trata. Las figuras a analizar son:
• Triángulo: b*h Valor1 y Valor2 son base y altura
2
• Círculo: pi * r2 Valor1 y Valor2 son radio y pi
• Rectángulo: b * h Valor1 y Valor2 son base y altura. */
package ALGORITMOS_IF;

public class Algoritmo_IF4 {
    
    public static void main(String[] args) {
        
    double base;
    double altura;
    double v3;

        System.out.println("Ingrese base: ");
        base = Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese altura: ");
        altura = Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese numero a comparar: ");
        v3 = Double.parseDouble(System.console().readLine());

        double triangulo = (base*altura)/2;
        double circulo = altura*(base*base);
        double rectangulo = base*altura;


        if(triangulo==v3){
            System.out.println("Su figura es un triangulo");
        }else if(circulo==v3){
            System.out.println("Su figura es un circulo");
        }else if(rectangulo==v3){
            System.out.println("Su figura es un rectangulo");
        }else{
            System.out.println("No es ninguna figura");
        }
    }
}
