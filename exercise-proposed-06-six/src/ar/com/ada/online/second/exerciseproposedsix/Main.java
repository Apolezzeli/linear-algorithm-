package ar.com.ada.online.second.exerciseproposedsix;

import java.util.Scanner;

public class Main {
    /* Se requiere determinar la hipotenusa de un triángulo rectángulo. ¿Cómo sería el
diagrama de flujo y el pseudocódigo que representen el algoritmo para obtenerla?
Recuerde que por Pitágoras se tiene que: C2 = A2 + B2. */


    public static void main(String[] args) {
        System.out.println("Este programa calcula la hipotenusa de un triangulo rectangulo");

        double catetoA;
        double catetoB;
        double hipotenusa;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la medida del cateto A: ");
        catetoA = keyboard.nextDouble();

        System.out.print("Ingrese la medida del cateto B: ");
        catetoB = keyboard.nextDouble();

        hipotenusa = Math.sqrt((catetoA * catetoA) + (catetoB * catetoB));

        System.out.println("La hipotenusa es: " + hipotenusa);


    }
}
