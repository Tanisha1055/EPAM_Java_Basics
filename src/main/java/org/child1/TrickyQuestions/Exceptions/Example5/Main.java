package org.child1.TrickyQuestions.Exceptions.Example5;

public class Main {
    public static void main(String[] args) {
        Object o = "hello";
        Integer i = (Integer) o;

    }
}

//Answer:
//❌ Runtime Exception: ClassCastException

//👉 Interview line:
//“Compile time passes, runtime fails.”

//As in compile it sees that it is possible to cast it as object and for object to be casted as
//integer. Just one check that it is syntacially correct .
//At run time it sees that whether it is practically possible to do so , or whether it is correct
//whether it is correct class to be casted by (autoboxing and promotion level) .
