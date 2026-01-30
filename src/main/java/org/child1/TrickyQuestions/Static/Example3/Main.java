package org.child1.TrickyQuestions.Static.Example3;

class Main {
    static void m1() {
        System.out.println("static");
    }

    void m2() {
        System.out.println("non-static");
    }

    public static void main(String[] args) {
        Main t = null;
        t.m1();
        t.m2();
    }
}

//Answer:
//static
//NullPointerException

//👉 Why:
//Static call → resolved by class → works
//Instance call → null reference → NPE

//👉 Interview line:
//“Static methods don’t need object.”

