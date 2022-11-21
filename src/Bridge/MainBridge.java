package Bridge;

import java.util.Scanner;

public class MainBridge {
    public static void main(String[] args) {
        Person person;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вы преподаватель или студент?");
        String type = scanner.nextLine().toLowerCase();

        if (type.equals("преподаватель")){
            person = new Instructor(new HighLevelCourseMenu());
        }else {
            person = new Student(new LowLevelCourseMenu());
        }
        person.showDetails();
    }
}
