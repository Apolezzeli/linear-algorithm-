//Realice el diagrama de flujo y pseudocódigo que representen el algoritmo para determinar
// el promedio que obtendrá un alumno considerando que realiza tres exámenes, de los cuales
// el primero y el segundo tienen una ponderación de 25%, mientras que el tercero de 50%.

import java.util.Scanner;

public class ExerciseProposedSeventeen {
    public static void main(String[] args) {
        double firstExamNote;
        double secondExamNote;
        double thirdExamNote;
        double firstExamPercentage;
        double secondExamPercentage;
        double thirdExamPercentage;
        double finalAverage;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la nota del primer examen: ");
        firstExamNote = keyboard.nextDouble();
        System.out.print("Ingrese la nota del segundo examen: ");
        secondExamNote = keyboard.nextDouble();
        System.out.print("Ingrese la nota del tercer examen: ");
        thirdExamNote = keyboard.nextDouble();

        firstExamPercentage = firstExamNote * 0.25;
        secondExamPercentage = secondExamNote * 0.25;
        thirdExamPercentage = thirdExamNote * 0.50;

        finalAverage = firstExamPercentage + secondExamPercentage + thirdExamPercentage;
        System.out.print("El promedio de calificacion es: " + finalAverage);

    }
}
