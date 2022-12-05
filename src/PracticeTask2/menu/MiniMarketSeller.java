package PracticeTask2.menu;

public class MiniMarketSeller extends Person {

    public MiniMarketSeller(Menu menu, String name) {
        super(menu, name);
    }

    @Override
    public void showDetails() {
        System.out.println("Здравствуйте, " + getName());
        System.out.println("Вы вошли как продавец мини-маркета!");
        menu.showMenu();
    }
}
