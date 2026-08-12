package ALGORITMOS;
/* Un vendedor recibe un sueldo base, más un 10% extra por comisiones de sus ventas. El vendedor
desea saber cuánto dinero obtendrá por concepto de comisiones por las tres ventas que realizó en
el mes y el total que recibirá tomando en cuenta su sueldo base y sus comisiones. */

public class Algoritmo_theree {
    public static void main(String[] args) {
        double sueldo = 2000000;
        int comision = 10; 
        double venta1;
        double venta2;
        double venta3;
        System.out.println("Valore de primera venta");
        venta1 = Double.parseDouble(System.console().readLine());
        System.out.println("Valore de segunfda venta");
        venta2 = Double.parseDouble(System.console().readLine());
        System.out.println("Valore de tercer venta");
        venta3 = Double.parseDouble(System.console().readLine());
        double comision_por_venta = (venta1 + venta2 + venta3)*comision;
        double comision_final = (comision_por_venta/100);
        System.out.println("su comision es de: " + comision_final);
        double sueldo_final = (sueldo + comision_final);
        int total = (int) sueldo_final;
        System.out.println("Y su sueldo todal mas comisiones del mes es de: " + total);
    }
}