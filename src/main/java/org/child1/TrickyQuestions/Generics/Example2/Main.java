package org.child1.TrickyQuestions.Generics.Example2;

import java.util.List;

class Main {

    void show(List list) {
        System.out.println("Raw list");
    }

    void show(List<String> list) {
        System.out.println("String list");
    }
}

//Question:
//Will this compile?

//Answer:
//❌ NO – compile time error

//Because:
//List and List<String> have same erasure
//Both become List

//“This will not compile because of type erasure causing same method signature”

