package org.child1.Static.StaticMethods;

public class Class4 {
    static int a= initialisea();
    int b;
    static int initialisea()
    {
        return a=25;
    }
    static{
        System.out.println("This is a static block");
    }
    public Class4(int b){
        this.b=b;
    }
    void display(){
        System.out.println("a: "+a+" b: "+b);
    }
}
