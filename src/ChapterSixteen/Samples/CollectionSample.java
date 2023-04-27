package ChapterSixteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSample {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(22);
        nums.add(33);
        nums.add(44);
        List<Integer> syncList = Collections.synchronizedList(nums);
        syncList.remove(nums.get(0));
        System.out.println(syncList);
    }
}