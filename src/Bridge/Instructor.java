package Bridge;

public class Instructor extends Person{

    public Instructor(CourseMenu courseMenu) {
        super(courseMenu);
    }

    @Override
    void showDetails() {
        System.out.println("Вы вошли как преподаватель!");
        courseMenu.showMenu();
    }
}
