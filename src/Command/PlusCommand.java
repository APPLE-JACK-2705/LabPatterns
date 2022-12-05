package Command;

public class PlusCommand extends Command{

    public PlusCommand(Calculator calculator, float left, float right) {
        super(calculator, left, right);
    }

//    @Override
//    public void undo() {
//        calculator.minus(left, right);
//    }

    @Override
    public boolean execute() {
        calculator.plus(left, right);
        return true;
    }
}
