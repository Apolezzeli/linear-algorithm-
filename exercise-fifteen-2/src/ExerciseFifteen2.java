import java.util.Scanner;

public class ExerciseFifteen2 {

    public static void main(String[] args) {

        System.out.println("Programa que calcula la potencia electrica de un circuito dado");

        double voltaje;
        double intensidad;
        double resistencia;
        double potencia;

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        System.out.print("Ingrese la Intensidad para el calculo: ");
        intensidad = keyboard.nextDouble();

        System.out.print("Ingrese la Resistencia para el calculo: ");
        resistencia = keyboard.nextDouble();

        voltaje = resistencia * intensidad;
        potencia = voltaje * intensidad;

        System.out.println("La potencia del circuito es:" + potencia);

    }
}
