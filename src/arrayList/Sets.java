package arrayList;

import java.util.Arrays;

public class Sets {
    private int size;
    private int capacity;
    private int initialCapacity;
    private Object[] collections;

    Sets(int initialCapacity){
        this.initialCapacity = initialCapacity;
        collections = new String[initialCapacity];
        capacity = initialCapacity;
    }
    Sets(){
        final int initialCapacity = 16;
        this.capacity = initialCapacity;
        collections = new String[capacity];
    }
    public void add(Object element) {
        if (isUnique(element)) {
            if (isFull()) expandCollection();
            this.collections[size] = element;
            size++;
        }
    }

    private boolean isUnique(Object element) {
        boolean state = true;
        for (int index = 0; index < collections.length; index++) {
            if (element == collections[index]) state = false;
            else return state;
        }
        return state;
    }

    private void expandCollection() {
        capacity = capacity * 2;
        collections = new Object[capacity];
    }

    private boolean isFull() {
        if (capacity == size) return true;
        else return false;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        if (size > 0) return false;
        else return true;
    }

    public void remove(Object element) {
        size--;
    }

    public String getElements() {
        return Arrays.toString(collections);
    }

    public int getCapacity() {
        return  capacity;
    }
    public boolean isUnique(Object[] set){
        boolean state = false;
        int trueCounter = 0;
        for (int index = 0; index < set.length; index++) {
            for (int idx = 1; idx < set.length; idx++) {
                if (set[index] == set[idx]) return false;
                else {
                    trueCounter++;
                    return true;
                }
            }
        }
        if (trueCounter == set.length) state = true;
        return state;
    }

    public boolean compare(Object[] firstSet, Object[] secondSet) {
        boolean state = false;
        if (isUnique(firstSet) && isUnique(secondSet)){
            if (firstSet.length == secondSet.length){
                int trueCounter = 0;
                for (int index = 0; index < firstSet.length; index++) {
                    if (firstSet[index] == secondSet[index]) state = true;
                    else{
                        state = false;
                        trueCounter++;
                    }
                }
                if (trueCounter == firstSet.length) state = true;
            }
        }
        return state;
    }
}
