package PracticeTask2.menu;

public class SimpleSeller extends Person {

    public SimpleSeller(Menu menu, String name) {
        super(menu, name);
    }

    @Override
    public void showDetails() {
        System.out.println("Здравствуйте, " + getName());
        System.out.println("\nВы вошли как обычный продавец!");
        menu.showMenu();
    }
}
