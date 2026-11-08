import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task2Test {
    @Test
    public void testSumWithEvensAndOdds() {
        int[] input = {1, 2, 3, 4, 5, 6};
        assertEquals(12, BuggyProgram.sumEvenNumbers(input));
    }
    @Test
    public void testAllEvens() {
        int[] input = {2, 4, 6, 8};
        assertEquals(20, BuggyProgram.sumEvenNumbers(input));
    }
    @Test
    public void testAllOdds() {
        int[] input = {1, 3, 5, 7};
        assertEquals(0, BuggyProgram.sumEvenNumbers(input));
    }
    @Test
    public void testEmptyArray() {
        int[] input = {};
        assertEquals(0, BuggyProgram.sumEvenNumbers(input));
    }
}