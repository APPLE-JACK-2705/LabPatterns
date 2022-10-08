package AbstractFactory;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Polytech", "Math", "Adil", "Adilkhanov"));
        studentList.add(new Student("Polytech", "Computer Science", "Kobe", "Bryant"));
        studentList.add(new Student("Polytech", "Computer science", "Lebron", "James"));
        studentList.add(new Student("KazNU", "Math", "Michael", "Jordan"));
        studentList.add(new Student("KazNU", "Math", "Kevin", "Durant"));
        studentList.add(new Student("KazNU", "Computer Science", "Cristiano", "Ronaldo"));

        IStudentFactory studentFactory;
        for (Student s : studentList){
            if(s.getUniversity().equals("Polytech")){
                studentFactory = new PolytechStudentFactory();
            }else if (s.getUniversity().equals("KazNU")){
                studentFactory = new KazNUStudentFactory();
            }else {
                throw new IOException("Не существующий университет!");
            }

            CompSciStudent compSciStudent = studentFactory.createComSciStudent();
//            MathStudent mathStudent = studentFactory.createMathStudent();

            System.out.println(compSciStudent.getCompSciStudent(s.getFirstName(), s.getLastName(), s.getUniversity(), s.getFacultet()));
//            System.out.println(mathStudent.getMathStudent(s.getFirstName(), s.getLastName(), s.getUniversity(), s.getFacultet()));
        }
    }
}

