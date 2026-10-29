import java.util.Scanner;

/**
 * Ejercicio 02: "Generar un algoritmo que permite ingresar los gastos de tres hijos de un padre de familia; calcular 
 * y mostrar el total de gastos de los hijos del padre de familia."
 * @author Tamara Fernández
 * @version 1.0
 */

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        double gasto1, gasto2, gasto3, gastoTotal;
        
        System.out.print("Introduzca gastos: ");
        gasto1 = tcl.nextDouble();
        gasto2 = tcl.nextDouble();
        gasto3 = tcl.nextDouble();
        
        gastoTotal = gasto1 + gasto2 + gasto3;
        System.out.println("Su gasto total: " + gastoTotal);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Introduzca gastos: 40
50
25
Su gasto total: 115.0
BUILD SUCCESSFUL (total time: 6 seconds)
 */