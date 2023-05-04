package ChapterSeventeen.FunctionalInterface;

import java.util.function.Supplier;

public class SupplierSample {
    public static void main(String[] args) {
        System.out.println(supplier.get());
    }
    static Supplier<Integer> supplier = () -> 20;
}
