// Un productor de leche lleva el registro de lo que produce en litros, pero cuando entrega
//le pagan en galones. Realice un algoritmo, y represéntelo mediante un diagrama de flujo y el
//pseudocódigo, que ayude al productor a saber cuánto recibirá por la entrega de su producción
//de un día (1 galón = 3.785 litros).

import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {
        double litersProduce;
        double gallonPrice;
        double gallonProduce;
        double profits;
        final double GALLON = 3.785;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de litros de leche que produce: ");
        litersProduce = keyboard.nextDouble();
        System.out.print("Ingrese el precio del galon de leche: ");
        gallonPrice = keyboard.nextDouble();

        gallonProduce = litersProduce / GALLON;
        profits = gallonProduce * gallonPrice;

        System.out.print("Las ganancias son de: $" + profits);

    }
}
