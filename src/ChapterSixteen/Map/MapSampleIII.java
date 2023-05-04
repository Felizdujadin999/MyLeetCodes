package ChapterSixteen.Map;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MapSampleIII {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(50);
        list.add(20);
        list.add(10);
        list.add(40);
        list.add(30);
        System.out.println("List before sorting:"+ list);
        Collections.sort(list);
        System.out.println("List after sorting:"+ list);
        Collections.shuffle(list);
        System.out.println("List after shuffling:"+ list);
        System.out.println("Maximum element: "+ Collections.max(list));
        System.out.println("Maximum element: "+ Collections.min(list));
    }
}
