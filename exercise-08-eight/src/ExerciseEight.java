//Se requiere obtener la distancia entre dos puntos en el plano cartesiano, tal y como se
//muestra en la figura 1.4. Realice un diagrama de flujo y pseudocódigo que representen el
//algoritmo para obtener la distancia entre esos puntos.

import java.util.Scanner;

public class ExerciseEight {
    public static void main(String[] args) {
        double abscissaA;
        double abscissaB;
        double ordinateA;
        double ordinateB;
        double abscissaLeg;
        double ordinateLeg;
        double pointsDistance;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el punto de la abscisa A: ");
        abscissaA = keyboard.nextDouble();
        System.out.print("Ingrese el punto de la abscisa B: ");
        abscissaB = keyboard.nextDouble();
        System.out.print("Ingrese el punto de la ordenada A: ");
        ordinateA = keyboard.nextDouble();
        System.out.print("Ingrese el punto de la ordenada B: ");
        ordinateB = keyboard.nextDouble();

        abscissaLeg = abscissaB - abscissaA;
        ordinateLeg = ordinateB - ordinateA;
        pointsDistance = Math.sqrt((abscissaLeg*abscissaLeg) + (ordinateLeg*ordinateLeg));

        System.out.println("La distancia entre puntos es: " + pointsDistance);



    }
}
