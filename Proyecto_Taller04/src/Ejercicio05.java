
import java.util.Scanner;

/**
 * Ejercicio 05: "Generar un algoritmo que permita calcular y mostrar el costos de una computadora de escritorio. 
 * La misma es comprada por partes; CPU, teclado, pantalla, ratón."
 * @author Tamara Fernández
 * @version 1.0
 */

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        double costoCPU, costoTcl, costoPantalla, costoRaton, costoTotal;
        
        System.out.println("----------- Factura: Computadora de escritorio ------------");
        System.out.print("Precio CPU _______________________ ");
        costoCPU = tcl.nextDouble ();
        System.out.print("Precio teclado ___________________ ");
        costoTcl = tcl.nextDouble ();
        System.out.print("Precio pantalla __________________ ");
        costoPantalla = tcl.nextDouble ();
        System.out.print("Precio raton _____________________ ");
        costoRaton = tcl.nextDouble ();
        
        costoTotal = costoCPU + costoPantalla + costoTcl + costoRaton;
        System.out.println("Total ---------------- " + costoTotal);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 */