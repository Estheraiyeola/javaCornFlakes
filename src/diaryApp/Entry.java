package diaryApp;

import java.time.LocalDateTime;

public class Entry {
    private final int id;
    private String title;
    private String body;
    private LocalDateTime dateCreated;
    public Entry(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
        dateCreated = LocalDateTime.now();
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
        this.body +=  body;
    }
    public void setTitle(String title){
        this.title += title;
    }
    public void setBody(String body){
        this.body += body;
    }
//    @Override
//    public String toString(){
//        return id + " " + title + " " + body;
//    }

}
