package org.child1.Static.NestedStaticClass;

public class Main {
    public static void main(String[] args) {
         Outer.Inner obj=new Outer.Inner();
         obj.display();
         Outer.Inner.staticmethod();

         //so here I can access the inner static class without creating the instance of the outer static class
        // now to access the non-static method of the static class I need to create an
        // obj of the nested class it is inside as only then it can access it
        //so it is inside Outer.Inner and Inner is just like a method but a class to the outer class
        //as it is a class  so it's obj is needed to access it's data members and method
        //now as the inner calls is inside outer class, so can't exist independently ,(just like methods inside class)
        //so I need to access it using outer , and then now that I got the inner , I can do anything with it.

        //now static class doesn't necessarly have static method
        //they are created in the first place to group certain class properties for the outer class,
        // as they are gonna be used by just one class, so why create a separate class for it..
        //Like Car and Engine , and to achieve Encapsulation, as allowing only outer class to access it .
        //we made it static as we don't require an additional creation of outer class obj to access the inner class, waste of mem
        //it can have non-static and static methods just like normal class, as the rest of the logic
        // isw same as it doesn't exist independently , can be created by non-static class ,
        // so is fine to have non-static methods inside of it

        //outer class can't be static , as to call static we need respect to something ,
        // so if the outside class is itself static ,
        // then with respect to whom, or by referencing whom will be calling it
        //as there is a global thing and for that one property is
        // common for all it's type and that property is static that's how the idea of static came
        //like human, population is static
        //so if the class is static , then for whom it is common for?
        //(so it belongs to some outer thing)
        //if exists individually, then what common for everything calling it
        // we have final for that.

    }
}
