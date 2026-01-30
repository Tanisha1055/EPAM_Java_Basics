package org.child1.TrickyQuestions.Generics.Example1;

import java.util.ArrayList;
import java.util.List;

class Main {

    void show(List<String> list) {
        System.out.println("String list");
    }

    void show(List<Integer> list) {
        System.out.println("Integer list");
    }

    public static void main(String[] args) {
        Main t = new Main();
        List<String> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        t.show(l1);
        t.show(l2);
    }
}

//✅ CORRECT ANSWER:
//❌ This code will NOT compile.

//Output:
//Error:
//name clash: show(java.util.List<java.lang.String>)
//and show(java.util.List<java.lang.Integer>)
//have the same erasure

//💡 WHY? (This is the core concept)
//Because of TYPE ERASURE
//At runtime:
//List<String>  → List
//List<Integer> → List

//So both methods become:
//void show(List list)
//void show(List list)

//👉 Same method signature → clash → compile-time error

//🔥 INTERVIEW LINE (Use This)

//“Due to type erasure, generic type information is removed at runtime, so both methods have the
// same signature, causing a compile-time name clash.”