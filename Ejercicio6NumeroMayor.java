package EjerciciosEstructurasControl;

import java.util.Scanner;

// Ejercicio 6: Determinar cuál de tres números es el mayor.
// Se comparan las tres cantidades con condiciones if y se guarda el valor máximo.
public class Ejercicio6NumeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int primerNumero = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int segundoNumero = scanner.nextInt();
        System.out.print("Introduce el tercer número: ");
        int tercerNumero = scanner.nextInt();

        int mayor;
        if (primerNumero >= segundoNumero && primerNumero >= tercerNumero) {
            // Si el primero es mayor o igual que los otros, ese es el mayor.
            mayor = primerNumero;
        } else if (segundoNumero >= primerNumero && segundoNumero >= tercerNumero) {
            // Si el segundo es mayor o igual que los otros, ese es el mayor.
            mayor = segundoNumero;
        } else {
            // En caso contrario, el tercero será el mayor.
            mayor = tercerNumero;
        }

        System.out.println("El número mayor es: " + mayor);
        scanner.close();
    }
}
