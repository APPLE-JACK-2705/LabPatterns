package PracticeTask2.menu;

public abstract class Person {
    protected Menu menu;
    private String name;

    public Person(Menu menu, String name) {
        this.menu = menu;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void showDetails();
}
