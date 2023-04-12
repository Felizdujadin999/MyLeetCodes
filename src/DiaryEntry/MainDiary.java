package DiaryEntry;

import javax.swing.*;

public class MainDiary {
    private static final Diary diary = new Diary("felix", "5555");
    public static void main(String... args) {
        try {
            validateLogin();
            gotoMainMenu();
        }catch (StringIndexOutOfBoundsException er) {
            display("Invalid input.....");
            main();
        } gotoMainMenu();
    }
    public static void gotoMainMenu(){
        String menu = """
                ================================
                           MY DIARY
                ================================
                1 -> Create Entry.
                2 -> Edit Entry.
                3 -> View Entry.
                4 -> Count Entry.
                5 -> Delete Entry.
                6 -> View All Entry.
                7 -> Exit Application.
                ================================
                """;
        String userInput = input(menu);
        switch (userInput.charAt(0)){
            case '1' -> CreateEntry();
            case '2' -> EditEntry();
            case '3' -> ViewEntry();
            case '4' -> CountEntry();
            case '5' -> DeleteEntry();
            case '6' -> ViewAllEntry();
            case '7' -> Exit();
            default -> gotoMainMenu();
        }
        gotoMainMenu();
    }

    private static void ViewAllEntry() {
        display(diary.viewAllEntries());
        gotoMainMenu();
    }

    private static void Exit() {
        display(diary.lockDiary());
        display("Thanks for using this application");
        System.exit(1);
    }

    private static void DeleteEntry() {
        int idNumber = Integer.parseInt(input("Enter ID Number to delete:: "));
        IdnumberValidation(idNumber);
        diary.deleteEntry(idNumber);
        display("Entry deleted....");
        gotoMainMenu();
    }

    private static void CountEntry() {
        String numberOfEntries = String.format("""
                You have %s number of entry in this diary.
                """, diary.countEntries());
            display(numberOfEntries);
            gotoMainMenu();
    }
    private static void ViewEntry() {
        int number = Integer.parseInt(input("Enter ID Number:: "));
        IdnumberValidation(number);
        display("Here is your entry:: ");
        display(diary.viewEntry(number));
        gotoMainMenu();
    }

    private static void EditEntry() {
        int number = Integer.parseInt(input("Enter the ID Number to edit:: "));
        IdnumberValidation(number);
        int whatToEdit = Integer.parseInt(input("""
                1. Title.
                2. Body.
                """));
        String title = null;
        String body = null;
        if (whatToEdit == 1) {title = input("What would like to call this entry?:: ");}
        else if(whatToEdit == 2){body = input("What's new today?:: ");}
        diary.editEntry(number,title,body);
        display("Entry updated successfully....");
        gotoMainMenu();
    }

    private static void CreateEntry() {
        String name = input("What would you like to name this entry?:: ");
        String body = input("What would you like to write up today?:: ");
        diary.createEntry(name,body);
        display("Entry saved successfully.......");
        gotoMainMenu();
    }

    private static String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);
        // display(prompt);
        // return keyboardInputCollector.nextLine();
    }

    private static void display(String prompt) {
        JOptionPane.showMessageDialog(null, prompt);
        // System.out.println(prompt);
    }

    private static void IdnumberValidation(int idNumber){
        try {diary.validateID(idNumber);}
        catch (IndexOutOfBoundsException ex){
            display("ID number not found");
            gotoMainMenu();}
    }

    private static void validate(String username){
        if (!diary.getUsername().equals(username))throw new IllegalArgumentException("Wrong Username");
    }
    private static void validatePassword(String password){
        if (!diary.getPassword().equals(password))throw new IllegalArgumentException("Wrong password");
    }

    private static void validateLogin(){
        String userName = input("Enter username:: ");
        String password = input("Enter password:: ");
        try {
            validate(userName);
            validatePassword(password);
        }catch (IllegalArgumentException er){
            display(er.getMessage());
            validateLogin();
      }}
}
