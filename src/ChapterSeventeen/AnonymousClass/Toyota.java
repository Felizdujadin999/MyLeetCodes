package ChapterSeventeen.AnonymousClass;

public class Toyota {
    public String stop(CarMethod carMethod){
       return carMethod.stop();
    }
    public void move(CarMethod carMethod){
        carMethod.move();
    }
}
