package EjerciciosEstructurasControl;

// Ejercicio 1: Mostrar los números pares del 1 al 100.
// El bucle recorre todos los números y el if comprueba cuáles son divisibles entre 2.
public class Ejercicio1NumerosPares {
    public static void main(String[] args) {
        System.out.println("Números pares del 1 al 100:");

        for (int numero = 1; numero <= 100; numero++) {
            // Si el resto al dividir entre 2 es 0, el número es par.
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }
}
