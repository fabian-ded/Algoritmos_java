package ALGORTMO_SWITCH;

public class Algoritmo_SW21 {
    public static void main(String[] args) {
        
        double hipoteca;
        double inversion;

        System.out.println("Ingrese el monto de la hipoteca: ");
        hipoteca = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el monto total de la inversion: ");
        inversion = Double.parseDouble(System.console().readLine());

        double persona;
        double socio;
        double cuenta;
        int resultado;

        resultado = hipoteca < 1000000 ? 1 : 2 ;

        switch (resultado) {
            case 1:
                persona = inversion * 0.50;
                socio = inversion * 0.50;
                cuenta = persona - hipoteca;
                break;
            case 2:
                double faltante = inversion - hipoteca;
                persona = hipoteca + (faltante / 2);
                socio = faltante / 2;
                cuenta = 0;
                break;
            default:
                throw new AssertionError();
        }
        System.out.println("Dinero aportado por la persona: " + persona);
        System.out.println("Dinero aportado por el socio: " + socio);
        System.out.println("Dinero utilizado de la cuenta bancaria: " + cuenta);
    }
}
