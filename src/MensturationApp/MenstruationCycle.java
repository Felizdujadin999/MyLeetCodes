package MensturationApp;

import ArrayList.ArrayLists;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class MenstruationCycle {
    private LocalDate menstrualCycleDate;
    private LocalDate nextMenstrualDate;
    private LocalDate[] ovulationDates;
    private LocalDate[] safePeriodDates;

    public static void main(String[] args) {
        LocalDate todayDate = LocalDate.now();
        LocalDate futureDate = todayDate.plusDays(38);
        menstrualCyclePeriods("24/04/2023", 28, 5);
    }

    public static LocalDate menstrualCyclePeriods(String date, int cycleDays, int daysFlow){
        LocalDate currentMenstrualDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate nextMenstrualDate = currentMenstrualDate.plusDays(cycleDays);
        LocalDate[] ovulationDays = new LocalDate[5];
        int count = 2;
        int peakDay = cycleDays/2;

        for (int i = 0; i < 5; i++) {
            LocalDate ovulationDay = currentMenstrualDate.plusDays(peakDay-count);
            ovulationDays[i] = ovulationDay;
        }

        ArrayList<LocalDate> safePeriods = new ArrayList<>();
        LocalDate firstOvulationDate = currentMenstrualDate.plusDays(daysFlow);
        int lastSafePeriod = peakDay-2;
        System.out.println("last ovulation is "+ lastSafePeriod);

        int safeDayCount=0;
        for (int i = daysFlow; i < lastSafePeriod; i++) {
            safePeriods.add(firstOvulationDate.plusDays(safeDayCount));
            safeDayCount++;
        }

        ArrayList<LocalDate> lastSafePeriods = new ArrayList<>();
        int lastSafeDays = peakDay+2;
        LocalDate lastSafePeriodDate = currentMenstrualDate.plusDays(lastSafeDays);
        int counter = 0;

        for (int i = lastSafeDays; i < cycleDays; i++) {
            lastSafePeriods.add(lastSafePeriodDate.plusDays(counter));
            counter++;
        }

        System.out.println("next menstrual date is "+ nextMenstrualDate);
        System.out.println(firstOvulationDate);
        System.out.println(Arrays.toString(ovulationDays));
        System.out.println(safePeriods);
        System.out.println(lastSafePeriods);
        return nextMenstrualDate;
    }
}
