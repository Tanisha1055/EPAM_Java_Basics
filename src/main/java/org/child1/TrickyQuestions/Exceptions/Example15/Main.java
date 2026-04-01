package org.child1.TrickyQuestions.Exceptions.Example15;

public class Main {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
        } catch (Exception e) {
        } catch (ArithmeticException e) {
        }
    }
}

//Output:

//Compilation error

//Reason:

//Unreachable catch as the outer one is a boarder exception , so the inside one doesn't get executed
//so as it is unreachable from any end , so it throws a compilation error , as what is the need
//of writing this exception .