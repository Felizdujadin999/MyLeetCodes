package ChapterSixteen.Map;

import ChapterSixteen.Samples.Customer;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MapSampleIV {
    public static void main(String[] args) {
        List<Customer> list = new LinkedList<>();
        list.add(new Customer(1,"Sunny", 20_000_000.00));
        list.add(new Customer(10, "Madam Ugo", 500_000_000.00));
        list.add(new Customer(3, "Professor", 30_000_000_000.00));

        System.out.println("List before sorting::"+ list);

        Collections.sort(list);

        System.out.println("List after sorting::"+ list);
    }
}
