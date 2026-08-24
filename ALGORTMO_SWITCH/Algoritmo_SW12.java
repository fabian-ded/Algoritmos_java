package ALGORTMO_SWITCH;

public class Algoritmo_SW12 {
    public static void main(String[] args) {
        
        double temperatura;
        int respuesta;

        System.out.println("Ingrese la temperatura en grados Fahrenheit: ");
        temperatura = Double.parseDouble(System.console().readLine());

        respuesta = temperatura > 85 ? 1 :
        temperatura > 70 ? 2 :
        temperatura > 32 ? 3 : 
        temperatura > 10 ? 4 : 5 ;

        switch (respuesta) {
            case 1:
                System.out.println("El deporte apropiado es: Natación");
                break;
            case 2:
                System.out.println("El deporte apropiado es: Tenis");
                break;
            case 3:
                System.out.println("El deporte apropiado es: Golf");
                break;
            case 4:
                System.out.println("El deporte apropiado es: Esquí");
                break;
            case 5:
                System.out.println("El deporte apropiado es: Marcha");
                break;
            default:
                throw new AssertionError();
        }

    }
}
