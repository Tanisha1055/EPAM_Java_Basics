package org.child1.Exceptions.nestedtrycatch;

public class Example2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            System.out.println("Outer try:");
            try {
                int z = a / b;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("This is null pointer exception: " + e.getMessage());
        }
    }
}

// here seq flow it is matched and executed

// the jvm starts executing method and keep them in stack ,
// when a exception occurs , it checks the stack in backward direction,
// and when it finds the method having the handler , it executes it
// else if not found , executes the default jvm handler stack trace
