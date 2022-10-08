package AbstractFactory;

public class Student {
    private String university;
    private String facultet;
    private String firstName;
    private String lastName;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUniversity() {
        return university;
    }

    public String getFacultet() {
        return facultet;
    }

    public Student(String university, String facultet, String firstName, String lastName) {
        this.university = university;
        this.facultet = facultet;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
