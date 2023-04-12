package ChapterFourteen;

public class StringExamples4 {
    public static void main(String[] args) {
        String first = new String("Semicolon");
        String second = new String("Semicolon");
        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Semicolon";
        String fourth = new String("Semicolon");
        System.out.println(third == fourth);
    }
}
