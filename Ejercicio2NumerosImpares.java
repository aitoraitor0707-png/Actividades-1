package EjerciciosEstructurasControl;

// Ejercicio 2: Mostrar los números impares del 1 al 100.
// Recorremos el rango completo y se imprimen solo los valores cuyo resto al dividir entre 2 no es 0.
public class Ejercicio2NumerosImpares {
    public static void main(String[] args) {
        System.out.println("Números impares del 1 al 100:");

        for (int numero = 1; numero <= 100; numero++) {
            // Si el resto es distinto de 0, el número es impar.
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
        }
    }
}
