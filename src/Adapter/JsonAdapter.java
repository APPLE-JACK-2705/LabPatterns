package Adapter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;

public class JsonAdapter implements ISerialize{
    XmlSerialize xmlSerialize = new XmlSerialize();

    public void XMLSerialiazation(Student student) throws IOException {
        String xml = xmlSerialize.XmlSerialization(student);


        XmlMapper xmlMapper = new XmlMapper();
        student = xmlMapper.readValue(xml, Student.class);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.writeValue(System.out, student);
    }
}
