package Proxy;

public class Main {
    public static void main(String[] args) {
        Spaceship firstSpaceship = new MillenuimFalconProxy(new Pilot("Han Solo"));
        firstSpaceship.fly();

        Spaceship secondSpaceship = new MillenuimFalconProxy(new Pilot("Yoda"));
        secondSpaceship.fly();
    }
}
