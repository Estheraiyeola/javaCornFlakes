package arrayList;

import java.util.Arrays;
import java.util.Objects;

public class ArrayList{
    public int size;
    private int initialCapacity;
    private int capacity = initialCapacity;
    private boolean isEmpty = true;
    public String[] namesList;

    public ArrayList(int initialCapacity){
        this.initialCapacity = initialCapacity;
        namesList = new String[initialCapacity];
        capacity = initialCapacity;
    }
    public ArrayList(){
        final int initialCapacity = 16;
        this.capacity = initialCapacity;
        namesList = new String[capacity];
    }
    public void add(String element) {
        if (isFull()) expandCollection();
        this.namesList[size] = element;
        size++;
    }

    private boolean isFull() {
        if (capacity == size) return true;
        else return false;
    }

    private void expandCollection() {
        capacity = capacity * 2;
        namesList = new String[capacity];
    }

    public boolean isEmpty() {
        isEmpty = size <= 0;
        return isEmpty;
    }

    public int getSize() {
        return size;
    }

    public void remove(String element) {
        for (int idx = 0; idx < namesList.length; idx++) {
            if (Objects.equals(namesList[idx], element)) {

            }
        }
        size--;
    }

    public int getCapacity(){
        return capacity;
    }

    public String getElement(int index) {
        String elementInTheIndex = "";
        for (int idx = 0; idx < namesList.length; idx++) {
            if (index == idx) elementInTheIndex = namesList[idx];
        }
        return elementInTheIndex;
    }

    public String getElementsInTheList() {
        return Arrays.toString(namesList);
    }

    public void add(String element, int index) {
        add(element);
        if (!isEmpty){
            for (int idx = index; idx < namesList.length; idx++) {
                String temp;
                temp = namesList[namesList.length - 1];
                namesList[namesList.length - 1] = namesList[idx];
                namesList[idx] = temp;
            }
        }

    }
}
