package diaryApp;


import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String password;
    private String userName;
    private boolean isLocked = false;
    private List<Entry> entries = new ArrayList<>();

    public Diary(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void lockDiary() {
        isLocked = true;
    }
    public boolean isLocked() {
        return isLocked;
    }

    public void unlockDiary() {
        isLocked = false;
    }


    public void createEntry(String title, String body) {
        Entry entry = new Entry(generateId(), title, body);
        entries.add(entry);
    }

    private int generateId() {
        return entries.size() + 1;
    }

    public Entry findEntry(int id) {
        for (Entry entry : entries) {
            if (entry.getId() == id) return entry;
        }
        throw new IllegalArgumentException("Wrong Id");
    }

    public void deleteEntry(int id) {
        int identity = findEntry(id).getId();
        entries.remove(identity - 1);
    }

    public int getSize() {
        return entries.size();
    }

    public void updateEntry(int id, String newTitle, String newBody) {
        findEntry(id).updateEntry(newTitle, newBody);
    }
}
