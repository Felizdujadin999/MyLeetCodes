package DiaryEntry;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Entry {
    private String title;
    private String body;
    private int ID;
    private LocalDateTime date;
    public Entry(String title, int ID){
        this.title = title;
        this.ID = ID;
        date = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDate(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyy, hh:mma");
        return dateTimeFormatter.format(date);
    }
    @Override
    public String toString(){
      return String.format("""
              ====================
              Entry Date: %s
              Entry Title: %s
              Entry Body: %s
              ID Number: %s
              ====================
              """, date, title, body, ID);
    }
}
