package org.child1.TrickyQuestions.Generics.Example4;

import java.util.ArrayList;
import java.util.List;

class Main {
    void show(Object o) {
        System.out.println("Object");
    }

    void show(List<String> list) {
        System.out.println("List");
    }

    public static void main(String[] args) {
        Main t = new Main();
        t.show(new ArrayList<String>());
    }
}

//Answer:
//List

//Why:
//More specific method is chosen
//Even with erasure, compiler prefers most specific match
