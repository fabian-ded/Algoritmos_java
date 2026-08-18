/* Tomando como base los resultados obtenidos en un laboratorio de análisis clínicos, un médico
determina si una persona tiene anemia o no, lo cual depende de su nivel de hemoglobina en la
sangre, de su edad y de su sexo. Si el nivel de hemoglobina que tiene una persona es menor que
el rango que le corresponde, se determina su resultado como positivo y en caso contrario como
negativo. La tabla en la que el médico se basa para obtener el resultado es la siguiente:
EDAD NIVEL DE HEMOGLOBINA
0 - 1 mes 13 - 26 g%
Mayor de 1 y menor o igual de 6 meses 10 - 18 g%
Mayor de 6 y menor o igual de 12 meses 11 - 15 g%
Mayor de 1 y menor o igual que 5 años 11.5 - 15 g%
Mayor de 5 y menor o igual que 10 años 12.6 – 15.5 g%
Mayor de 10 y menor o igual que 15 años 13 - 15.5 g%
Mujeres mayores de 15 años 12 - 16 g%
Hombres mayores de 15 años 14 - 18 g%
Desarrolle un algoritmo que indique, si una persona tiene Anemia o no. */
package ALGORITMOS_IF;

public class Algoritmo_IF19 {
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

        if (edadMeses >= 0 && edadMeses <= 1) {

            minimo = 13;

        } else if (edadMeses > 1 && edadMeses <= 6) {

            minimo = 10;

        } else if (edadMeses > 6 && edadMeses <= 12) {

            minimo = 11;

        } else if (edadMeses > 12 && edadMeses <= 60) {

            minimo = 11.5;

        } else if (edadMeses > 60 && edadMeses <= 120) {

            minimo = 12.6;

        } else if (edadMeses > 120 && edadMeses <= 180) {

            minimo = 13;

        } else if (edadMeses > 180 && sexo.equalsIgnoreCase("M")) {

            minimo = 12;

        } else if (edadMeses > 180 && sexo.equalsIgnoreCase("H")) {

            minimo = 14;
        }

        if (hemoglobina < minimo) {
            System.out.println("Resultado positivo: La persona tiene anemia.");
        } else {
            System.out.println("Resultado negativo: La persona no tiene anemia.");
        }

        System.out.println("Nivel minimo de hemoglobina permitido: " + minimo + " g%");
    }
}
