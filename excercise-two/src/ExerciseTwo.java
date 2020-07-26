import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        System.out.println("Este programa es para calcular el promedio de calificaciones de un estudiante");

        int firstCalification;
        int secondCalification;
        int thridCalification;
        int fourthCalification;
        int result;
        int average;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la primer calificacion: ");
        firstCalification = keyboard.nextInt();

        System.out.print("Ingrese la segunda calificacion: ");
        secondCalification = keyboard.nextInt();

        System.out.print("Ingrese la tercer calificacion: ");
        thridCalification = keyboard.nextInt();

        System.out.print("Ingrese la cuarta calificacion: ");
        fourthCalification = keyboard.nextInt();

        result = firstCalification + secondCalification + thridCalification + fourthCalification;

        average = result/4;

        System.out.println("El promedio es:" + average);



    }
}
