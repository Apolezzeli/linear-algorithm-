//Realice el diagrama de flujo y pseudocódigo que representen el algoritmo para encontrar
// el área de un cuadrado.

import java.util.Scanner;

public class ExerciseProposedSixteen {
    public static void main(String[] args) {
        double sideOfSquare;
        double squareArea;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la medida del lado del cuadrado: ");
        sideOfSquare = keyboard.nextDouble();

        squareArea = sideOfSquare * sideOfSquare;
        System.out.println("El area del cuadrado es: " + squareArea);


    }
}
