package chapterThree;

import java.time.LocalDate;

public class Heartrate {

    private String FirstName;
    private String LastName;
    private int DayOfBirth;
    private int MonthOfBirth;
    private int YearOfBirth;

    public Heartrate(String firstName, String lastName, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
        FirstName = firstName;
        LastName = lastName;
        DayOfBirth = dayOfBirth;
        MonthOfBirth = monthOfBirth;
        YearOfBirth = yearOfBirth;


    }
    public String getFirstName(){
        return getFirstName();
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getLastName() {
         return LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public int getDayOfBirth() {
        return DayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.DayOfBirth = dayOfBirth;
    }

    public int getMonthOfBirth() {
        return MonthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.MonthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return YearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        YearOfBirth = yearOfBirth;
    }

    public int calculateAgeInYears(){
        LocalDate currentDate= LocalDate.now();
        int currentYear=currentDate.getYear();
        int ageInYears = currentYear - YearOfBirth;
        return ageInYears;
    }
    public int maximumHeartRate(int age){
        return 220 - age;
    }

    public String targetHeartRate(int MHR){
        double max = MHR * 0.5;
        double min = MHR * 0.85;
        String HTR = min + " - " + max;
        return HTR;
    }
}