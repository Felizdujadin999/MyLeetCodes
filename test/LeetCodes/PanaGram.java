package LeetCodes;

import java.util.Scanner;

public class PanaGram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your panagram:: ");
        String str = scanner.nextLine().toLowerCase();
        boolean[] mark = new boolean[26];
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
                mark[index] = true;
            }
        }

        boolean panagram = true;
        for (int i = 0; i <= 25; i++) {
            if (!mark[i]) {
                panagram = false;
                break;
            }
        }

        if (panagram) {
            System.out.println("This is a panagram.");
        } else {
            System.out.println("no this isn't a panagram");
        }
    }
//        public static void main(String[] args) {
//            String sentence = "The five boxing wizards jump quickly";
//            boolean isPangram = checkIfPangram(sentence);
//            System.out.println(isPangram);
//        }
//
//        public static boolean checkIfPangram(String sentence) {
//            sentence = sentence.replaceAll("\\s+", "").toLowerCase();
//            boolean[] letters = new boolean[26];
//
//            for (int i = 0; i < sentence.length(); i++) {
//                char c = sentence.charAt(i);
//                if (Character.isLetter(c)) {
//                    int index = c - 'a';
//                    letters[index] = true;
//                }
//            }
//            for (boolean letter : letters) {
//                if (!letter) {
//                    return false;
//                }
//            }
//            return true;
//        }
}
