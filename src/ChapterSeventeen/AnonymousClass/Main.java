package ChapterSeventeen.AnonymousClass;

public class Main {
    public static void main(String[] args) {
        Toyota toyota = new Toyota();

        CarMethod carMethod = new CarMethod() {
            @Override
            public void move() {
                System.out.println("Move");
            }

            @Override
            public String stop() {
                System.out.println("Stop");
                return null;
            }
        };
        toyota.move(carMethod);
        toyota.stop(carMethod);
    }
}
