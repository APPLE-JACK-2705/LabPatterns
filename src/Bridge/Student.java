package Bridge;

public class Student extends Person{
    public Student(CourseMenu courseMenu) {
        super(courseMenu);
    }

    @Override
    void showDetails() {
        System.out.println("Вы вошли как студент!");
        courseMenu.showMenu();
    }
}
