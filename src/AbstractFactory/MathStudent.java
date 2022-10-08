package AbstractFactory;

public interface MathStudent {
    default String getMathStudent(String firstName, String lastName, String university, String facultet){
        return "Это студент университета " + university + ", факультета " + facultet + " " + firstName + " " + lastName;
    }
}
