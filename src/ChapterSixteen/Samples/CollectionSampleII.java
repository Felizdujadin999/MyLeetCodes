package ChapterSixteen;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSampleII {
    public static void main(String[] args) {
        Set<Integer> nums = new TreeSet<>();//ascending order and arrangement
        nums.add(30);
        nums.add(31);
        nums.add(32);
        nums.add(33);
        nums.add(34);
        Set<Integer> num = new HashSet<>();//distorted order and doesn't have an arrangement
        num.add(30);
        num.add(31);
        num.add(32);
        num.add(33);
        num.add(34);
        Set<String> names = new TreeSet<>();// also compares using the UNICODE representation..
        names.add("Joshua");
        names.add("Felix");
        names.add("Spencer");
        names.add("Yinka");
        System.out.println(nums);
        System.out.println(num);
        System.out.println(names);
    }
}
