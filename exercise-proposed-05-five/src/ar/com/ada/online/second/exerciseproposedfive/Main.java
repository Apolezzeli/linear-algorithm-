package ar.com.ada.online.second.exerciseproposedfive;

import java.util.Scanner;

public class Main {
    /* Pinturas “La brocha gorda” requiere determinar cuánto cobrar por trabajos de pintura.
Considere que se cobra por m2 y realice un diagrama de flujo y pseudocódigo que
representen el algoritmo que le permita ir generando presupuestos para cada cliente. */

    public static void main(String[] args) {
        System.out.println("Este programa calcula el cobro por trabajos de pintura");

        double meters;
        final double PRICE_PER_METER = 33;
        double finalPrice;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de metros a pintar: ");

        meters = keyboard.nextDouble();

        finalPrice = meters * PRICE_PER_METER;

        System.out.println("El precio final a abonar es: $" + finalPrice);


    }
}
