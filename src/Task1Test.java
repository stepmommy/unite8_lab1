public class Task1Test {
}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task1Test {
    @Test
    public void testExceedsAboveThreshold() {
        assertEquals("Exceeds", BuggyProgram.getGrade(95));
    }
    @Test
    public void testExceedsBoundary() {
        assertEquals("Exceeds", BuggyProgram.getGrade(90));
    }
    @Test
    public void testMeetsAboveThreshold() {
        assertEquals("Meets", BuggyProgram.getGrade(85));
    }
    @Test
    public void testMeetsBoundary() {
        assertEquals("Meets", BuggyProgram.getGrade(80));
    }
    @Test
    public void testDoesNotMeet() {
        assertEquals("Does Not Meet", BuggyProgram.getGrade(75));
    }
}