package chapterFour;

public class Rider {


    public double sales(int numberOfParcel) {
        double bonus = 0;
        if (numberOfParcel >= 50 && numberOfParcel <= 59) {bonus = numberOfParcel * 200;}
        else {
            if (numberOfParcel >= 60 && numberOfParcel <= 69) {bonus = numberOfParcel * 250;}
            else {
                if (numberOfParcel >= 70) {bonus = numberOfParcel * 500;}
            }
        }
        return bonus;
    }

}
