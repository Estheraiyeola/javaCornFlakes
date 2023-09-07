package arrayList;

import java.util.Objects;

public class Set extends ArrayList{
    public Set(){
        super();
    }
    public Set(int initialCapacity){
        super(initialCapacity);
    }


    public void add(String element) {
       super.add(element);
        if (size > 1){
            for (int index = 0; index < namesList.length; index++) {
                for (int idx = index + 1; idx < namesList.length; idx++) {
                    if (Objects.equals(namesList[index], namesList[idx])){
                        remove(namesList[idx]);
                    }
                    else namesList[idx] = element;
                }
            }
        }
    }

    private boolean compareToTheList(String element, int index) {
        boolean state = true;
        int counter = 1;
        if (!Objects.equals(namesList[index], element)){
            counter ++;
            return true;
        }
        else return false;
    }

    private boolean isUnique(Object[] collections, String element) {
        boolean state = true;
        int trueCounter = 1;
        for (int index = 0; index < namesList.length; index++) {
            if (Objects.equals(namesList[index], element)) state = false;
            else {
                state = true;
                trueCounter++;
            }
        }
        if (trueCounter == namesList.length) state = true;
        return state;
    }
}
