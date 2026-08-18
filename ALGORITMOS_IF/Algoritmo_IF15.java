/* Desarrolle un algoritmo que reciba como dato de entrada la fecha de nacimiento de una persona
y a continuación escriba el nombre del signo del zodiaco correspondiente; así como su edad.
Considere la siguiente tabla de signos: */
package ALGORITMOS_IF;

public class Algoritmo_IF15 {
    public static void main(String[] args) {

        int diaNacimiento;
        int mesNacimiento;
        int añoNacimiento;

        int diaActual;
        int mesActual;
        int añoActual;

        System.out.println("Ingrese el dia de nacimiento: ");
        diaNacimiento = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el mes de nacimiento: ");
        mesNacimiento = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el año de nacimiento: ");
        añoNacimiento = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el dia actual: ");
        diaActual = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el mes actual: ");
        mesActual = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el año actual: ");
        añoActual = Integer.parseInt(System.console().readLine());

        String signo = "";

        if ((mesNacimiento == 12 && diaNacimiento >= 22) ||
            (mesNacimiento == 1 && diaNacimiento <= 19)) {

            signo = "Capricornio";

        } else if ((mesNacimiento == 1 && diaNacimiento >= 20) ||
                   (mesNacimiento == 2 && diaNacimiento <= 18)) {

            signo = "Acuario";

        } else if ((mesNacimiento == 2 && diaNacimiento >= 19) ||
                   (mesNacimiento == 3 && diaNacimiento <= 20)) {

            signo = "Piscis";

        } else if ((mesNacimiento == 3 && diaNacimiento >= 21) ||
                   (mesNacimiento == 4 && diaNacimiento <= 19)) {

            signo = "Aries";

        } else if ((mesNacimiento == 4 && diaNacimiento >= 20) ||
                   (mesNacimiento == 5 && diaNacimiento <= 20)) {

            signo = "Tauro";

        } else if ((mesNacimiento == 5 && diaNacimiento >= 21) ||
                   (mesNacimiento == 6 && diaNacimiento <= 20)) {

            signo = "Géminis";

        } else if ((mesNacimiento == 6 && diaNacimiento >= 21) ||
                   (mesNacimiento == 7 && diaNacimiento <= 22)) {

            signo = "Cáncer";

        } else if ((mesNacimiento == 7 && diaNacimiento >= 23) ||
                   (mesNacimiento == 8 && diaNacimiento <= 22)) {

            signo = "Leo";

        } else if ((mesNacimiento == 8 && diaNacimiento >= 23) ||
                   (mesNacimiento == 9 && diaNacimiento <= 22)) {

            signo = "Virgo";

        } else if ((mesNacimiento == 9 && diaNacimiento >= 23) ||
                   (mesNacimiento == 10 && diaNacimiento <= 22)) {

            signo = "Libra";

        } else if ((mesNacimiento == 10 && diaNacimiento >= 23) ||
                   (mesNacimiento == 11 && diaNacimiento <= 21)) {

            signo = "Escorpio";

        } else if ((mesNacimiento == 11 && diaNacimiento >= 22) ||
                   (mesNacimiento == 12 && diaNacimiento <= 21)) {

            signo = "Sagitario";
        }

        int edad = añoActual - añoNacimiento;

        if (mesActual < mesNacimiento) {
            edad = edad - 1;
        } else if (mesActual == mesNacimiento && diaActual < diaNacimiento) {
            edad = edad - 1;
        }

        System.out.println("Su signo zodiacal es: " + signo);
        System.out.println("Su edad es: " + edad + " años");
    }
}
