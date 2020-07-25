import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        //una vez declarada la psvm, se declaran las variables:
        System.out.println("Programa que realiza la suma de 2 numeros ingresados");

        int firstNumber;
        int secondNumber;
        int result;

        //Declaradas las variables, habilito el modo de ingreso de datos por el teclado:
        Scanner keyboard = new Scanner(System.in);

        // Leo los datos del usuario:
        System.out.print("Ingrese el primer numero para el calculo: ");
        firstNumber = keyboard.nextInt();

        System.out.print("Ingrese el segundo numero para el calculo: ");
        secondNumber = keyboard.nextInt();

        //Realizo el proceso de suma y lo guardo en la variable result:
        result = firstNumber + secondNumber;

        //Definimos la forma de salida por pantalla del resultado:
        System.out.println("El resultado es:" + result);




    }
}
