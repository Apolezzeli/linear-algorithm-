package ar.com.ada.online.second.exerciseproposedseven;

import java.util.Scanner;

public class Main {
    /* La compañía de autobuses “La curva loca” requiere determinar el costo que tendrá el
boleto de un viaje sencillo, esto basado en los kilómetros por recorrer y en el costo por
kilómetro. Realice un diagrama de flujo y pseudocódigo que representen el algoritmo
para tal fin. */

    public static void main(String[] args) {

        System.out.println("Este programa calcula el costo de los boletos");

        double kilometers;
        final double KILOMETER_PRICE = 24.85;
        double ticketCost;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de kilometros: ");
        kilometers = keyboard.nextDouble();

        ticketCost = KILOMETER_PRICE * kilometers;

        System.out.println("El costo del boleto es: " + ticketCost);

    }
}
