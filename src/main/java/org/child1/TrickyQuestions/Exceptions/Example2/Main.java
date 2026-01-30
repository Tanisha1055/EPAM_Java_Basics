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