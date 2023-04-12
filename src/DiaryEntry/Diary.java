package DiaryEntry;

import java.util.ArrayList;

public class Diary {
    private String password;
    private String username;
    private boolean isLocked;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Diary(String username, String password){
        this.password = password;
        this.username = username;
    }
    ArrayList<Entry> newEntry = new ArrayList<>();

    public void createEntry(String title, String body) {
        int IDGenerator = newEntry.size() + 1;
        Entry entry = new Entry(title, IDGenerator);
        entry.setBody(body);
        newEntry.add(entry);
    }

    public void editEntry(int number, String title, String body) {
        Entry idNum = newEntry.get(number - 1);
        if (title== null){title = idNum.getTitle();}
        else if (body == null){body = idNum.getBody();}
        idNum.setBody(body);
        idNum.setTitle(title);
        newEntry.set(number - 1, idNum);
    }

    public Entry findEntry(int ID) {
        return newEntry.get(ID - 1);
    }

    public String viewEntry(int IDNumber) {
        if (newEntry.get(IDNumber - 1) == null) return "No entry found here...";
        return findEntry(IDNumber).toString();
    }

    public void deleteEntry(int IDNumber) {
        Entry deleteEntry = findEntry(IDNumber);
        newEntry.remove(deleteEntry);
        newEntry.add(IDNumber - 1, null);
    }

    public int countEntries() {
        int count = newEntry.size();
        for (Entry entry : newEntry) {
            if (entry == null) {
                count -= 1;
            }
        }
        return count;}

    public String viewAllEntries(){
        return newEntry.toString();
    }

    public String lockDiary(){
        return "Diary locked....";
    }
    public void validateID(int idNumber) {
        int validateID = newEntry.get(idNumber-1).getID();
        if (validateID > newEntry.size())throw new IllegalArgumentException("INVALID");
    }
}