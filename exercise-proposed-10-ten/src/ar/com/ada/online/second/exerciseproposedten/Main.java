package ar.com.ada.online.second.exerciseproposedten;

import java.util.Scanner;

public class Main {
    /* La CONAGUA requiere determinar el pago que debe realizar una persona por el total de
metros cúbicos que consume de agua. Realice un diagrama de flujo y pseudocódigo que
representen el algoritmo que permita determinar ese pago. */

    public static void main(String[] args) {

        System.out.println("Este programa determina el pago por consumo de agua");

        double meterPrice;
        double metersConsumed;
        double payment;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de mts cubicos consumidos: ");
        metersConsumed = keyboard.nextDouble();

        System.out.print("Ingrese el costo por mts cubico: $");
        meterPrice = keyboard.nextDouble();

        payment = meterPrice * metersConsumed;
        System.out.println("El importe a pagar es: $" + payment);



    }
}
