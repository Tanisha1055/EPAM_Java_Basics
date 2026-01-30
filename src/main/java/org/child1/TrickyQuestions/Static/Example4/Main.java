package org.child1.TrickyQuestions.Static.Example4;

public class Main {
    public static void main(String[] args) {
        abstract class A {
            static {
                System.out.println("Static block");
            }
        }

    }
}

//WHEN does this run?

//Answer:
//When class A is loaded, not instantiated
//Triggered by:
//Referencing a static member

//Loading subclass
//📌 Key rule:
//Abstract ≠ unloaded. JVM doesn’t care if a class is abstract for static blocks.