package ChapterSeventeen.Stream;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {
    @Test
    void testSortMapEntries(){
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("AB", 2);

        Map<String, Integer> result = Example.sortMapEntries(map);
        assertNotNull(result);
        System.out.println(result);
            
    }

}