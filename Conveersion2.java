import java.util.Scanner;

public class Conveersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Calcular el area usando la formula de area de un circulo
        System.out.println("Ingrese el radio del circulo:  ");
        double radio = scanner.nextDouble();
        double area = Math.PI * radio * radio;
        System.out.println("El area del circulo es: " + area);

        //Calcular el perimetro usando la formula de perimetro de un circulo
        System.out.println("Ingrese el radio del circulo:  ");
        radio = scanner.nextDouble();
        double perimetro = 2 * Math.PI * radio; 
        System.out.println("El perimetro del circulo es: " + perimetro);
        scanner.close();


    }
}
