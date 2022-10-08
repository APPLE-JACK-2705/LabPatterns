package AbstractFactory;

public interface CompSciStudent {
    default String getCompSciStudent(String firstName, String lastName, String university, String facultet){
        return "Это студент университета " + university + ", факультета " + facultet + " " + firstName + " " + lastName;
    }
}
