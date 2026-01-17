package org.child1.Static.StaticBlock.Example1;

public class Main {
    public static void main(String[] args) {
        Class2 c2=new Class2();
        c2.display();
        // so static block has access to static members
        // static block runs first after class is loaded , it is used for static variables initialisation
        // it is executed only once , at the start
        // just initialisation inside static block won't print it, we need to write sout for that, only that
        // portion is getting printed , but the order of intialsation is seen
        // hence the order of printing is understood

        //even before the constructor the static block is called, as constructor and all needs to be
        //invoked by normal code , but this static block initialsation happens automatically
        //at the start of the class loading , very first thing
        
        //Note:- An interview's question can be that we can printing something on the console without 
        // creating the main method , by the use of the static block , 
        // just create a normal method and write static block as soon as the class loads it will
        // print the static block, so yes printing is possible
    }
}
