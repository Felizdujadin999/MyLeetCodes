package ChapterFourteen;

public class StringExample3 {
    public static void main(String[] args) {
        char[] array = new char[5];
        String name = "Zainab";
        System.out.println(name.charAt(10));
        name.getChars(1, 5, array, 0);
        System.out.println(array);
    }
}
