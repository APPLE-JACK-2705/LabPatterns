package AbstractFactory;

public class KazNUStudentFactory implements IStudentFactory {
    @Override
    public CompSciStudent createComSciStudent() {
        return new ComSiKazNUStudent();
    }

    @Override
    public MathStudent createMathStudent() {
        return new MathKazNUStudent();
    }
}
