package org.child1.TrickyQuestions.Static.Example1;

public class Main {
    public static void main(String[] args) {
        class Test {
            static {
                System.out.println("Static block");
            }

            public static void main(String[] args) {
                System.out.println("Main");
            }
        }

    }
}

//Answer:
//Static block
//Main

//“Static blocks run when class is loaded.”