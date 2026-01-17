package org.child1.Static.StaticBlock.Example2;



public class Main {
    public static void main(String[] args) {
        Class3 c3=new Class3();
        c3.display();
        //so static block has access to static members
        //static block runs first after class is loaded
        //so the static variables are initalised first then this static block is run,
        //we have seen this by printing them in the static block first;
        // then the variables if we want to re-intislised them gets re-intialised
        //we can access then using the display method (as doesn't depend on obj, i.e. only class
        //gets initialised automatically at the class loading time
        //it is executed only once, at the start

        //static block is executed once so ,
        // static variables once initialised remains the same,
        // if doesn't gets reintialised

    }
}
