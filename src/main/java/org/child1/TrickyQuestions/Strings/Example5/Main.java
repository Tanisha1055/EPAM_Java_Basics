package org.child1.TrickyQuestions.Strings.Example5;

public class Main {
    public static void main(String[] args) {
        String s = null;
        System.out.println(s + "test");

    }
}

//Answer:
//nulltest


//WHY:

//+ uses String.valueOf(null)