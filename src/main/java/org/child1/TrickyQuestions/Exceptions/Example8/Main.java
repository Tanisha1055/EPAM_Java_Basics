package org.child1.TrickyQuestions.Exceptions.Example8;

public class Main {
    public static void main(String[] args) {
        try (AutoCloseable r = () -> {
            throw new Exception("Close Exception");
        }) {
            throw new Exception("Try Exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


//Output:
//Try Exception

//Info:
//👉 Close exception is suppressed

//Reason:
//👉 Two exceptions occur:

//(i)Inside try block
//👉 "Try Exception"
//(ii)During resource closing (close())
//👉 "Close Exception"

//🔷 Now the BIG question

//👉 Why is "Close Exception" suppressed?

//🔥 Core Rule (VERY IMPORTANT)
//👉
//In try-with-resources, if both try block and close() throw exceptions:

//(i)✔ The exception from try block is primary
//(ii)✔ The exception from close() is suppressed

//🔷 Why Java designed it this way?

//👉 Because:

//(i) ✔ The main logic is in try
//That’s where actual work happens

//(ii) ✔ close() is cleanup
//Secondary operation

//👉 So Java says:
//“The real failure is from the try block, not cleanup”

//🔷 So internally

//Primary Exception → "Try Exception"
//Suppressed → "Close Exception"
