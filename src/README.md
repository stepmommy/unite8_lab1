# Lab Reflection: Git Version Control + Debugging (BuggyProgram)

## Student Name


## GitHub Repository URL


---

# Commit 1: Initial Commit

## What did you include in this commit?
- Added all baseline project starter files including `BuggyProgram.java`, the JUnit test suites (`Task1Test.java`, `Task2Test.java`, `Task3Test.java`), and `README.md`.

## What was the purpose of this commit?
- To establish a clean baseline of the unedited starter code in Git prior to making any debugging changes.

---

# Commit 2: Task 1 (getGrade)

## Which tests in Task1Test were failing before your fix?
- `testExceedsGrade`, `testMeetsGrade`, and boundary condition tests evaluating scores of 80 and 90.

## What was the issue in the code?
- The return strings were swapped (`score > 90` returned `"Meets"` instead of `"Exceeds"`, and `score > 80` returned `"Exceeds"` instead of `"Meets"`). Additionally, strict inequalities (`>`) were used instead of inclusive comparisons (`>=`), misclassifying boundary values like 80 and 90.

## What change did you make to fix it?
- Swapped the return strings so scores `>= 90` return `"Exceeds"` and scores `>= 80` return `"Meets"`, and updated the comparison operators from `>` to `>=`.

## How did the tests help guide your fix?
- The JUnit failure messages clearly pointed out the expected vs. actual output strings and revealed the exact boundary score where the logic failed.

---

# Commit 3: Task 2 (sumEvenNumbers)

## Which tests in Task2Test were failing before your fix?
- `testSumWithEvensAndOdds`, `testAllEvens`, and any test passing a non-empty array due to index out-of-bounds exceptions.

## What was the issue in the code?
- The accumulator variable `sum` was initialized to `1` instead of `0`, corrupting the total. Additionally, the loop condition used `i <= values.length` instead of `i < values.length`, triggering an `ArrayIndexOutOfBoundsException` on the final iteration.

## What change did you make to fix it?
- Reinitialized `sum = 0` and changed the loop continuation boundary to `i < values.length`.

## How did the tests help guide your fix?
- The test output provided the exact stack trace and line number for the `ArrayIndexOutOfBoundsException`, and showed an expected sum that was consistently 1 greater than the correct mathematical total.

---

# Commit 4: Task 3 (sumRange)

## Which tests in Task3Test were failing before your fix?
- Tests checking inclusive range addition (e.g., summing ranges like 1 to 5) and edge cases where start and end were equal.

## What was the issue in the code?
- The loop boundary condition excluded the final `end` value (using `< end` instead of `<= end`), and the accumulator initialization was incorrect.

## What change did you make to fix it?
- Set `sum = 0` and adjusted the loop to iterate through `for (int i = start; i <= end; i++)` to ensure both bounds are included.

## How did the tests help guide your fix?
- The assertions highlighted the off-by-one difference between the calculated sum and the expected sum across multiple range intervals.

---

# Overall Reflection

## Which task was the easiest to fix? Why?
- Task 1 (`getGrade`) was the easiest because the logic error was a straightforward inversion of string literals and a simple threshold adjustment that was immediately visible upon inspecting the nested `if`/`else` branches.

## Which task was the most difficult? Why?
- Task 2 (`sumEvenNumbers`) required more attention because it contained two distinct categories of bugs: a runtime exception caused by an off-by-one index loop condition, combined with an arithmetic state bug from initializing `sum` to 1.

## How did Git help you track your progress through the debugging process?
- Git isolated each bug fix into an independent, reviewable commit. If a fix broke an unrelated part of the class, the diff clearly highlighted exactly what changed since the previous passing commit.

## Why is it important to make small, frequent commits when debugging code?
- Small commits make it trivial to locate regression errors using `git log` or `git diff`. They also provide rollback checkpoints so you can revert a bad experiment without losing prior working solutions.

## What did you learn about using JUnit tests to guide debugging?
- JUnit tests eliminate guesswork by providing immediate feedback on edge conditions, off-by-one errors, and boundary values that are easily overlooked when manually reviewing code.

---

# Commit 5: Final Reflection

## What did you complete or update before making this final commit?
- Verified that all three JUnit test suites pass in IntelliJ, updated the repository URL and student name, and documented all reflections across the commit sections in `README.md`.

## Why is it useful to document your work after completing a programming task?
- Documenting the thought process reinforces why specific patterns failed, preserves technical context for collaborators, and creates an audit trail that makes code maintenance easier in the future.