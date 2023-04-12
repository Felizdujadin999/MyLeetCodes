package LeetCodes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MonthConverter {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date to be converted:: ");
        String input = scanner.nextLine();
        monthConverter(input);
    }
    public static void monthConverter(String fullDate) throws ParseException {
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd MMM',' yyyy");
        Date date = inputFormat.parse(fullDate);
        String outputDate = outputFormat.format(date);
        System.out.println(outputDate);
        }
}