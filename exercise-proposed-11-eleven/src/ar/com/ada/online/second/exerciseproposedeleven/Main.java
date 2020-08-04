package ar.com.ada.online.second.exerciseproposedeleven;
/* La compañía de luz y sombras (CLS) requiere determinar el pago que debe realizar una
persona por el consumo de energía eléctrica, la cual se mide en kilowatts (KW). Realice
un diagrama de flujo y pseudocódigo que representen el algoritmo que permita
determinar ese pago. */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Este programa determina el pago por consumo electrico");

        double killowattPrice;
        double totalPrice;
        double totalKillowatts;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el costo por Kilowat: $");
        killowattPrice = keyboard.nextDouble();

        System.out.print("Ingrese Kilowats consumidos: ");
        totalKillowatts = keyboard.nextDouble();

        totalPrice = totalKillowatts * killowattPrice;
        System.out.println("El importe a abonar es: $" + totalPrice);

    }
}
