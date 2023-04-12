package ChapterFive;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizQuestions {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> response = new ArrayList<>();

    public String questions() {
        String answerToQuestion = "";
        System.out.println("""
                ANSWER THE FOLLOWING QUESTIONS CAREFULLY AND CORRECTLY AS THEY TEST YOUR KNOWLEDGE.......
                Instructions: Below are two questions with five options and four possible answers,
                do well to pick four suitable options from each question....
                                
                Question 1: Which of these relate to time travel in physics?.
                A. Time
                B. Distance.
                C. Space quantum
                D. Relative velocity
                E. Mass
                                
                Question 2: Which of these planets still exists?
                A. Mercury
                B. Jupiter
                C. Uranus
                D. Pluto
                E. Saturn
                                
                Answer here please::
                """);
        answerToQuestion = scanner.next();
        return answerToQuestion;
    }

    public void analysis(String answer) {
        String[] answerInArray = new String[8];

        String[] rightAnswers = {"A", "B", "D", "E", "A", "B", "C", "E"};

        for (int i = 0; i < rightAnswers.length; i++) {
            answerInArray[i] = String.valueOf(answer.charAt(i));
        }

        for (int i = 0; i < answerInArray.length; i++) {
            if (rightAnswers[i].equalsIgnoreCase(answerInArray[i])) {
                response.add(answerInArray[i]);
            }
        }

        if (response.size() == 8) {
            System.out.println("Excellent, you got it all right......");
        } else if (response.size() > 4 && response.size() < 8) {
            System.out.println("Very good, you tried.....");
        } else if (response.size() < 4) {
            System.out.println("This is poor man, you need to learn more about this field and try again........");
        }

        int finalAnswers = response.size();
        System.out.println(finalAnswers);
    }
}
