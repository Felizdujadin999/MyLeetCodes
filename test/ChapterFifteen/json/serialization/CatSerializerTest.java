package ChapterFifteen.json.serialization;

import ChapterFifteen.json.Cat;
import ChapterFifteen.json.deserialization.CatDeserializer;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class CatSerializerTest {
    Cat cat;
    private final LocalDateTime dateOfBirth = LocalDateTime.now().minusYears(20);
    private DateTimeFormatter formatter;

    @BeforeEach
    public void setUp() {
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        cat = new Cat();
        cat.setAge(20);
        cat.setName("Tom");
        cat.setDateOfBirth(dateOfBirth);
    }
    @Test
    public void testConvertCatToJson(){
        String catJson = CatSerializer.convertToJson(cat);
        System.out.println(catJson);
        assertNotNull(catJson);
        assertEquals("{\"name\":\"Tom\",\"age\":20,\"dateOfBirth\":"+"\""+formatter.format(dateOfBirth)+"\""+"}", catJson);
    }

    @Test
    public void testDeserializeJsonToCat(){
        String catJson = "{\"name\":\"Tom\",\"age\":20,\"dateOfBirth\":"+"\""+formatter.format(dateOfBirth)+"\""+"}";
        Cat ologbo = CatDeserializer.deserializeJsonToCat(catJson);
        assertNotNull(ologbo);
        System.out.println(ologbo);
        assertEquals("Tom", ologbo.getName());
    }

    @Test
    public void testConvertCatToJsonObjectIgnoresNullValues(){
        cat.setName(null);
        String catJson = CatSerializer.convertToJson(cat);
        System.out.println(catJson);
        assertNotNull(catJson);
        assertEquals("{\"age\":20,\"dateOfBirth\":"+"\""+formatter.format(dateOfBirth)+"\""+"}", catJson);
    }
}