package ChapterFourteen;

public class StringExamples {
    public static void main(String[] args) {
        byte[] bytes = {65,66,67};
        String string = new String(bytes);
        System.out.println(string);
    }
}
