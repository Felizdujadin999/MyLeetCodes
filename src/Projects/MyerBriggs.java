package Projects;

import java.util.Scanner;

public class MyerBriggs {
    static int[][] question = new int[4][2];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;
        System.out.println("""
                WELCOME TO MYER BRIGGS QUESTIONNAIRE PERSONALITY TEST,
                KINDLY PICK BETWEEN OPTIONS "A" AND "B"
                """);
        System.out.println();

        for (int i = 1; i < 21; i++) {
            switch (i) {
                case 1 -> {
                    System.out.println("""
                            Question 1:
                            A. Expand energy, enjoy groups.
                            B. Conserve energy, enjoy one-on-one.
                            """);
                    System.out.println("Please, pick an option: ");
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        question[0][0]++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        question[0][1]++;
                    } else System.exit(103);
                    break;
                }
                case 2 -> {
                    System.out.println("""
                            Question 2:
                            A. Interpret literally
                            B. look for meaning and possibilities
                            """);
                    System.out.println("Please pick an option: ");
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        question[1][0]++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        question[1][1]++;
                    } else System.exit(103);
                    break;
                }
                case 3 -> {
                    System.out.println("""
                            Question 3:
                            A. Logical, thinking, questioning
                            B. empathetic, feeling, accommodating                           
                            """);
                    System.out.println("Please pick an option: ");
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        question[2][0]++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        question[2][1]++;
                    } else System.exit(103);
                    break;
                }
                case 4 -> {
                    System.out.println("""
                            Question 4:
                            A.  Organized, orderly
                            B. Flexible, adaptable
                            """);
                    System.out.println("Please pick an option: ");
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        question[3][0]++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        question[3][1]++;
                    } else System.exit(103);
                    break;
                }
                case 5 -> {
                    System.out.println("""
                            Question 5:
                            A. More outgoing, think out loud
                            B. more reserved, think to yourself
                            """);
                    System.out.println("Please, pick an option: ");
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        question[0][0]++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        question[0][1]++;
                    } else System.exit(103);
                    break;
                }
                case 6 -> {
                    System.out.println("""
                            Question 6:
                            A. Practical, realistic, experiential
                            B. imaginative, innovative, theoretical
                            """);
                    System.out.println("Please pick an option: ");
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        question[1][0]++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        question[1][1]++;
                    } else System.exit(103);
                    break;
                }
                case 7 -> {
                    System.out.println("""
                            Question 7: 
                            A. Candid, straight forward, frank 
                            B. tactful, kind, encouraging
                            """);
                    System.out.println("Please pick an option: ");
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        question[2][0]++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        question[2][1]++;
                    } else System.exit(103);
                    break;
                }
                case 8 -> {
                    System.out.println("""
                            Question 8:
                            A. Plan, schedule
                            B. unplanned, spontaneous
                            """);
                    System.out.println("Please pick an option: ");
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        question[3][0]++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        question[3][1]++;
                    } else System.exit(103);
                    break;
                }
                case 9 -> {
                    System.out.println("""
                            A. Seek many tasks, public activities interaction with others
                            B. Seek private, solitary activities with quiet to concentrate
                            """);
                    System.out.println("Please pick an option: ");
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        question[0][0]++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        question[0][1]++;
                    } else System.exit(103);
                    break;
                }
                case 10 -> {
                    System.out.println("""
                            Question 10:
                            A. Standard, usual, conventional
                            B. Different, novel, unique
                            """);
                    System.out.println("Please pick an option: ");
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        question[1][0]++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        question[1][1]++;
                    } else System.exit(103);
                    break;
                }
                case 11 -> {
                    System.out.println("""
                            Question 11:
                            A. Firm, tend to criticize, hold the line
                            B. gentle, tend to appreciate, conciliate
                            """);
                    System.out.println("Please pick an option: ");
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        question[2][0]++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        question[2][1]++;
                    } else System.exit(103);
                    break;
                }
                case 12 -> {
                    System.out.println("""
                            Question 12:
                            A. Regulated, structured
                            B. Easy going, live and lets live
                            """);
                    System.out.println("Please pick an option: ");
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        question[3][0]++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        question[3][1]++;
                    } else System.exit(103);
                    break;
                }
                case 13 -> {
                    System.out.println("""
                            Question 13:
                            A. External, communicative, express yourself
                            B. Internal, reticent, keep to yourself
                            """);
                    System.out.println("Please pick an option: ");
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        question[0][0]++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        question[0][1]++;
                    } else System.exit(103);
                    break;
                }
                case 14 -> {
                    System.out.println("""
                            Question 14:
                            A. Focus on here-and-now
                            B. Look to the future, global perspective, "BIG PICTURE"
                            """);
                    System.out.println("Please pick an option: ");
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        question[1][0]++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        question[1][1]++;
                    } else System.exit(103);
                    break;
                }
                case 15 -> {
                    System.out.println("""
                            Question 15:
                            A. Tough-minded, just
                            B. Tender-hearted, merciful
                            """);
                    System.out.println("Please pick an option: ");
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        question[2][0]++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        question[2][1]++;
                    } else System.exit(103);
                    break;
                }
                case 16 -> {
                    System.out.println("""
                            Question 16:
                            A. Preparation, plan ahead
                            B. Go with the flow, adapt as you go
                            """);
                    System.out.println("Please pick an option: ");
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        question[3][0]++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        question[3][1]++;
                    } else System.exit(103);
                    break;
                }
                case 17 -> {
                    System.out.println("""
                            Question 17:
                            A. Active, initiate
                            B. Reflective, deliberate
                            """);
                    System.out.println("Please pick an option: ");
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        question[0][0]++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        question[0][1]++;
                    } else System.exit(103);
                    break;
                }
                case 18 -> {
                    System.out.println("""
                            Question 18:
                            A. Facts, things, "WHAT IS"
                            B. Ideas, dreams, WHAT COULD BE, PHILOSOPHICAL
                            """);
                    System.out.println("Please pick an option: ");
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        question[1][0]++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        question[1][1]++;
                    } else System.exit(103);
                    break;
                }
                case 19 -> {
                    System.out.println("""
                            Question 19:
                            A. Matter of fact, issue-oriented
                            B. sensitive, people-oriented, compassionate
                            """);
                    System.out.println("Please pick an option: ");
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        question[2][0]++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        question[2][1]++;
                    } else System.exit(103);
                    break;
                }
                case 20 -> {
                    System.out.println("""
                            Question 20:
                            A. Control, govern
                            B. latitude, freedom
                            """);
                    System.out.println("Please pick an option: ");
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        question[3][0]++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        question[3][1]++;
                    } else System.exit(103);
                    break;
                }
            }
        }
        result();
    }

    private static void result() {
        String type1 = "";
        String type2 = "";
        String type3 = "";
        String type4 = "";

        if (question[0][0] > question[0][1]) {
            type1 = "E";
        } else {
            type1 = "I";
        }
        if (question[1][0] > question[1][1]) {
            type2 = "S";
        } else {
            type2 = "N";
        }
        if (question[2][0] > question[2][1]) {
            type3 = "T";
        } else {
            type3 = "F";
        }
        if (question[3][0] > question[3][1]) {
            type4 = "J";
        } else {
            type4 = "P";
        }
        System.out.println("Your Personality type is " + type1 + type2 + type3 + type4);
        System.out.println("Thanks for using my application.");
    }
}

