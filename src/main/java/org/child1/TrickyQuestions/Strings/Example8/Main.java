package org.child1.TrickyQuestions.Strings.Example8;

public class Main {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("hello");

        System.out.println(sb1.equals(sb2));
    }
}


//Output:
//false

//Reason:
//StringBuilder do NOT override equals() method .
