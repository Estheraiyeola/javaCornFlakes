package diaryApp;

import java.time.LocalDateTime;

public class Entry {
    private  int id;
    private String title;
    private String body;
    private LocalDateTime dateCreated;
    public Entry(int id, String title, String body) {
        this.title = title;
        this.body = body;
        this.id = id;
    }
    public LocalDateTime getDateCreated(){
        return dateCreated;
    }
    public String getEntry() {
        return title + " " + body;
    }

    public int getId() {
        return id;
    }
    public String getTitle(){
        return title;
    }
    public void updateEntry(String title, String body){
        this.title += title;
        this.body += body;
    }


}
