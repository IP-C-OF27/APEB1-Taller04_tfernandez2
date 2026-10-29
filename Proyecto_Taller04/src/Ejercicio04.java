
import java.util.Scanner;

/**
 * Ejercicio 04: "Generar un algoritmo que permita calcular y mostrar el valor de la planilla de teléfono de un casa. 
 * Se debe ingresar el costo por minutos, el número de minutos consumidos en el mes."
 * @author Tamara Fernández
 * @version 1.0
 */

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        double costoMinuto, minutosCons, planilla;
        
        System.out.println("-------- Planilla del teléfono ---------");
        System.out.print("Ingrese el costo por minutos: ");
        costoMinuto = tcl.nextDouble ();
        System.out.print("Ingrese el número de minutos consumidos: ");
        minutosCons = tcl.nextDouble ();
        
        planilla = costoMinuto * minutosCons;
        System.out.println("Consumo total: " + planilla);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
-------- Planilla del tel�fono ---------
Ingrese el costo por minutos: 2,5
Ingrese el n�mero de minutos consumidos: 10
Consumo total: 25.0
BUILD SUCCESSFUL (total time: 10 seconds)
 */