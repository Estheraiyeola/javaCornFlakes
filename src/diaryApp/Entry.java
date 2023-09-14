package diaryApp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {
    private int id;
    private String title;
    private String body;
    private final LocalDateTime dateCreated = LocalDateTime.now();
    public Entry(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }
    public String getEntry() {
        return "Entry Id-> " + getId() + "\nTitle-> " + getTitle() + "\nBody-> " + getBody() + "\nDateCreated-> " + dateCreated.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title){
        this.title += title;
    }
    public String getTitle(){
        return this.title;
    }

    public void setBody(String body){
        this.body += body;
    }
    public String getBody(){
        return this.body;
    }

}
