package org.child1.TrickyQuestions.Exceptions.Example2;

public class Main {
    static int test() {
        try {
            return 1;
        } finally {
            return 2;
        }
    }

    public static void main(String[] args) {

    }
}

//Answer:
//2
//“Finally overrides return from try or catch.”

//Step-by-step:
//try block runs, hits return 1; (Java prepares to return 1).
//Before returning, Java enters the finally block.
//finally block runs, hits return 2; (Java now prepares to return 2, overriding the previous
// return).
//The method returns 2.