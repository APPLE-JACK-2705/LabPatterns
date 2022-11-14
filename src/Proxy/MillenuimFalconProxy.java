package Proxy;

public class MillenuimFalconProxy implements Spaceship{
    private Pilot pilot;
    private Spaceship falcon;

    public MillenuimFalconProxy(Pilot pilot) {
        this.pilot = pilot;
        this.falcon = new MilleniumFalcon();
    }

    @Override
    public void fly() {
        if (pilot.getName().equals("Han Solo")) {
            falcon.fly();
        } else {
            System.out.printf("Sorry %s, only Han Solo can fly the Falcon!\n", pilot.getName());
        }
    }
}
