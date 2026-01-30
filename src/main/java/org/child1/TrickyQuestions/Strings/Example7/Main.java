package org.child1.TrickyQuestions.Strings.Example7;

public class Main {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hel" + "lo";

    }
}

//Answer:
//true

//WHY:

//Compile-time constant folding

//What is Constant Folding?

//Constant folding is when the Java compiler evaluates constant expressions at compile time,
//rather than at runtime.
//If you write "Hel" + "lo", both parts are string literals (constants).
//The compiler combines them into a single constant "Hello" before your program runs.
//How does this affect String pooling?
//Since "Hel" + "lo" is resolved to "Hello" at compile time, both s1 and s2 refer to the same
// string literal in the String pool.
//In Java, string literals are automatically interned (pooled), so there is only one "Hello"
//object in memory.

//Example:

//String s1 = "Hello";
//String s2 = "Hel" + "lo"; // Compiler turns this into "Hello"
//System.out.println(s1 == s2); // true, both refer to the same pooled object