package org.child1.Static.StaticVariables;

public class Main {
    public static void main(String[] args) {
        Class1 c1=new Class1(20,30);
        c1.display();
//        so a is a static variable, which depends on class ,
//        and gets intialised when the class  is loaded so a is initialised first
//        then the main block is run and the constructors have intialised b and c
//        and while printing , everything is getting printed again

    }
}
