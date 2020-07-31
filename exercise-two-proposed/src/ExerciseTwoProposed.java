import java.util.Scanner;

public class ExerciseTwoProposed {

    //Una empresa importadora desea determinar cuántos dólares puede adquirir con equis
    //cantidad de dinero mexicano. Realice un diagrama de flujo y pseudocódigo que
    //representen el algoritmo para tal fin

    public static void main(String[] args) {

        System.out.println("Este programa convierte pesos mexicanos a dolares");

        double dollarAmount;
        double mexicanPesosAmount;
        final double DOLLAR_PRICE = 22.28;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de pesos mexicanos: ");

        mexicanPesosAmount = keyboard.nextDouble();
        dollarAmount = mexicanPesosAmount / DOLLAR_PRICE;

        System.out.println("Puede adquirir: " + String.format("%.2f", dollarAmount));







    }
}
