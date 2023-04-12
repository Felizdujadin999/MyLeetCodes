package ChapterFourteen;

public class StringExamples2 {
    public static void main(String[] args) {
        char[] chars = {65,66,67,68,69,70};//[A,B,C,D,E,F]
        String string = new String(chars, 1, 3);
        System.out.println(string);
    }
}
