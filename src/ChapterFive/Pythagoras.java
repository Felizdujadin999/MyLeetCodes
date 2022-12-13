package ChapterFive;

public class Pythagoras {
    public static void main(String[] args) {

            for (int side1=1; side1 <= 500; side1++) {
               a:for (int side2 =side1+1; side2 <= 500; side2++) {
                    for (int hypotenus=side2+1; hypotenus <= 500; hypotenus++) {
                    if ((hypotenus*hypotenus) == ((side2*side2) + (side1*side1))) {
                        System.out.printf("%d^2 + %d^2 = %d^2%n", side1, side2, hypotenus);
                            break a;
                    }
                }
            }
        }
    }
}
