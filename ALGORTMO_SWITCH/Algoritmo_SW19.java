package ALGORTMO_SWITCH;

public class Algoritmo_SW19 {
    public static void main(String[] args) {
        
        int edadMeses;
        double hemoglobina;
        String sexo;

        System.out.println("Ingrese la edad en meses: ");
        edadMeses = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el nivel de hemoglobina: ");
        hemoglobina = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el sexo (M para mujer / H para hombre): ");
        sexo = System.console().readLine();

        double minimo = 0;
        int resultado;
        int resul_final;

        resultado = edadMeses >= 0 && edadMeses <= 1 ? 1 :
        edadMeses > 1 && edadMeses <= 6 ? 2 :
        edadMeses > 6 && edadMeses <= 12 ? 3 :
        edadMeses >= 12 && edadMeses <= 60 ? 4 :
        edadMeses >= 60 && edadMeses <= 120 ? 5 :
        edadMeses >= 120 && edadMeses <= 180 ? 6 :
        edadMeses >= 180 && (sexo.equalsIgnoreCase("M")) ? 7 :
        edadMeses >= 180 && (sexo.equalsIgnoreCase("H")) ? 8 : 9;

        switch (resultado) {
            case 1:
                minimo = 13;
                break;
            case 2:
                minimo = 10;
                break;
            case 3:
                minimo = 11;
                break;
            case 4:
                minimo = 11.5;
                break;
            case 5:
                minimo = 12.6;
                break;
            case 6:
                minimo = 13;
                break;
            case 7:
                minimo = 12;
                break;
            case 8:
                minimo = 14;
                break;
            default:
                throw new AssertionError();
        }

        resul_final = hemoglobina < minimo ? 1 : 2;

        switch (resul_final) {
            case 1:
                System.out.println("Resultado positivo: La persona tiene anemia.");
                break;
            case 2:
                System.out.println("Resultado negativo: La persona no tiene anemia.");
                break;
            default:
                throw new AssertionError();
        }
            System.out.println("Resultado Final del Nivel minimo de hemoglobina permitido: " + minimo + " g%");

    }
}
