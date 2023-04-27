package ChapterSixteen;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customerOne = new Customer(2, "Joshua", 500000);
        Customer customerTwo = new Customer(4, "Yinka", 400000);
        Customer customerThree = new Customer(1, "Spencer", 4500000);
        Customer customerFour = new Customer(3, "Felix", 145000000);

        Comparator<Customer> comparator = (c1,c2) ->{
            if (c1.getId()> c2.getId()) return 1;
            else if (c2.getId()> c1.getId()) return -1;
            return 0;
        };

        Set<Customer> customer = new TreeSet<>(comparator);

        customer.add(customerOne);
        customer.add(customerTwo);
        customer.add(customerThree);
        customer.add(customerFour);

        System.out.println(customer);
    }
}
