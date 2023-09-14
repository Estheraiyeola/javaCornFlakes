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

    public void unlockDiary(String password) {
        validate(password);
        isLocked = false;
    }

    private void validate(String password) {
        if (!this.password.equals(password))throw new IllegalArgumentException("Incorrect Password");
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
        throw new IllegalArgumentException("Entry not found");
    }

    public void deleteEntry(int id) {
        Entry entry = findEntry(id);
        entries.remove(entry);
    }

    public int getSize() {
        return this.entries.size();
    }

    public void updateEntry(int id, String newTitle, String newBody) {
        findEntry(id).setTitle(newTitle);
        findEntry(id).setBody(newBody);
    }

    public String getUsername() {
        return userName;
    }
    public String getPassword() {
        return password;
    }
    public Entry findByTitle(String title){
        for (Entry entry: entries){
            if (entry.getTitle().equals(title)) return entry;
        }
        throw new IllegalArgumentException("Wrong Id");
    }
}
