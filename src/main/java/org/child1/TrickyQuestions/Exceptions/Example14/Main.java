package org.child1.TrickyQuestions.Exceptions.Example14;

public class Main {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
        } catch (Exception e) {
            throw new RuntimeException("New Exception");
        }
    }
}


//Output:

//RuntimeException: New Exception

//Reason:

//🔷 Step-by-step execution:

//1️⃣ Try block runs
//int x = 10 / 0;

//👉 This throws:
//ArithmeticException

//2️⃣ Catch block executes
//catch (Exception e)

//👉 This catches:
//ArithmeticException (since it is a subclass of Exception)

//3️⃣ Inside catch
//throw new RuntimeException("New Exception");

//👉 Now:
//You are throwing a new exception
//This is completely different from the original one

//🔥 Key Point
//👉
//The original exception is caught and then replaced by a new exception

//🔷 What happens to the original exception?

//👉 It is:
//❌ Not rethrown
//❌ Not printed
//❌ Lost (unless you wrap it)

//🔷 Final outcome

//👉 JVM sees:
//RuntimeException: New Exception

//🔷 Why only RuntimeException is shown?

//Because:

//👉 After catching:

//catch (Exception e)

//👉 You explicitly say:

//throw new RuntimeException(...)

//👉 So JVM only sees the new exception

//🔷 Important concept
//👉
//Only the last thrown exception is propagated

//🔷 How to preserve original exception (VERY IMPORTANT 🔥)

//If you want both:
//throw new RuntimeException("New Exception", e);

//👉 Output:
//RuntimeException: New Exception
//Caused by: ArithmeticException: / by zero

//🔷 Simple analogy

//👉 Think:

//First problem: divide by zero

//You catch it and say:

//“Forget that, here’s a new problem”

//👉 So only new problem is reported

//🔷 🔥 Final Interview Answer
//👉
//The ArithmeticException is caught by the catch block, and a new RuntimeException is thrown.
// Since the original exception is not rethrown or wrapped, it is lost, and only the new
// RuntimeException is propagated.

//🔷 One-line memory trick
//👉
//“Catch → throw new → old exception gone”