package DiaryEntry;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
    Diary diary;
    @BeforeEach
    public void startEachTestWith() {
        diary = new Diary(" ", " ");
        diary.createEntry("My experience", "You are high");
        diary.createEntry("Zainab", "nicest girl in semicolon");
    }



    @Test
    public void testThatICanCountMyEntry(){
        diary.countEntries();
        assertEquals(2, diary.countEntries());
    }

    @Test
    public void testThatICanViewMyEntry(){
        System.out.println(diary.viewEntry(2));
    }

    @Test
    public void testThatICanDeleteMyEntry(){
        diary.createEntry("josh", "brother");
        diary.createEntry("Spencer", "Brother");
        diary.createEntry("Yinka", "Ripper");
        diary.deleteEntry(2);
        assertEquals(4,diary.countEntries());
    }

    @Test
    public void testICanEditMyEntry(){
        diary.editEntry(1, "Yinka", "Ripper at its best");
        System.out.println(diary.viewEntry(1));
    }
}