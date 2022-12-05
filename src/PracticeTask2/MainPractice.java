package PracticeTask2;

import PracticeTask2.calculate.Calculator;
import PracticeTask2.calculate.Invoker;
import PracticeTask2.menu.*;
import PracticeTask2.state.Activity;
import PracticeTask2.state.Salesman;
import PracticeTask2.state.Work;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Double> firstCoastList = new ArrayList<>(4);
        firstCoastList.add(9000.00);
        firstCoastList.add(4000.00);
        firstCoastList.add(5500.00);
        firstCoastList.add(7600.00);
        List<Double> secondCoastList = new ArrayList<>(5);
        secondCoastList.add(10000.00);
        secondCoastList.add(8000.00);
        secondCoastList.add(6500.00);
        secondCoastList.add(3000.00);
        secondCoastList.add(1000.00);

        System.out.println("Как вас зовут?");
        String personName = input.nextLine();
        System.out.println("Вы продавец мини-маркета или обычный продавец?");
        String typeOfPerson = input.nextLine().toLowerCase();
        System.out.println("Сегодня выходной или нет?");
        String day = input.nextLine().toLowerCase();

        Person person;
        Salesman human = new Salesman();
        human.setActivity(new Work());
        while (true){
            if(day.equals("нет")){
                human.justDoIt();
                if(typeOfPerson.equals("продавец")){
                    person = new SimpleSeller(new SimpleMenu(), personName);
                    person.showDetails();
                    System.out.println("\nВы хотите расчитать сумму или среднее значение расходов?");
                    String operation = " ";
                    if (input.hasNext()){
                        operation = input.nextLine();
                        System.out.println("Ваша операция: " + operation);
                    } else {
                        System.out.println("Неизвестная операция: " + operation);
                    }
                    Calculator receiver = new Calculator();
                    Invoker invoker = new Invoker();
                    System.out.println("Результат: ");
                    invoker.setCommand(receiver, firstCoastList, operation);
                }
                if (typeOfPerson.equals("продавец мини-маркета")){
                    person = new MiniMarketSeller(new AdvancedMenu(), personName);
                    person.showDetails();
                    System.out.println("\nВы хотите расчитать сумму или среднее значение расходов?");
                    String operation = " ";
                    if (input.hasNext()){
                        operation = input.nextLine();
                        System.out.println("Ваша операция: " + operation);
                    } else {
                        System.out.println("Неизвестная оперция: " + operation);
                    }
                    Calculator receiver = new Calculator();
                    Invoker invoker = new Invoker();
                    System.out.println("Результат: ");
                    invoker.setCommand(receiver, firstCoastList, operation);
                }
                human.nextActivity();
            }
        }
    }
}
