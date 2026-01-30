package org.child1.TrickyQuestions.Exceptions.Example6;

public class Main {
    public static void main(String[] args) {
        //Case 3: You throw exception in finally of try-with-resources
        try (A a = new A()) {
            throw new RuntimeException("try");
        } finally {
            throw new RuntimeException("finally");
        }

    }
}

//👉 Now suppression is BYPASSED
//👉 finally exception wins
//
//⚠️ Never throw from finally
