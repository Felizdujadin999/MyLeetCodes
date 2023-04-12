package DiaryEntry;

import AccountFolder.Account;
import ChapterSeven.Pail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {

    private Entry entry;

    @BeforeEach
    public void startWithThis() {
        String body = " everything ";
        entry = new Entry("My first day at semicolon", 12);
    }

    @Test
    public void testThatEntryHasATitle() {
        entry.setTitle("Mr Chibuzor");
        String result = entry.getTitle();
        assertEquals("Mr Chibuzor", result);
    }

    @Test
    public void testHasAnID() {
        entry.setID(25);
        int IDResult = entry.getID();
        assertEquals(25, IDResult);
    }

    @Test
    public void testThatEntryHasABody() {
        entry.setBody("What a wonderful teacher...");
        String result = entry.getBody();
        assertEquals("What a wonderful teacher...", result);
    }

    @Test
    public void testDateTimeFormatter(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyy, hh:mma");
        LocalDateTime time = LocalDateTime.now();
        String formatDate = time.format(dateTimeFormatter);
        assertEquals(formatDate, entry.getDate());
        System.out.println(formatDate);
    }
}