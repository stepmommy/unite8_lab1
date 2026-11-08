public class BuggyProgram {

    // Method 1: nested conditionals
    public static String getGrade(int score) {
        if (score >= 90) {
            return "Exceeds";
        } else {
            if (score >= 80) {
                return "Meets";
            } else {
                return "Does Not Meet";
            }
        }
    }

    // Method 2: loop with array
    public static int sumEvenNumbers(int[] values) {
        int sum = 0;

        for (int value : values) {
            if (value % 2 == 0) {
                sum += value;
            }
        }

        return sum;
    }

    // Method 3: loop with bounds (no array)
    public static int sumRange(int start, int end) {
        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        return sum;
    }

    static void main() {
        System.out.println("Test the program using the JUnit tests");
    }
}
