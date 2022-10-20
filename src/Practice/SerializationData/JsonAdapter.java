package Practice.SerializationData;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;

public class JsonAdapter implements ISerialize{
    private JsonSerialize jsonSerialize = null;
    private String xmlString;
    private static JsonAdapter _instance;

    private JsonAdapter(JsonSerialize jsonSerialize) {
        this.jsonSerialize = jsonSerialize;
    }

    public static JsonAdapter getInstance(JsonSerialize jsonSerialize){
        if(_instance == null){
            _instance = new JsonAdapter(jsonSerialize);
        }
        return _instance;
    }

    @Override
    public void JsonSerialization(float rashod) {
        jsonSerialize.JsonSerialization(rashod);
    }

    public void XmlSerialization(float rashod){
        try {
            XmlMapper xmlMapper = new XmlMapper();
            xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
            xmlString = xmlMapper.writeValueAsString(rashod);

            File file = new File("C://shopData.xml");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(xmlString);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
