package Projects;

import java.util.Scanner;

public class SevenSegmentDisplay{
    static int [][] view= new int[5][4];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter binary number: ");
        String binaryInput = scanner.nextLine();
        setDisplay(binaryInput);
        showDisplay();
    }
    public static void showDisplay(){
        for (int[] i: view) {
            for (int j: i) {
                if (j == 1){
                    System.out.print("# ");
                }else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void LineA(){
        view[0][0] = 1;
        view[0][1] = 1;
        view[0][2] = 1;
        view[0][3] = 1;
    }
    public static void LineB(){
        view[0][3] = 1;
        view[1][3] = 1;
        view[2][3] = 1;

    }
    public static void LineC(){
        view[2][3] = 1;
        view[3][3] = 1;
        view[4][3] = 1;
    }
    public static void LineD(){
        view[4][0] = 1;
        view[4][1] = 1;
        view[4][2] = 1;
        view[4][3] = 1;
    }
    public static void LineE(){
        view[2][0] = 1;
        view[3][0] = 1;
        view[4][0] = 1;
    }
    public static void LineF(){
        view[0][0] = 1;
        view[1][0] = 1;
        view[2][0] = 1;
    }
    public static void LineG(){
        view[2][1] = 1;
        view[2][2] = 1;
    }

    public static void setDisplay(String input){
        if (input.charAt(7) == '1'){
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1'){
                switch (i){
                    case 0 -> LineA();
                    case 1 -> LineB();
                    case 2 -> LineC();
                    case 3 -> LineD();
                    case 4 -> LineE();
                    case 5 -> LineF();
                    case 6 -> LineG();
                }
            }
           }
        }else
            System.out.println("Off!!!");
    }
}
