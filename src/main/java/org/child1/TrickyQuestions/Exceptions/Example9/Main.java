package org.child1.TrickyQuestions.Exceptions.Example9;

public class Main{
    public static void main(String[] args) {
        while (true) {
            try {
                break;
            } finally {
                System.out.println("Finally");
            }
        }
    }
}

//Output:

//Finally

//Reason:
//(i) Finally always runs (except System.exit)
//(ii) Finally overrides everything (return & exception)
