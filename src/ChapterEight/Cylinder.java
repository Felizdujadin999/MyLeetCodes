package ChapterEight;

public class Cylinder {
    private double radius = 1;
    private double height = 1;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double cylindersVolume(){
        int pie = 22/7;
        return pie*radius*radius*height;
    }
}
