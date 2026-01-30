package org.child1.TrickyQuestions.Strings.Example6;

public class Main {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = s1.intern();

    }
}

//Output:

//s1 == s2 → false
//s2 == "Java" → true


//WHY:

//intern() returns pooled reference