package Practice.SerializationData;

import Practice.Shop;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JsonSerialize {
    private String jsonString;

    public void JsonSerialization(float rashod) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
            jsonString = objectMapper.writeValueAsString(rashod);

            File xmlOutput = new File("C://shopData.json");
            FileWriter fileWriter = new FileWriter(xmlOutput);
            fileWriter.write(jsonString);
            fileWriter.close();
        }catch (JsonProcessingException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
