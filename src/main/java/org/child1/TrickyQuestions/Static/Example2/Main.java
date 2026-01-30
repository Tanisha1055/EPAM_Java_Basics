package org.child1.TrickyQuestions.Static.Example2;

class A {
    static int x = 0;
    A() {
        x++;
    }
}

public class Main {
    public static void main(String[] args) {
        new A();
        new A();
        new A();
        System.out.println(A.x);
    }
}

//Answer:
//3

//👉 Interview line:
//“Static variables are shared across all objects.”
