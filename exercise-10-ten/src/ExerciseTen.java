//Una modista, para realizar sus prendas de vestir, encarga las telas al extranjero. Para
//cada pedido, tiene que proporcionar las medidas de la tela en pulgadas, pero ella generalmente
//las tiene en metros. Realice un algoritmo para ayudar a resolver el problema, determinando
//cuantas pulgadas debe pedir con base en los metros que requiere. Represéntelo mediante el
//diagrama de flujo y el pseudocódigo (1 pulgada = 0.0254 m).

import java.util.Scanner;

public class ExerciseTen {
    public static void main(String[] args) {
        double fabricMeters;
        final double INCH = 0.0254;
        double fabricInches;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de metros de tela que desea comprar: ");
        fabricMeters = keyboard.nextDouble();

        fabricInches = fabricMeters / INCH;
        System.out.print("El equivalente en pulgadas que debe encargar es de: " + fabricInches);





    }
}
