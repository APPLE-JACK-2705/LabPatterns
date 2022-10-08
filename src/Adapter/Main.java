package Adapter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Student student = new Student();
        student.setFirstName("Michael");
        student.setSecondName("Jackson");
        student.setCourse("Dance");

        ISerialize serialize = new JsonAdapter();
        serialize.XMLSerialiazation(student);
    }
}
