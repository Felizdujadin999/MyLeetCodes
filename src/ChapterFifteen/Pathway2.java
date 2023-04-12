package ChapterFifteen;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;

public class Pathway2 {
    public static void main(String[] args) {
        Path path = Path.of("C:\\Users\\PC\\Desktop\\regnosFileCreation\\test.java");
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)) {
            Path filePath = Files.createFile(path);
            Iterator<Path> iterator = directoryStream.iterator();
            while (iterator.hasNext()) {
                Path path1 = iterator.next();
                System.out.println(path1.getFileName());
            }
            System.out.println("new file path:: " + filePath);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
