# Lab Reflection: Git Version Control + Debugging (BuggyProgram)

## Student Name
BP

## GitHub Repository URL

https://github.com/stepmommy/unite8_lab1

---

# Commit 1: Initial Commit

## What did you include in this commit?
- The starter Java program, project configuration, and initial test class placeholders.

## What was the purpose of this commit?
- To save the original project as a baseline before editing it.

---

# Commit 2: Task 1 (getGrade)

## Which tests in Task1Test were failing before your fix?
- The current `getGrade` implementation matches the expected outcomes in the supplied tests: 90 and above returns `Exceeds`, 80 through 89 returns `Meets`, and lower scores return `Does Not Meet`. No failing test or code fix is present in the current project history.

## What was the issue in the code?
- No issue is visible in the current implementation relative to `Task1Test`.

## What change did you make to fix it?
- No code change has been made for this task yet.

## How did the tests help guide your fix?
- The test cases document the expected results at scores 75, 80, 85, 90, and 95. Run `Task1Test` in IntelliJ to confirm those cases pass.

---

# Commit 3: Task 2 (sumEvenNumbers)

## Which tests in Task2Test were failing before your fix?
- The current implementation handles the supplied mixed, all-even, all-odd, and empty-array cases. No failing test or code fix is present in the current project history.

## What was the issue in the code?
- No issue is visible in the current implementation relative to `Task2Test`.

## What change did you make to fix it?
- No code change has been made for this task yet.

## How did the tests help guide your fix?
- The cases check that only even values are added and that an empty array returns zero. Run `Task2Test` in IntelliJ to confirm them.

---

# Commit 4: Task 3 (sumRange)

## Which tests in Task3Test were failing before your fix?
- The current implementation returns the inclusive sum for an ordered range and zero when the start is greater than the end, matching the supplied tests. No failing test or code fix is present in the current project history.

## What was the issue in the code?
- No issue is visible in the current implementation relative to `Task3Test`.

## What change did you make to fix it?
- No code change has been made for this task yet.

## How did the tests help guide your fix?
- The cases cover a standard range, equal bounds, a negative-to-positive range, and reversed bounds. Run `Task3Test` in IntelliJ to confirm them.

---

# Overall Reflection

## Which task was the easiest to fix? Why?
- I have not made code fixes yet because the current implementation already matches the supplied test expectations. Comparing each method with its tests helped me understand the intended boundaries and results.

## Which task was the most difficult? Why?
- I have not made code fixes yet. `sumRange` has the most boundary cases in its tests, especially equal and reversed bounds, so those require careful attention.

## How did Git help you track your progress through the debugging process?
- Git shows the project history and the changes made between saved versions. Separate commits can make each completed task easier to review.

## Why is it important to make small, frequent commits when debugging code?
- Small commits make it easier to see which change caused a problem and to return to a known working version.

## What did you learn about using JUnit tests to guide debugging?
- JUnit tests spell out expected behavior for normal inputs and edge cases. Comparing those expectations with the implementation helps identify whether a change is needed.

---

# Commit 5: Final Reflection

## What did you complete or update before making this final commit?
- I reviewed the supplied tests and program, corrected this README so it reflects the current code and history, and recorded the repository URL. I still need to enter my name and run each test class in IntelliJ.

## Why is it useful to document your work after completing a programming task?
- Documentation records what the code is expected to do and what I learned, making the work easier to review and continue later.
