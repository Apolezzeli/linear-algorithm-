//Realice un diagrama de flujo y pseudocódigo que representen el algoritmo para determinar cuánto
// dinero ahorra una persona en un año si considera que cada semana ahorra 15% de su sueldo
// (considere cuatro semanas por mes y que no cambia el sueldo).

import java.util.Scanner;

public class ExerciseProposedThirteen {
    public static void main(String[] args) {
        double weeklySalary;
        double weeklySavingsAmount;
        final double PERCENT_SAVING = 0.15;
        final int TIME = 48;
        double totalMoneySaved;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese su salario semanal: $");
        weeklySalary = keyboard.nextDouble();

        weeklySavingsAmount = weeklySalary * PERCENT_SAVING;
        System.out.println("El importe semanal a ahorrar será de: $" + weeklySavingsAmount);

        totalMoneySaved = weeklySavingsAmount * TIME;
        System.out.println("El dinero total ahorrado sera de: $" + totalMoneySaved);


    }
}
