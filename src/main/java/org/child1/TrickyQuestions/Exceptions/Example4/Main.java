package org.child1.TrickyQuestions.Exceptions.Example4;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            int b = 10 / 0;
        } finally {
            System.out.println("finally");
        }

    }
}

//Answer:
//Exception in thread "main" java.lang.ArithmeticException
//finally

//that is the order

//“Even if catch throws exception, finally still executes.”