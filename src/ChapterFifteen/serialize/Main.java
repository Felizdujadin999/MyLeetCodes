package ChapterFifteen.serialize;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        //Write a serialized file.
        Dog dog1 = new Dog("lucky", 35);
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("dog"))){

            objectOutputStream.writeObject(dog1);
        }
        catch (IOException|SecurityException exception){
            exception.printStackTrace();
        }
        //REad out serialized file.
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\PC\\IdeaProjects\\dujadinJavaProject\\dog"))){
            dog1 = (Dog)objectInputStream.readObject();
        }catch (IOException| ClassNotFoundException | SecurityException e){
            e.printStackTrace();
        }
        System.out.println(dog1.getAge());
        System.out.println(dog1.getName());
    }
}