package ArrayList;

import List.ListS;

import java.util.ArrayList;

public class ArrayLists implements ListS {
   private int count;
   private int capacity;
   private int[] value;
    public ArrayLists(int size){
        capacity = size;
        value = new int[capacity];
    }

    public boolean isEmpty() {
       return count == 0;
    }


    public void add(int number) {
        if (count == getCapacity()) {
            this.capacity *= 2;
             value = new int[capacity];
        }
        value[count++] = number;
    }

    public void remove(int number) {
        if (count == 0)throw new IllegalArgumentException("Out of bounds....");
        for (int index = 0; index < count; index++) {
            if (value[index] == number){
                value[index] = value[index+1];
                value[count-1] = 0;
            }
        }count--;

    }

    public void add(int number, int index) {
        setCapacity();
        var z = value[index];
        value[index] = number;
        value[count++] = z;
    }

    public int size() {
        return count;
    }

    public int get(int index){
        if (index <= count)
            return value[index];
        else return 0;
    }

    public int getIndexOf(int number) {
        for (int index = 0; index < count; index++) {
            if (value[index] == number) return index;
        }
        return 0;
    }

    public int getCapacity() {
       return capacity;
    }
    public void setCapacity(){
        this.capacity = 4;
        if (size() == getCapacity()-2)
            this.capacity = capacity *2;
    }
}
