import java.util.Scanner;

public class ExerciseFour {

    public static void main(String[] args) {

        System.out.println("Este programa calcula el area de una circunferencia");

        int radioCircunferencia;
        double pi;
        double result;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el radio de la circunferencia: ");

        radioCircunferencia = keyboard.nextInt();
        pi = 3.1416;
        result = pi * radioCircunferencia * radioCircunferencia;

        System.out.println("El area de la circunferencia es: " + result);


    }
}
