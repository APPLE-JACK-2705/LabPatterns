package Bridge;

import java.util.Arrays;

public class LowLevelCourseMenu implements CourseMenu{

    private String[] subjects = new String[] {"Алгебра, Рисование, История"};

    @Override
    public void showMenu() {
        System.out.println("---------------");
        System.out.println("Я меню низкого уровня!");
        System.out.println("Меню низкого уровня: " + Arrays.toString(subjects));
        System.out.println("---------------\n");
    }
}
