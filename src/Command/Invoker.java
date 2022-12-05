package Command;

public class Invoker {
    private Command command;
    //private CommandHistory history = new CommandHistory();

    public void setCommand(Calculator receiver, float left, float right, String operation){
        command = chooseCommand(receiver, left, right, operation);
        command.execute();
    }

    private Command chooseCommand(Calculator receiver, float left, float right, String operation){
        switch (operation){
            case "/":
                return new DivCommand(receiver, left, right);

            case "*":
                return new MultCommand(receiver, left, right);

            case "-":
                return new MinusCommand(receiver, left, right);

            case "+":
                return new PlusCommand(receiver, left, right);

            default:
                return null;
        }
    }
}
