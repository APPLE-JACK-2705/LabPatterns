package PracticeTask2.calculate;

import java.util.List;

public class SumCommand extends Command{

    public SumCommand(Calculator calculator, List<Double> list) {
        super(calculator, list);
    }

    @Override
    public boolean execute() {
        System.out.println(calculator.costSum(list));
        return true;
    }
}
