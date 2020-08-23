//Diseñar el algoritmo correspondiente, que tras introducir una medida expresada en
// centímetros la convierta en pulgadas (1 pulgada = 2,54 centímetros).

import java.util.Scanner;

class ExerciseProposedEighteen {
     public static void main(String[] args) {
         double centimetersAmount;
         final double INCHES = 2.54;
         double totalInches;
         Scanner keyboard = new Scanner(System.in);

         System.out.print("Ingrese la cantidad de centimetros a convertir a pulgadas: ");
         centimetersAmount = keyboard.nextDouble();

         totalInches = centimetersAmount / INCHES;
         System.out.print("Son " + totalInches + " pulgadas");



     }
}
