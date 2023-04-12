package ChapterFifteen.readerAndWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) {
        //WRITER
        try (FileWriter fileWriter = new FileWriter("C:\\Users\\PC\\IdeaProjects\\dujadinJavaProject\\src\\ChapterFifteen\\text.txt", true)){
            fileWriter.append("Thank God Its Friday");
        }catch (IOException|SecurityException exception){
            System.err.println(exception.getMessage());}
    }
}
