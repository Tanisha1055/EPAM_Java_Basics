package org.child1.Static.StaticBlock.Example2;

public class Class3 {
    static int a=10;
    static int b=20;
    static{
        System.out.println("a: "+a+" b: "+b);
        System.out.println("This is a static block");
        b=a*4;
    }
    void display(){
        System.out.println("a: "+a+" b: "+b);
    }

    //b needs to be static to be accessed by static block
    //you can't use this keyword with a variable and all, if it is static as it doesn't depend on obj
    //if multiple static blocks they are called in the order they are defined
}
