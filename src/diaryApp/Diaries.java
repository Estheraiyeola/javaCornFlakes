package diaryApp;

import java.util.ArrayList;
import java.util.List;

public class Diaries {

    private boolean isEmpty;
    private List<Diary> diaries = new ArrayList<>();

    public boolean isEmpty() {
        if (diaries.isEmpty()) isEmpty = true;
        return isEmpty;
    }
}
