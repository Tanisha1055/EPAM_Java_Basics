package org.child1.TrickyQuestions.Exceptions.Example1;

public class Main {
    static int test() {
        int i = 0;
        try {
            i++;
            return i;
        } catch (Exception e) {
            return i++;
        } finally {
            return ++i;
        }
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}

//Answer:
//2

//Step-by-step:
//i = 0
//i++ → i = 1
//return i → but before returning, finally executes
//++i → i = 2 → returned
//📌 Interview line:
//“Finally always wins. If finally has return, it overrides try/catch.”
