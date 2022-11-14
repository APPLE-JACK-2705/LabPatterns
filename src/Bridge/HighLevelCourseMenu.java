package Bridge;

public class HighLevelCourseMenu implements CourseMenu{

    @Override
    public void showMenu() {
        System.out.println("Вы выбрали меню высокого уровня!");
    }
}
