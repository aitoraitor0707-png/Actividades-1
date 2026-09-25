import java.util.*;
public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //CALCULADORA

        System.out.println("-----CALCULADORA DE NUMEROS ENTEROS-----");

        //DECLARACION DE VARIABLES

        System.out.println("Introduzca el pirmer numnero: ");
        int num1 = scanner.nextInt();

        System.out.println("Introduzca el segundo numero: ");
        int num2 = scanner.nextInt();


        //DECLARACION DE OPERACIONES

        int suma = num1 + num2;

        int resta = num1 - num2;

        int division = num1/num2;

        int multiplicacion = num1 * num2;

        int modulo = num1 % num2;

        //MUESTRA POR PANTALLA 

        System.out.println("La suma de los numneros es:  " + suma);

        System.out.println("La resta de los numneros es:  " + resta);

        System.out.println("La multiplicacion de los numneros es:  " + multiplicacion);

        System.out.println("La division de los numneros es:  " + division);

        System.out.println("El modulo de la division es:  " + modulo);

        scanner.close();
    }
    
}
