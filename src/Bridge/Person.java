package Bridge;

public abstract class Person {
    CourseMenu courseMenu;

    public Person(CourseMenu courseMenu) {
        this.courseMenu = courseMenu;
    }

    abstract void showDetails();
}
