package Bridge;

public abstract class Person {
    CourseMenu courseMenu;

    private String personType;

    public Person(CourseMenu courseMenu, String type) {
        this.courseMenu = courseMenu;
        this.personType = type;
    }

    public String getPersonType() {
        return personType;
    }

    abstract void showDetails();
}
