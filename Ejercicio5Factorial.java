package EjerciciosEstructurasControl;

import java.util.Scanner;

// Ejercicio 5: Calcular el factorial de un número entero no negativo.
// Si el número es positivo, se multiplica sucesivamente por cada valor desde 1 hasta n.
public class Ejercicio5Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero no negativo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            // El factorial no existe para valores negativos.
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            long factorial = 1;
            int contador = 1;

            while (contador <= numero) {
                // Cada iteración multiplica el factorial por el contador actual.
                factorial *= contador;
                contador++;
            }

            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

        scanner.close();
    }
}
