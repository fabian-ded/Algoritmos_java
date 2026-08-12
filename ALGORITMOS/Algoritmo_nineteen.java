package ALGORITMOS;
/* En un hospital rural existen tres áreas: Ginecología, Pediatría y Traumatología. El presupuesto anual
del hospital se reparte conforme a la siguiente tabla:
Área Porcentaje del presupuesto
Ginecología 40%
Traumatología 30%
Pediatría 30% 
Obtener la cantidad de dinero que recibirá cada área, para cualquier monto presupuestado.
*/

public class Algoritmo_nineteen {
    public static void main(String[] args) {
        
        double presupuesto;
        double ginecologia = 0.40;
        double Traumatologia = 0.30;
        double Pediatria = 0.30;

        System.out.println("Presupuesto del hospital: ");
        String entrada = System.console().readLine();

        presupuesto = Double.parseDouble(entrada.replace(".", ""));

        double pres_gineco = presupuesto*ginecologia;
        double pres_trauma = presupuesto*Traumatologia;
        double pres_pedia = presupuesto*Pediatria;

        System.out.println("Presupuesto para ginecologia: " + pres_gineco);
        System.out.println("Presupuesto para Traumatologia: " + pres_trauma);
        System.out.println("Presupuesto para Pediatria: " + pres_pedia);

    }
}
