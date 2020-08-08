import java.util.Scanner;

public class ExerciseOneProposed {

    //Realice un diagrama de flujo y pseudocódigo que representen el algoritmo para obtener
    //el área de un triángulo

    public static void main(String[] args) {
        System.out.println("Este programa calcula el area de un triangulo");

        double base;
        double height;
        double area;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese valor de la base: ");
        base = keyboard.nextDouble();

        System.out.print("Ingrese valor de la altura: ");
        height = keyboard.nextDouble();

        area = (base * height) / 2;

        System.out.println("El area del triangulo es: "+ area);






            



    }
}
