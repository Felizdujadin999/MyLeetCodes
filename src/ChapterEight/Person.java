package ChapterEight;

import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<Problem> problems;

    public String tellProblem() {
        String ourProblem = "";
        for (Problem problem : problems) {
            if (!problem.isSolved()) {
                ourProblem += problem.getName() + "\n";
            }
        }
        return ourProblem;
    }
}
