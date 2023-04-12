package ChapterFourteen;

public class StringExample5 {
    public static void main(String[] args) {
        String[] strings = {"started", "starting", "ended", "ending"};

        for (String string : strings) {
            if (string.startsWith("st")) {
                System.out.printf("\"%s\" starts with st \n", string);
            }
        }
        System.out.println();
        for (String string : strings) {
            if (string.endsWith("ed")) {
                System.out.printf("\"%s\" ends with ed \n", string);
            }
        }
        System.out.println();
        String n = "Book";
        String result = n.substring(1, 4);
        System.out.println(result);
    }
}
