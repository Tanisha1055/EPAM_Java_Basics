package org.child1.Exceptions.throwstatement;

public class Main {
    static void checkage(int age)
    {
        if(age<18)
            throw new ArithmeticException("Age is less!");
    }
//    static as method is inside a non-static and itself if non-static,
//    then you can't access inside static , as it depends on the obj, so make it static.
//    in java there is no concept of standalone function, only methods .

//    so throw is a statement written to explictly throw a exception when
//    certain conditions are met ,and I want to abruptly throw a
//    exception to stop the normal flow of prog and raise a exception
//    exceptions are obj so new keyword is used , as they are used to maintain the state of the obj
//    this one is run-time so it's if we don't provide it's handling implementation
//    if it was compile time we would have to provide it's implementation otherwise it won't run

    public static void main(String[] args) {
        checkage(15);
    }

}
