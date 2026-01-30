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
