import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {

        System.out.println("Este programa calcula el area de un rectangulo");

        int alturaRectangulo;
        int baseRectangulo;
        int result;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la altura del rectangulo: ");
        alturaRectangulo = keyboard.nextInt();

        System.out.print("Ingrese la base del rectangulo: ");
        baseRectangulo = keyboard.nextInt();

        result = baseRectangulo * alturaRectangulo;

        System.out.println("El area del rectangulo es: " + result);

    }

}
