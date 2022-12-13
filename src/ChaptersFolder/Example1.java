package ChaptersFolder;

public class Example1 {
    public static void main(String[] args) {
        printNumberAsAnInteger(56);
        printNumberAsAdecimal(56);
        printNumber(66.0);
        printNumberAsString("43");
    }

    private static void printNumberAsAnInteger(int number){
        System.out.println(number);
    }
    private static void printNumberAsAdecimal(double number){
        System.out.println(number);
    }
    private static void printNumber(double number){
        String[] s = String.valueOf(number).split("\\.");
        System.out.println(Integer.parseInt(s[0]));
    }
    private static void printNumberAsString(String number){
        System.out.println(Integer.parseInt(number));
    }
}
