/* Desarrolle un algoritmo, que dado como dato una temperatura en grados Fahrenheit, determine
el deporte que es apropiado practicar a esa temperatura, teniendo en cuenta la siguiente tabla:
DEPORTE   TEMPERATURA
Natacón         Temp. >85
Tenis           70<Temp. <85
Golf            32<Temp. <70
Esqui           10<Temp. <32
Marcha          Temp. <= 10
*/
package ALGORITMOS_IF;

public class Algoritmo_IF12 {
    public static void main(String[] args) {

        double temperatura;

        System.out.println("Ingrese la temperatura en grados Fahrenheit: ");
        temperatura = Double.parseDouble(System.console().readLine());

        if (temperatura > 85) {
            System.out.println("El deporte apropiado es: Natación");
        } 
        else if (temperatura > 70) {
            System.out.println("El deporte apropiado es: Tenis");
        } 
        else if (temperatura > 32) {
            System.out.println("El deporte apropiado es: Golf");
        } 
        else if (temperatura > 10) {
            System.out.println("El deporte apropiado es: Esquí");
        } 
        else {
            System.out.println("El deporte apropiado es: Marcha");
        }
    }
}
