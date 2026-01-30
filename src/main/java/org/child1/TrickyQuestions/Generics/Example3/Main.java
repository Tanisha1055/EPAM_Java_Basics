package org.child1.TrickyQuestions.Generics.Example3;

import java.util.ArrayList;
import java.util.List;

class Main {
    void show(List<Integer> list) {
        System.out.println("Integer list");
    }

    void show(ArrayList<Integer> list) {
        System.out.println("ArrayList Integer");
    }

    public static void main(String[] args) {
        Main t = new Main();
        List<Integer> list = new ArrayList<>();
        t.show(list);
    }
}

//Which method is called?
//Integer list

//Why:

//Overloading is resolved at compile time
//Reference type = List
//So show(List<Integer>) chosen