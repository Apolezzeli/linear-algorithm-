package ar.com.ada.online.second.exerciseproposedfour;

import java.util.Scanner;

public class Main {
    /*Un estacionamiento requiere determinar el cobro que debe aplicar a las personas que lo
utilizan. Considere que el cobro es con base en las horas que lo disponen y que las
fracciones de hora se toman como completas y realice un diagrama de flujo y
pseudocódigo que representen el algoritmo que permita determinar el cobro. */

    public static void main(String[] args) {
        System.out.println("Este programa calcula el cobro de estacionamiento");

        double priceHour;
        double amountHours;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Indique el precio por hora del estacionamiento: $");
        priceHour = keyboard.nextDouble();

        System.out.print("Indique la cantidad de horas en el estacionamiento: ");
        amountHours = keyboard.nextDouble();

        double result = priceHour * amountHours;
        System.out.println("El precio a abonar es: $" + result);





    }
}
