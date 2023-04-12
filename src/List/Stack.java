package List;

public class Stack {
    private int count;
    private int[] elements;

    public Stack(int size) {
        this.elements = new int[size];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void push(int value) {
        if (isFull()) throw new StackOverflowError("Stack Overflow....");
        elements[count] = value;
        count++;
    }


    public int pop() {
        if (isEmpty()) {throw new StackOverflowError("Stack Underflow....");};
        //--count;
        return elements[--count];
    }

    public boolean isFull() {
        return count == elements.length;
    }

    public int peek() {
        return elements[count-1];
    }
}
