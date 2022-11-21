package Bridge;

public class Student extends Person{
    public Student(CourseMenu courseMenu, String type) {
        super(courseMenu, type);
    }

    @Override
    void showDetails() {
        System.out.println("Вы вошли как " + getPersonType() + "!");
    }
}
