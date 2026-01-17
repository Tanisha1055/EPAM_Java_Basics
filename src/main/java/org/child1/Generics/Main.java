package org.child1.Generics;

public class Main {
    public static void main(String[] args) {
        General<Integer> g=new General<>(10);
        System.out.println(g.getData());
    }
}
