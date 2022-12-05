package PracticeTask2.calculate;

import java.util.List;

public abstract class Command {
    protected Calculator calculator;
    protected List<Double> list;

    public Command(Calculator calculator, List<Double> list) {
        this.calculator = calculator;
        this.list = list;
    }

    public abstract boolean execute();
}
