package org.child1.TrickyQuestions.Strings.Example3;

public class Main {
    public static void main(String[] args) {
        String s = "abc";
        s = s + "def";
        System.out.println(s == "abcdef");

    }
}

//Answer:
//false

//WHY:

//"abc" + "def" at runtime
//New object created on heap
//"abcdef" literal is in string pool
//References differ

