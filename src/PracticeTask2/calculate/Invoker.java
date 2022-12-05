package PracticeTask2.calculate;

import java.util.List;

public class Invoker {
    private Command command;

    public void setCommand(Calculator receiver, List<Double> list, String operation){
        command = chooseCommand(receiver, list, operation);
        command.execute();
    }

    public Command chooseCommand(Calculator receiver, List<Double> list, String operation){
        switch (operation){
            case "сумму":
                return new SumCommand(receiver, list);
            case "среднее значение":
                return new AvgCommand(receiver, list);
            default:
                return null;
        }
    }
}
