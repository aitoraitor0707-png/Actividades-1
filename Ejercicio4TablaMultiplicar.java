package EjerciciosEstructurasControl;

import java.util.Scanner;

// Ejercicio 4: Mostrar la tabla de multiplicar de un número introducido por teclado.
// El usuario indica el número y el bucle recorre del 1 al 10 para calcular cada producto.
public class Ejercicio4TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            // Se calcula el producto del número por cada valor del multiplicador.
            System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
        }

        scanner.close();
    }
}
