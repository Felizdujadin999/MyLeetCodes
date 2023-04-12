package List;

public interface ListS {

    boolean isEmpty();
    void add(int value);

    void add(int value, int index);
    void remove(int value);
    int size();
    int get(int value);
    int getIndexOf(int value);
    int getCapacity();
}
