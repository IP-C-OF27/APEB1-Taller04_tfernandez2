import java.util.Scanner;

/**
 * Ejercicio 01: "Generar un algoritmo que permite calcular y presentar el área de un triángulo. Los datos deben ser 
 * pedidos al usuario."
 * @author Tamara Fernández
 * @version 1.0
 */

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        double base, altura, area;
        
        System.out.print("Introduzca la base de su triangulo: ");
        base = tcl.nextDouble();
        System.out.print("Introduzca la altura de su triangulo: ");
        altura = tcl.nextDouble();
        
        area = (base * altura)/2;
        System.out.println("Su area es igual a: " + area);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Introduzca la base de su triangulo: 3
Introduzca la altura de su triangulo: 10
Su area es igual a: 15.0
BUILD SUCCESSFUL (total time: 4 seconds)
 */