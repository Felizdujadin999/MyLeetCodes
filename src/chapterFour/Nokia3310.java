package chapterFour;

import java.util.Scanner;

public class Nokia3310 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("********       ***        ******       ***       ***       ***       ******** ");
        System.out.println("***   ***      ***      ***     ***    ***     ***         ***    ***        *** ");
        System.out.println("***    ***     ***      ***     ***    ***   ***           ***    ***        *** ");
        System.out.println("***     ***    ***      ***     ***    *** ***             ***    ***        *** ");
        System.out.println("***      ***   ***      ***     ***    ***   ***           ***    ************** ");
        System.out.println("***       ***  ***      ***     ***    ***     ***         ***    ***        *** ");
        System.out.println("***        *** ***      ***     ***    ***       ***       ***    ***        *** ");
        System.out.println("***        *******        ******       ***         ***     ***    ***        *** ");

        System.out.println();
        System.out.println("""
                1. Phone Book
                2. Messages.
                3. Chat.
                4. Call Register.
                5. Tones.
                6. Settings.
                7. Call Divert.
                8. Games.
                9. Calculator.
                10. Reminder.
                11. Clock.
                12. Profiles.
                13. SIM services.
                """);
        System.out.println("Welcome esteemed customer, we have a list of options listed above, do please pick an option above: ");
        int userInput = scanner.nextInt();
        switch (userInput){
            case 1 -> {
                System.out.println("""
                              1. Search
                              2. Service Nos
                              3. Add Name
                              4. Erase
                              5. Edit
                              6. Assign Tone
                              7. Send b'card
                              8. Option 
                              9. Speed Dials
                              10. Voice tags
                              """);
                System.out.println("Pick a number above: ");
                userInput = scanner.nextInt();
                switch (userInput){
                    case 8 -> {
                        System.out.println("""
                                1. Type Of View
                                2. Memory Status 
                                """);
                        break;
                    }
                }
            }
            case 2 -> {
                System.out.println("""
                                  1. Write Messages
                                  2. Inbox
                                  3. Outbox
                                  4. Picture Messages
                                  5. Templates
                                  6. Smileys
                                  7. Message Settings
                                  8. Info Service
                                  9. Voice Mailbox Number
                                  10. Service Command Editor
                                  """);
                System.out.println("Pick a number above: ");
                userInput = scanner.nextInt();
                switch (userInput){
                    case 7 -> {
                        System.out.println("""
                                1. Set 1
                                2. Common
                                """);

                        System.out.println("Pick a number above: ");
                        userInput = scanner.nextInt();
                       switch (userInput) {
                           case 1 -> System.out.println("""
                                   1. Message Center Number
                                   2. Messages Sent As
                                   3. Message Validity
                                   """);
                           case 2 -> {
                               System.out.println("""
                                       1. Delivery Reports 
                                       2. Reply Via Same Center 
                                       3. Character Support
                                       """);
                               break;
                           }
                       }
                    }

                }
            }
            case 3 -> {
                break;
            }
            case 4 -> {
                System.out.println("""
                        1. Missed Calls 
                        2. Received Calls 
                        3. Dialed Numbers 
                        4. Erase Recent call Lists
                        5. Show Call Duration 
                        6. Show call Costs 
                        7. Call Cost Settings 
                        8. Prepaid Credit
                        """);
                System.out.println("Pick a number above: ");
                userInput = scanner.nextInt();
                switch (userInput) {
                    case 5 -> System.out.println("""
                            1. Last Call Duration
                            2. All Calls Duration
                            3. Received Calls Duration
                            4. Dialled Calls Duration
                            5. Clear Timers
                            """);
                    case 6 -> System.out.println("""
                            1. Last Call Cost 
                            2. All Calls Cost
                            3. Clear Counters 
                            """);
                    case 7 -> System.out.println("""
                            1. Call Cost Limit
                            2. Show Costs In
                            """);
                }
                break;
            }
            case 5 -> {
                System.out.println("""
                        1. Ringing Tone
                        2. Ringing Voluming
                        3. Incoming Call Alert
                        4.Composer
                        5. Message Alert tone
                        6. Keypad Tones 
                        7. Warning And Games 
                        8. Vibrating Alert
                        9. Screen Saver
                        """);
                break;
            }
            case 6 ->  {
                System.out.println("""
                        1. Call Settings
                        2. Phone Settings
                        3. Security Settings
                        4. Restore Factory Settings
                        """);
                System.out.println("Pick a number above: ");
                userInput = scanner.nextInt();
                switch (userInput){
                    case 1 -> System.out.println("""
                            1. Automatic Redial 
                            2. Speed Dialing 
                            3. Call Waiting Options
                            4. Own Number Sending
                            5. Phone Line In Use
                            6. Automatic Answer
                            """);
                    case 2 -> System.out.println("""
                            1. Language
                            2. Cell Info Display
                            3. Welcome Note
                            4. Network Selection
                            5. Lights 
                            6. Confirm SIM Service
                            """);
                    case 3 -> System.out.println("""
                            1. PIN Code Request
                            2. Call Barring Service 
                            3. Fixed Dialling
                            4. Closed User Group
                            5. Phone Security
                            6. Change Access Codes
                            """);
                }
                break;
            }
        case 7 -> {
                break;
        }
        case 8 -> {
                break;
        }
        case 9 -> {
                break;
        }
        case 10 -> {
                break;
        }
        case 11 -> {
            System.out.println("""
                    1. Alarm Clock 
                    2. Clock Settings 
                    3. Date Settings 
                    4. Stopwatch
                    5. Countdown Timer 
                    6. Auto Update Of Date And Time  
                    """);
            break;
        }
        case 12 -> {
                break;
        }
        case 13 -> {
                break;
        }
            default -> System.out.println("You picked a wrong number, re-run and try again.....");

        }
    }
}
