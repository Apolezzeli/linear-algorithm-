//El hotel “Cama Arena” requiere determinar lo que le debe cobrar a un huésped por su estancia
// en una de sus habitaciones. Realice un diagrama de flujo y pseudocódigo que representen el
// algoritmo para determinar ese cobro.

import java.util.Scanner;

public class ExerciseProposedNineteen {
    public static void main(String[] args) {
        double roomCost;
        int lodgingDays;
        double lodgingCost;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el costo por dia de la habitacion: $");
        roomCost = keyboard.nextDouble();
        System.out.print("Ingrese la cantidad de dias que se hospedara: ");
        lodgingDays = keyboard.nextInt();

        lodgingCost = roomCost * lodgingDays;
        System.out.print("El costo de hospedaje será de: $" + lodgingCost);


    }
}
