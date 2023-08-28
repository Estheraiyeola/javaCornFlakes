package diaryApp;

import java.time.LocalDateTime;

public class Entry {
    private final int id;
    private String title;
    private String body;
    private LocalDateTime dateCreated;
    public Entry(int id, String title, String body) {
        this.title = title;
        this.body = body;
        this.id = id;
        System.out.println(getDateCreated());
    }
    public LocalDateTime getDateCreated(){
        dateCreated = LocalDateTime.now().toLocalDate().atStartOfDay();
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
        this.body +=  body;
    }


}
