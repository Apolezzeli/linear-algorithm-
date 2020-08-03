package ar.com.ada.online.second.exerciseproposednine;

import java.util.Scanner;

public class Main {
    /* Se requiere determinar el costo que tendrá realizar una llamada telefónica con base en
el tiempo que dura la llamada y en el costo por minuto. Realice un diagrama de flujo y
pseudocódigo que representen el algoritmo para tal fin. */


    public static void main(String[] args) {

        System.out.println("Este programa calcula el costo de una llamada telefonica");

        double callDuration;
        double costPerMinute;
        double callCost;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la duracion de la llamada en minutos: ");
        callDuration = keyboard.nextDouble();

        System.out.print("Ingrese el costo por minuto de la llamada: ");
        costPerMinute = keyboard.nextDouble();

        callCost = (callDuration * costPerMinute);
        System.out.println("El costo de la llamada sera: " + callCost);




    }
}
