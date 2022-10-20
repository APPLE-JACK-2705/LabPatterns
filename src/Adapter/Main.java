package Adapter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("Michael");
        student.setSecondName("Jackson");
        student.setCourse("Dance");

        ISerialize serialize = new JsonAdapter();
        try {
            serialize.XMLSerialiazation(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
