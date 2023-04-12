package ChapterFifteen;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class PathWay {
    public static void main(String[] args){
//        Path path = Paths.get("a:/b/c");
//        System.out.println("fileName:: "+path.getFileName());//gets the file name.
//        System.out.println("count:: "+path.getNameCount());//gets the total paths.
//        System.out.println("fileSystem:: "+path.getFileSystem());//gets the file system.
//        System.out.println("parent:: "+path.getParent());//gets the parents of the last file.
//        System.out.println("root:: "+path.getRoot());//?Still unknown?.
//        System.out.println("absolute:: "+path.toAbsolutePath());//prints out my whole path.
//        System.out.println("normalForm:: "+path.normalize());// Makes paths forward and reference a directory behind to be gotten.
//        System.out.println(System.getProperty("file.separator"));//tells us which separator works for which systemd.
//
//        System.out.println( );
//        Path path1 = Path.of("a", "b", "c.java");
//        System.out.println("path:: "+path1);
//        System.out.println("path ends with .java:: "+path1.endsWith(Path.of("c.java")));


        System.out.println(Arrays.toString(args));
        for (int i = 0; i < args.length; i++) {
            Path path = Path.of("C:\\Users\\PC\\Desktop\\regnosFileCreation"+"\\"+args[i]+".java");
            try {
                Files.createFile(path);
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
}