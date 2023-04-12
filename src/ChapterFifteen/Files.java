package ChapterFifteen;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Files {
    public static void main(String[] args) {
        //TO READ FROM A FILE
        try (FileInputStream fileInputStream =
                     new FileInputStream("C:\\Users\\PC\\IdeaProjects\\dujadinJavaProject\\src\\ChapterFifteen\\text.txt")) {
            byte[] bytes = fileInputStream.readAllBytes();
            System.out.println(Arrays.toString(bytes));
            for (byte b : bytes) {
                System.out.print(Character.toString(b) + " ");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        //TO WRITE INTO A FILE
        try (FileOutputStream fileOutputStream
                     = new FileOutputStream("C:\\Users\\PC\\IdeaProjects\\dujadinJavaProject\\src\\ChapterFifteen\\text_output.txt")){
            byte[] bytes = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100};
            fileOutputStream.write(bytes);
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}