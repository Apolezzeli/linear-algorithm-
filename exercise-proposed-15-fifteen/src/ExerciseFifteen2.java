import java.util.Scanner;

// Se desea calcular la potencia eléctrica de circuito de la figura 1.6. Realice un diagrama
//de flujo y el pseudocódigo que representen el algoritmo para resolver el problema.
//Considere que: P = V*I y V = R*I.

public class ExerciseFifteen2 {

    public static void main(String[] args) {

        System.out.println("Programa que calcula la potencia electrica de un circuito dado");

        double voltage;
        double intensity;
        double resistance;
        double power;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la Intensidad para el calculo: ");
        intensity = keyboard.nextDouble();

        System.out.print("Ingrese la Resistencia para el calculo: ");
        resistance = keyboard.nextDouble();

        voltage = resistance * intensity;
        power = voltage * intensity;

        System.out.println("La potencia del circuito es:" + power);

    }
}
