package PracticeTask2.menu;


import java.util.Arrays;

public class SimpleMenu implements Menu{
    private String[] costs = new String[] {
            "Аренда помещения",
            "Зарплата сотрудника",
            "Закупка товаров",
            "Коммуналка"
    };

    @Override
    public void showMenu() {
        System.out.println("<---------------->");
        System.out.println("Меню обычного продавца!");
        System.out.println("Вот такие расходы вы должны заплатить: " + Arrays.toString(costs));
        System.out.println("<---------------->");
    }
}
