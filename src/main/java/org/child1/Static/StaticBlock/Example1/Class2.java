package org.child1.Static.StaticBlock.Example1;

public class Class2 {
    static int a=10;
    static int b;
    static{
        System.out.println("This is a static block");
        b=a*4;
    }
    void display(){
        System.out.println("a: "+a+" b: "+b);
    }
}
