//Una empresa desea determinar el monto de un cheque que debe proporcionar a uno de sus
// empleados que tendrá que ir por equis número de días a la ciudad de Monterrey; los gastos
// que cubre la empresa son: hotel, comida y 100.00 pesos diarios para otros gastos. El monto
// debe estar desglosado para cada concepto. Realice un diagrama de flujo y pseudocódigo que
// representen el algoritmo que determine el monto del cheque.

import java.util.Scanner;

public class ExerciseProposedFourteen {
    public static void main(String[] args) {
        int journeyDays;
        double totalFoodExpenses;
        double totalHotelExpenses;
        int totalDiariesExpenses;
        double foodBudget;
        double hotelBudget;
        final int DAILY_EXPENSES_BUDGET = 100;
        double payCheq;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de dias que durará el viaje: ");
        journeyDays = keyboard.nextInt();
        System.out.print("Ingrese el presupuesto diario de gastos de comida: ");
        foodBudget = keyboard.nextDouble();
        System.out.print("Ingrese el presupuesto diario de gastos de hotel: ");
        hotelBudget = keyboard.nextDouble();

        totalFoodExpenses = journeyDays * foodBudget;
        totalDiariesExpenses = journeyDays * DAILY_EXPENSES_BUDGET;
        totalHotelExpenses = journeyDays * hotelBudget;
        System.out.println("Los gastos totales de comida seran: $" + totalFoodExpenses);
        System.out.println("Los gastos totales de hotel seran: $" + totalHotelExpenses);
        System.out.println("Los gastos diarios totales seran: $" + totalDiariesExpenses);

        payCheq = totalDiariesExpenses + totalFoodExpenses + totalHotelExpenses;
        System.out.println("El importe del cheque para solventar el viaje debe ser de: $" + payCheq);


    }
}
