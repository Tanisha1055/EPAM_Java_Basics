package org.child1.Exceptions.throwskeyword;

public class main {
    static void getage(int age) throws IllegalArgumentException
    {
        if(age<18)
            throw new IllegalArgumentException("Age is below 18");
    }
//    so this throws keyword is used when a method
//    is throwing some exception, but is not catching it then and there only

//    as in compile time the compiler forces you to handle  that method,
//    otherwise won't compile as compiler error are like file not found ,
//    so while writing only I see no file and allowing it and to crash , doesn't make sense.

//    but the runtime one isn't forced as it violates only one condition
//    and if catch is not written then the prog terminates with exception stacktrace

//    so if I am not catching the exception then and there I will declare the blocks as throws ,
//    so as to indicate the calling function to handle it using a try catch block
    public static void main(String[] args) {
        try{
           getage(14);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("This is finally!");
        }
//        when the error is encountered in the try block ,
//        the rest of the code of the try block is executed and the controller searches for the matching catch block.
//        If found executes it and then the control moves to the finally block(compulsorly).

//        finally will be executed no matter what
//        if no matching is catch is found then handles by jvm's default handler

//        i.e. it will automatically print the exception type and the message ,
//        and which seq of message lead to this
    }
}
