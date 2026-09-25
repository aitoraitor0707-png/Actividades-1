import java.util.*;
public class Conversion {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    

    //Convertir de celsius a Fahrenheit
    System.out.println("Ingrese la temperatura en grados Celsius :  ");
    double celsius = scanner.nextDouble();
    try {
        
    } catch (Exception stringException) {
        // TODO: handle exception
    }
    double Fahrenheit = (celsius * 9/5) + 32;
    System.out.println("La temperatura en Fahrenheit es: " + Fahrenheit);

    //Converitr de Fahrenheit a Celsisus
    System.out.println("Ingrese la temperatura en Fahernheit:  ");
    Fahrenheit = scanner.nextDouble();
    celsius = (Fahrenheit -32) * 5/9;
    System.out.println("La temperatura en Celsius es:  " + celsius);
    
        }    
}
