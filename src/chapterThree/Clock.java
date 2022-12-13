//Create a class called Clock that includes three instance variables—an hour
//(type int), a minute (type int) and a second (type int).
//Provide a constructor that initializes the
//three instance variables and assumes that the values provided are correct.
// Provide a set and a get
//method for each instance variable. The set method should set the value of all three variables to 0 if
//the value of hour is more than 23, the value of minute is more than 59, and the value of second is
//more than 59. Provide a method displayTime that display the time in an “hh:mm:ss” format. Write
//a test app named ClockTest that demonstrates class Clock’s capabilities.
package chapterThree;

public class Clock {

    private int hour;
    private int minute;
    private int second;

    public Clock(){}

    public Clock(int hour, int minute, int second){
        if (hour >= 0 && hour <= 23) {this.hour = hour;}
        else {this.hour = 0;}
       // this.hour =hour;
        if (minute >= 1 && minute <= 59){this.minute=minute;}
        else {this.hour += 1;}
        //this.minute=minute;
        if (second >= 1 && second <= 59) {this.second = second;}
        else {minute += 1;}
        //this.second=second;
    }

    public int getHour() {
        return hour  ;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {this.hour = hour;}
        else {hour = 0;}
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute  == 60){this.minute =0;}
        if (minute >= 1 && minute <= 59){this.minute=minute;}
        else {this.hour += 1;}
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 1 && second <= 59) {
            this.second = second;
        } else {minute += 1;}
    }
    public void displayTime(){
        System.out.println(getHour()+ ":" + getMinute() + ":" + getSecond());
    }
}
