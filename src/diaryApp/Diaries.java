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
        userNameAlreadyExists(userName);
        Diary diary = new Diary(userName, password);
        diaries.add(diary);
    }

    private void userNameAlreadyExists(String userName) {
        if (!diaries.isEmpty()){
            for (Diary diary: diaries){
                comparesUsername(userName, diary);
            }
        }
    }

    private static void comparesUsername(String userName, Diary diary) {
        if (diary.getUsername().equals(userName)){
            throw new IllegalArgumentException("Username Already Exists");
        }
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
            validate(username,password);
            diaries.remove(findByUsername(username));
        }
    }
    public void validate(String username, String password) {
        if (!findByUsername(username).getPassword().equals(password)) throw new IllegalArgumentException("Incorrect pin");
    }


}
