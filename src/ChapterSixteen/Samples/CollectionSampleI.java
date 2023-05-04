package ChapterSixteen.Samples;

import java.util.HashSet;
import java.util.Set;

public class CollectionSampleI {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Felix(AKA Father figure)");
        names.add("James(AKA King James)");
        names.add("Josh(AKA Family Man)");
        names.add("Balablu(AKA president-select)");

        System.out.println(names);

        System.out.println(names.toArray()[names.toArray().length-2]);

    }
}
