package ALGORTMO_SWITCH;

public class Algoritmo_SW15 {
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

switch (mesNacimiento) {

    case 1:
        signo = diaNacimiento <= 19 ? "Capricornio" : "Acuario";
        break;

    case 2:
        signo = diaNacimiento <= 18 ? "Acuario" : "Piscis";
        break;

    case 3:
        signo = diaNacimiento <= 20 ? "Piscis" : "Aries";
        break;

    case 4:
        signo = diaNacimiento <= 19 ? "Aries" : "Tauro";
        break;

    case 5:
        signo = diaNacimiento <= 20 ? "Tauro" : "Géminis";
        break;

    case 6:
        signo = diaNacimiento <= 20 ? "Géminis" : "Cáncer";
        break;

    case 7:
        signo = diaNacimiento <= 22 ? "Cáncer" : "Leo";
        break;

    case 8:
        signo = diaNacimiento <= 22 ? "Leo" : "Virgo";
        break;

    case 9:
        signo = diaNacimiento <= 22 ? "Virgo" : "Libra";
        break;

    case 10:
        signo = diaNacimiento <= 22 ? "Libra" : "Escorpio";
        break;

    case 11:
        signo = diaNacimiento <= 21 ? "Escorpio" : "Sagitario";
        break;

    case 12:
        signo = diaNacimiento <= 21 ? "Sagitario" : "Capricornio";
        break;

    default:
        signo = "Mes no válido";
}

    }
}
