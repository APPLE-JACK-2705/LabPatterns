package Bridge;

import java.util.Locale;
import java.util.Scanner;

public class MainBridge {
    public static void main(String[] args) {
        Person person;
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Вы преподаватель или студент?");
            String type = scanner.nextLine().toLowerCase();
            System.out.println("Введите 1, если у вас высокий уровень или введите 0, если у вас низкий уровень: ");
            int number = scanner.nextInt();
            if(type.equals("преподаватель") && number == 1){
                person = new Instructor(new HighLevelCourseMenu(), "преподаватель");
                person.showDetails();
            }
            if(type.equals("преподаватель") && number == 0){
                person = new Instructor(new LowLevelCourseMenu(), "преподаватель");
                person.showDetails();
            }
            if(type.equals("студент") && number == 1){
                person = new Instructor(new HighLevelCourseMenu(), "студент");
                person.showDetails();
            }
            if(type.equals("студент") && number == 0){
                person = new Instructor(new LowLevelCourseMenu(), "студент");
                person.showDetails();
            }
            break;
        }
    }
}
