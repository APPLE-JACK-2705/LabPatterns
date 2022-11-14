package Bridge;

public class Instructor extends Person{

    public Instructor(CourseMenu courseMenu, String type) {
        super(courseMenu, type);
    }

    @Override
    void showDetails() {
        System.out.println("Вы вошли как " + getPersonType() + "!");
        courseMenu.showMenu();
    }
}
