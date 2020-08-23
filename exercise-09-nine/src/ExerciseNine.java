//Se requiere determinar el sueldo semanal de un trabajador con base en las horas que
//trabaja y el pago por hora que recibe. Realice el diagrama de flujo y el pseudocódigo que
//representen el algoritmo de solución correspondiente.

import java.util.Scanner;

public class ExerciseNine {
    public static void main(String[] args) {
        double workedHours;
        double paymentHour;
        double weeklySalary;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese las horas totales trabajadas: ");
        workedHours = keyboard.nextDouble();
        System.out.print("Ingrese el pago por hora: $ ");
        paymentHour = keyboard.nextDouble();

        weeklySalary = workedHours * paymentHour;
        System.out.print("El sueldo semanal sera de: $ " + weeklySalary);

    }
}
