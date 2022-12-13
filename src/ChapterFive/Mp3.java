package ChapterFive;

public class Mp3 {
    public boolean isOpen;

    public void getIsOpen() {
        if (isOpen) {
            System.out.println("Its open...");
        } else {
            System.out.println("Its closed...");
        }
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }
}
