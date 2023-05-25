package ChapterSeventeen.Lamdas;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreamSampleTest {
    @Test
    void testThatMapReturnsElementOfAListMultiplyingEachElementByTwo() {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        var actual = StreamSample.mapMethod(numbers);
        var expected = List.of(2, 4, 6, 8);
        assertEquals(actual, expected);
    }

}