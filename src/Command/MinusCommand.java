package Command;

public class MinusCommand extends  Command{

    public MinusCommand(Calculator calculator, float left, float right) {
        super(calculator, left, right);
    }

    @Override
    public void undo() {
        calculator.plus(left, right);
    }

    @Override
    public boolean execute() {
        calculator.minus(left, right);
        return true;
    }
}
