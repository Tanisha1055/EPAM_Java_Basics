package org.child1.TrickyQuestions.Strings.Example1;

public class Main {
    public static void main(String[] args) {
        String s = "hello";
        s.concat("world");
        System.out.println(s);

    }
}

//Answer:
//Output: hello

//👉 Why:
//String is immutable. New object created, old unchanged.
