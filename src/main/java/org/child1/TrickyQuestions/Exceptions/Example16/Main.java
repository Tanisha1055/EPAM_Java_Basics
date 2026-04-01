package org.child1.TrickyQuestions.Exceptions.Example16;

public class Main {
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