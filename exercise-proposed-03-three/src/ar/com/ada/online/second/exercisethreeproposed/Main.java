package ar.com.ada.online.second.exercisethreeproposed;

import java.time.Year;
import java.util.Scanner;

public class Main {
    /*Una empresa que contrata personal requiere determinar la edad de las personas que
    solicitan trabajo, pero cuando se les realiza la entrevista sólo se les pregunta el año en
    que nacieron. Realice el diagrama de flujo y pseudocódigo que representen el algoritmo
    para solucionar este problema */

    public static void main(String[] args) {
        System.out.println("Este programa calcula la edad de los empleados.");

        int birthday;
        int currentYear;
        int age;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el año de nacimiento del empleade: ");
        birthday = keyboard.nextInt();
        currentYear = Year.now().getValue();
        age = currentYear - birthday;

        System.out.println("La edad del empleade es: " + age);





    }
}
