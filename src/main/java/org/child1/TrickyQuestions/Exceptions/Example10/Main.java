package org.child1.TrickyQuestions.Exceptions.Example10;

public class Main {
    static {
        int x = 10 / 0;
    }

    public static void main(String[] args) {
        System.out.println("Hello");
    }
}


//Output:

//Exception in thread "main" java.lang.ExceptionInInitializerError


//Reason:
//🔷 What is this?

//static {
//    int x = 10 / 0;
//}

//👉 This is called a:

//✅ Static Block (Static Initializer Block)
//🔷 What is a Static Block?
//👉
//A static block is a block of code that runs:

//✔ When the class is loaded into memory
//✔ Before the main() method runs

//🔷 Execution Flow

//When you run:

//public class Test10 {

//👉 JVM does:

//(i)Loads the class
//(ii)Executes static block
//(iii)Then calls main()

//🔷 What happens in your code?
//static {
//    int x = 10 / 0;
//}

//👉 This line:

//10 / 0

//👉 Causes:
//ArithmeticException

//🔷 BUT actual output is:
//Exception in thread "main" java.lang.ExceptionInInitializerError

//🔷 Why not ArithmeticException directly?

//👉 Because:

//Exception occurred during class initialization
//JVM wraps it inside:
//✅ ExceptionInInitializerError

//🔷 Internal Flow

//(i)Static block runs
//(ii)10/0 → ArithmeticException
//(iii)JVM wraps it →

//ExceptionInInitializerError

//🔷 Important consequence

//public static void main(String[] args) {
//    System.out.println("Hello");
//}

//👉 ❌ This will NEVER run

//🔷 Why?

//👉 Because:

//(i)Class initialization failed
//(ii)JVM stops execution

//🔷 Real-life analogy

//👉 Think:
//(i)Static block = “setup phase”
//(ii)If setup fails → program never starts

//🔷 Important points

//✔ Static block runs only once
//✔ Runs before main()
//✔ Used for initialization
//✔ If exception occurs → program crashes

//🔷 🔥 Interview Answer
//👉
//This is a static block, which executes when the class is loaded. Since it contains a division
// by zero, it throws an ArithmeticException, which is wrapped by the JVM into an
// ExceptionInInitializerError. As a result, the main method is never executed.

//🔷 One-line memory trick
//👉
//Static block fails → program never starts