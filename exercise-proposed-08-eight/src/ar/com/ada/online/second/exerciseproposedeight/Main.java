package ar.com.ada.online.second.exerciseproposedeight;

import java.util.Scanner;

public class Main {

    /* Se requiere determinar el tiempo que tarda una persona en llegar de una ciudad a otra
en bicicleta, considerando que lleva una velocidad constante. Realice un diagrama de
flujo y pseudocódigo que representen el algoritmo para tal fin. */

    public static void main(String[] args) {

        System.out.println("Este programa determina el tiempo que tarda una persona en llegar de una ciudad a otra en bicicleta");

        double speed;
        double time;
        double kilometers;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la velocidad constante (km/hs) del ciclista: ");
        speed = keyboard.nextDouble();

        System.out.print("Ingrese la cantidad de kilometros recorridos: ");
        kilometers = keyboard.nextDouble();

        time = kilometers / speed;
        System.out.println("El tiempo que tardo el ciclista fue de: " + time);


    }
}
