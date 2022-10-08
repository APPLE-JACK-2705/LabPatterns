package AbstractFactory;

public class PolytechStudentFactory implements IStudentFactory{
    @Override
    public CompSciStudent createComSciStudent() {
        return new CompSiPolytechStudent();
    }

    @Override
    public MathStudent createMathStudent() {
        return new MathPolytechStudent();
    }
}
