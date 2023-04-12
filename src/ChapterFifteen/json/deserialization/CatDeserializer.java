package ChapterFifteen.json.deserialization;

import ChapterFifteen.json.Cat;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class CatDeserializer {
    public static Cat deserializeJsonToCat(String json){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(json.getBytes(), Cat.class);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}
