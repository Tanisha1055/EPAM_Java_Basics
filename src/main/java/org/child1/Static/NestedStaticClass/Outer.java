package org.child1.Static.NestedStaticClass;

public class Outer {
    static class Inner{
        public void display()
        {
            System.out.println("Non-static display!");
        }
        public static void staticmethod(){
            System.out.println("Nested static method!");
        }
    }
}
