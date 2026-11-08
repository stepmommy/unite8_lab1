import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task3Test {
    @Test
    public void testStandardRange() {
        assertEquals(15, BuggyProgram.sumRange(1, 5));
    }
    @Test
    public void testSameStartAndEnd() {
        assertEquals(4, BuggyProgram.sumRange(4, 4));
    }
    @Test
    public void testNegativeRange() {
        assertEquals(0, BuggyProgram.sumRange(-2, 2));
    }
    @Test
    public void testStartGreaterThanEnd() {
        assertEquals(0, BuggyProgram.sumRange(5, 1));
    }
}