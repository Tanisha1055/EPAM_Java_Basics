package org.child1.Static.StaticMethods;

public class Main {
    public static void main(String[] args) {
      Class4 c4=new Class4(50);
      c4.display();
    }
    //now static method can access static members,
    // so as the static variable gets initialised at the start of every class load
    //and as it is calling the static method, so the method gets called ,
    //so after intialisation the static block is called as a compulsion and the
    //display is called to print the variables, here in this case the static variables

//    The JVM executes the static method first, even before creating class objects.
//    So, static methods cannot access instance variables, as no object exists at that point.

    //Note:- static variables and staic block gets loaded when the class loads ,
    // so they are executed first but static method , gets invoked only when you call it
    //hence it get's executed later. Unless it is used for the initialsation of the static varibles,
    // ie called during assignment of static varibles.

    //inside the same class you can directly call the static method with any classname ,
    // as jvm knows that you are reffering to that class's static method ,
    // and as it doesn't depend on any obj , so you don't need to create obj instance .

}