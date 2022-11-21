package Bridge;

import java.util.Arrays;

public class HighLevelCourseMenu implements CourseMenu{

    private String[] subjects = new String[] {"Высшая математика, Латинский казахский язык, Моделирование"};

    @Override
    public void showMenu() {
        System.out.println("---------------");
        System.out.println("Я меню высокого уровня!");
        System.out.println("Предметы высокого уровня: " + Arrays.toString(subjects));
        System.out.println("---------------");
    }
}
