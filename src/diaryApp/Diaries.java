package diaryApp;

import javax.sql.RowSet;
import java.util.ArrayList;
import java.util.List;

public class Diaries {

    private boolean isEmpty;
    private List<Diary> diaries = new ArrayList<>();

    public boolean isEmpty() {
        if (diaries.isEmpty()) isEmpty = true;
        return isEmpty;
    }

    public void add(String userName, String password) {
        Diary diary = new Diary(userName, password);
        diaries.add(diary);
    }

    public int getSize() {
        return diaries.size();
    }

    public Diary findByUsername(String username) {
        for (Diary diary : diaries) {
            if (diary.getUsername().equals(username)) return diary;
        }

        throw new IllegalArgumentException("Diary does not exist");
    }

    public void delete(String username, String password) {
        String userName = findByUsername(username).getUsername();
        if (userName.equals(username)) {
            validate(password);
            diaries.remove(findByUsername(username));
        }
    }
    private void validate(String password) {
        if (!isCorrectPassword(password)) throw new IllegalArgumentException("Incorrect pin");
    }

    private boolean isCorrectPassword(String password) {
        for (Diary diary:diaries) {
            if (diary.getPassword().equals(password)) return true;
        }
        return false;
    }
}
