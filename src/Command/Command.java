package Command;

public abstract class Command {
    protected Calculator calculator;
    protected float left, right;

    public Command(Calculator calculator, float left, float right) {
        this.calculator = calculator;
        this.left = left;
        this.right = right;
    }

//    public abstract void undo();

    public abstract boolean execute();
}
