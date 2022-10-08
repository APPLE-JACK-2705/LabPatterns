package Composite;

public class Main {
    public static void main(String[] args) {
        Employee junior = new Junior();
        Employee junior1 = new Junior();
        Employee senior = new Senior();

        Employee junior2 = new Junior();
        Employee middle = new Middle();
        Employee middle1 = new Middle();
        Employee middle2 = new Middle();

        Composite composite = new Composite();
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        composite1.addComponent(junior);
        composite1.addComponent(junior1);
        composite1.addComponent(senior);

        composite2.addComponent(junior2);
        composite2.addComponent(middle);
        composite2.addComponent(middle1);
        composite2.addComponent(middle2);

        composite.addComponent(composite1);
        composite.addComponent(composite2);

        composite.showEmployee();
    }
}
