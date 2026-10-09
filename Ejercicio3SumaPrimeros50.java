package EjerciciosEstructurasControl;

// Ejercicio 3: Calcular la suma de los primeros 50 números naturales.
// La variable suma acumula el valor de cada número dentro del bucle.
public class Ejercicio3SumaPrimeros50 {
    public static void main(String[] args) {
        int suma = 0;

        for (int numero = 1; numero <= 50; numero++) {
            // Acumulamos cada valor en la suma total.
            suma += numero;
        }

        System.out.println("La suma de los primeros 50 números naturales es: " + suma);
    }
}
