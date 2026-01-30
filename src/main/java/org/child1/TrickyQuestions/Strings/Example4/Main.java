package org.child1.TrickyQuestions.Strings.Example4;

public class Main {
    public static void main(String[] args) {
        String a = "ab";
        String b = "cd";

        String c = "ab" + "cd";
        String d = a + b;

    }
}

//Answer:
//false

//WHY:

//c → compile-time constant → pool
//d → runtime concat → heap
//If a and b are final?
//true

//Compiler folds it.

//Usage statistics
//Great question! Here’s why runtime concatenated strings are stored on the heap in Java:
//
//Why are runtime-concatenated strings stored on the heap?
//Compile-time constants (like "he" + "llo") are evaluated by the compiler before your program
//runs. The compiler knows the result and puts it in the String pool.
//Runtime concatenation (like a + b where a and b are variables) happens while your program is
//running. The JVM does not know the result until execution.
//When you concatenate strings at runtime, Java creates a new String object on the heap to hold
//the result.

//a and b are variables, so their values could change.
//The JVM must create a new String object to store the result of a + b.
//This new object is placed on the heap, not in the String pool.

//Why not pool it automatically?

//The String pool is for unique, immutable, compile-time constant strings.
//Pooling every runtime-created string would be inefficient and could lead to memory issues.

//If you want to add a runtime-created string to the pool, you must call .intern():

//String d = (a + b).intern(); // Now d is in the pool