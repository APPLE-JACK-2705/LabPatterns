package Command;

public class MultCommand extends Command{

    public MultCommand(Calculator calculator, float left, float right) {
        super(calculator, left, right);
    }

//    @Override
//    public void undo() {
//        calculator.div(left, right);
//    }

    @Override
    public boolean execute() {
        calculator.mult(left, right);
        return true;
    }
}
