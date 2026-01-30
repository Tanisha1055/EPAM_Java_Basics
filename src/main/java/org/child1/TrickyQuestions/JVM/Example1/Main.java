package org.child1.TrickyQuestions.JVM.Example1;

public class Main {
    public static void main(String[] args) {
        String s = "java";
        new Object();
        static int x;

    }
}


//Question:
//Where are these stored?

//Answer:

//Item	                             Memory

//"java"	                         String Constant Pool (Heap)
//new Object()	                     Heap
//static int x	                     Method Area (Metaspace)

//📌 Interview line:
//“Stack = reference, Heap = object.”