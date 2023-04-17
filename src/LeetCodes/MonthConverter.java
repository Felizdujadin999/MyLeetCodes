package LeetCodes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class MonthConverter {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date to be converted:: ");
        String input = scanner.nextLine();
        monthConverter(input);
        System.out.println(convert(input));
        System.out.println(convert2(input));

    }

    public static void monthConverter(String fullDate) throws ParseException {
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("EEEE, dd MMMM yyyy");
        Date date = inputFormat.parse(fullDate);
        String outputDate = outputFormat.format(date);
        System.out.println(outputDate);
    }
    public static String convert(String date){
        String[] splitDate = date.split("/");
        LocalDate localDate = LocalDate.of(Integer.parseInt(splitDate[2]),
                Integer.parseInt(splitDate[1]), Integer.parseInt(splitDate[0]));
        return DateTimeFormatter.ofPattern("EEEE, d MMMM, yyyy").format(localDate);
    }
    public static String convert2(String date){
        return DateTimeFormatter.ofPattern("EEEE, d MMMM, yyyy")
                .format(LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
