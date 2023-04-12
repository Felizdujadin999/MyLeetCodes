package ChapterFifteen.readerAndWriter;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        //READER
        char[] chars = new char[1024];
        try(FileReader reader = new FileReader("C:\\Users\\PC\\IdeaProjects\\dujadinJavaProject\\src\\ChapterFifteen\\text.txt");){
           var numberOfCharacters =  reader.read(chars);
            System.out.println(numberOfCharacters);
            System.out.println(Arrays.toString(chars));
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
