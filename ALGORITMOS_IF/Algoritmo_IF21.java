/* Una persona desea iniciar un negocio, para lo cual piensa verificar cuánto dinero le prestaría el
banco por hipotecar su casa. Tiene una cuenta bancaria, pero no quiere disponer de ella a menos
que el monto por hipotecar su casa sea muy pequeño. Si el monto de la hipoteca es menor que
$1.000.000 entonces invertirá el 50% de la inversión total, y un socio invertirá el otro 50%. Si el
monto de la hipoteca es de $1.000.000 o más, entonces invertirá el monto total de la hipoteca y el
resto del dinero que se necesite para cubrir la inversión total se repartirá a partes iguales entre el
socio y él. */
package ALGORITMOS_IF;

public class Algoritmo_IF21 {
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

        if (hipoteca < 1000000) {

            persona = inversion * 0.50;
            socio = inversion * 0.50;

            cuenta = persona - hipoteca;

        } else {

            double faltante = inversion - hipoteca;

            persona = hipoteca + (faltante / 2);
            socio = faltante / 2;

            cuenta = 0;
        }

        System.out.println("Dinero aportado por la persona: " + persona);
        System.out.println("Dinero aportado por el socio: " + socio);
        System.out.println("Dinero utilizado de la cuenta bancaria: " + cuenta);
    }
}
