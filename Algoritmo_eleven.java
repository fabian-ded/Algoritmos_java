/* 11. Se conoce de un trabajador su nombre, el número de horas normales trabajadas, el pago de una hora
normal y el número de horas extras trabajadas. Además, que, cada hora extra se paga 25% más del
valor de una hora normal. Si se deducen al trabajador sobre el sueldo base 5% del paro forzoso, 2%
de política habitacional y 7% para caja de ahorro. Si se le asignan 25000 Bolívares por actualización
académica, 17300 Bolívares por cada hijo y una prima por hogar de 18000 Bolívares. Calcule y
muestre las asignaciones, las deducciones y el sueldo neto del trabajador. */

public class Algoritmo_eleven {
    public static void main(String[] args) {

        double horas_tra;
        double valor_hor;
        double horas_ext;
        double num_hijos;
        double deduce = 0.14;


        System.out.println("Horas trabajadas: ");
        horas_tra = Double.parseDouble(System.console().readLine());
        System.out.println("valor por horas: ");
        valor_hor = Double.parseDouble(System.console().readLine());
        System.out.println("Horas extras: ");
        horas_ext = Double.parseDouble(System.console().readLine());
        System.out.println("Numero de hijos: ");
        num_hijos = Double.parseDouble(System.console().readLine());

        double suel_base = horas_tra*valor_hor;
        double extras = horas_ext*valor_hor;
        double suel_extra = (extras*1.25)+suel_base;
        System.out.println("Sueldo con horas extras: " + suel_extra);
        double descuento = suel_extra*deduce;
        double forzoso = suel_extra-(suel_extra*0.05);
        double habitacion = suel_extra-(suel_extra*0.02);
        double ahorro = suel_extra-(suel_extra*0.07);
        System.out.println("Sueldo con descescuento del 5% en paro forzoso: " + forzoso + " = " + (suel_extra*0.05));
        System.out.println("Sueldo con descescuento del 2% en politica habitacion: " + habitacion + " = " + (suel_extra*0.02));
        System.out.println("Sueldo con descescuento del 7% en caja de ahorro: " + ahorro + " = " + (suel_extra*0.07));
        System.out.println("Sueldo con descescuentos en total : " + descuento);

        double academia = suel_extra + 25.000;
        double total_hijo = num_hijos * 17.300;
        double bono_hijos = total_hijo + suel_extra;
        double prim_hogar = suel_extra + 18.000;
        System.out.println("Sueldo con academia : " + suel_extra  + " + 25.000 = "  + academia );
        System.out.println("Sueldo por hijos : " +  suel_extra + " + 17.300 = "  + bono_hijos );
        System.out.println("Sueldo con prima de hogar : " + suel_extra + " + 18.000 = " + prim_hogar );

        double asignaciones = academia + bono_hijos + prim_hogar;
        double suel_total = (suel_extra + asignaciones) - descuento;
        System.out.println("Sueldo TOTAL : " + suel_total);

    }
}
