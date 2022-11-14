package Bridge;

public class LowLevelCourseMenu implements CourseMenu{
    @Override
    public void showMenu() {
        System.out.println("Вы выбрали меню низкого уровня!");
    }
}
