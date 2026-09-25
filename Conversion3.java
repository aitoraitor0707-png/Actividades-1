import java.util.*;
public class Conversion3 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //AREA DE CUADRADO
    double lado = scanner.nextDouble();
    double area = lado * lado;

    //MUESTRA POR PANTALLA

    System.out.println("--AREA DEL CUADRADO--");

    System.out.println("Introduzca la medida de el lado:");

    System.out.println("El area del cuadrado es: " + area);


    //----AREA DE TRIANGULO----
    //DECLARACION DE VARIABLES
    double base = scanner.nextDouble();

    double altura = scanner.nextDouble();

    double areatriangulo = base * altura /2;

    //MUESTRA POR PANTALLA

    System.out.println("--AREA DEL TRIANGULO--");

    System.out.println("Introduzca la base:");
    
    System.out.println("Introduzca la altura:");
    
    System.out.println("Calculando...");
    
    System.out.println("El area es :"+ areatriangulo);


    //----AREA DE TRAPECIO----
    //DECLARACION DE VARIABLES
    double baseM = scanner.nextDouble();

    double baseMN = scanner.nextDouble();

    double h = scanner.nextDouble();

    double areatrapecio = (baseM + baseMN) * h /2 ;
    

    //MUESTRA POR PANTALLA
    System.out.println("----AREA TRAPECIO---");

    System.out.println("Introduzca la base mayor:");

    System.out.println("Introduzca la base menor:");

    System.out.println("Introduzca la altura: ");

    System.out.println("Calculando....");

    System.out.println("El area es : " + areatrapecio);


    System.out.println("PROGRAMA TERMINADO");
    
    scanner.close();
    }
}
