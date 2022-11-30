package Command;

public class DivCommand extends Command{

    public DivCommand(Calculator calculator, float left, float right) {
        super(calculator, left, right);
        if(right == 0) throw new ArithmeticException("Деление на ноль невозможно!");
    }

    @Override
    public void undo() {
        calculator.mult(left, right);
    }

    @Override
    public boolean execute() {
        calculator.div(left, right);
        return true;
    }
}
