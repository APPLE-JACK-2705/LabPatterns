package Command;

import java.util.Scanner;

public class MainCommand {
    public static void main(String[] args) {
        System.out.println("Введите ваше вычисление. Например: 5 * 3.");
        System.out.println("Сначало ваше число, затем оперция(+, -, *, /) и заново число.");
        Scanner scanner = new Scanner(System.in);
        float left = 0;
        float right = 0;
        String operation = "+";

        if (scanner.hasNextFloat()) {
            left = scanner.nextFloat();
            System.out.println("Первое число: " + left);
        } else {
            System.out.println("Неизвестное первое чсило: " + scanner.next());
        }
        if (scanner.hasNext()) {
            operation = scanner.next();
            System.out.println("Операция: " + operation);
        } else {
            System.out.println("Неизвестная операция: " + scanner.next());
        }
        if (scanner.hasNextFloat()) {
            right = scanner.nextFloat();
            System.out.println("Второе число: " + right);
        } else {
            System.out.println("Неизвестное второе число: " + scanner.next());
        }

        scanner.close();

        Calculator receiver = new Calculator();
        Invoker mathInvoker = new Invoker();

        System.out.print("Результат: ");
        mathInvoker.setCommand(receiver, left, right, operation);
    }
}
