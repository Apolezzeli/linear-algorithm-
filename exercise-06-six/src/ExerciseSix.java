//Se requiere obtener el área de la figura 1.3 de la forma A. Para resolver este problema se
//puede partir de que está formada por tres figuras: dos triángulos rectángulos, con H como
//hipotenusa y R como uno de los catetos, que también es el radio de la otra figura, una
//semicircunferencia que forma la parte circular (ver forma B). Realice un algoritmo para resolver
//el problema y represéntelo mediante el diagrama de flujo y el pseudocódigo

import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {
        double rightTriangleBase;
        double rightTriangleHypotenuse;
        double missingLeg;
        double triangleArea;
        double circleArea;
        final double PI =  3.1416;
        double figureArea;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la base del triangulo rectangulo: ");
        rightTriangleBase = keyboard.nextDouble();
        System.out.print("Ingrese la hipotenusa del triangulo rectangulo: ");
        rightTriangleHypotenuse = keyboard.nextDouble();

        missingLeg = Math.sqrt((rightTriangleHypotenuse * rightTriangleHypotenuse) - (rightTriangleBase * rightTriangleBase));
        triangleArea = 2 * (rightTriangleBase * missingLeg) / 2;
        circleArea = (PI * rightTriangleBase * rightTriangleBase) / 2;
        figureArea = triangleArea + circleArea;

        System.out.print("El area de la figura es: " + figureArea);

    }
}
