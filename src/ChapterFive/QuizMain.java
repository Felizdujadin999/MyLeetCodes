package ChapterFive;

public class QuizMain {
    public static void main(String[] args) {
        QuizQuestions quiz = new QuizQuestions();
        String answers = quiz.questions();
        quiz.analysis(answers);
    }
}
