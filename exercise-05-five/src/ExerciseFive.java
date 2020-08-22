//Una empresa constructora vende terrenos con la forma A de la figura 1.2. Realice un
//algoritmo y represéntelo mediante un diagrama de flujo y el pseudocódigo para obtener el área
//respectiva de un terreno de medidas de cualquier valor

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {

        double sideA;
        double sideB;
        double sideC;
        double triangleArea;
        double rectangleArea;
        double figureArea;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la medida del lado A: ");
        sideA = keyboard.nextDouble();
        System.out.print("Ingrese la medida del lado B: ");
        sideB = keyboard.nextDouble();
        System.out.print("Ingrese la medida del lado C: ");
        sideC = keyboard.nextDouble();

        triangleArea = (sideB * (sideA - sideC)) / 2;
        rectangleArea = sideB * sideC;
        figureArea = triangleArea + rectangleArea;

        System.out.println("El area de la figura es: " + figureArea);



    }
}
