package PracticeTask2.calculate;

import java.util.List;

public class AvgCommand extends Command{

    public AvgCommand(Calculator calculator, List<Double> list) {
        super(calculator, list);
    }

    @Override
    public boolean execute() {
        System.out.println(calculator.costAvg(list));
        return true;
    }
}
