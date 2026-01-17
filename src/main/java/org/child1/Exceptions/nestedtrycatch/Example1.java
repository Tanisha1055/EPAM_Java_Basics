package org.child1.Exceptions.nestedtrycatch;

public class Example1 {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
            System.out.println("Outer try:");
            int z=a/b;
            try{
                String str=null;
                System.out.println(str.length());
            }catch(NullPointerException e)
            {
                System.out.println("This is null pointer exception: "+e.getMessage());
            }
        }catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }

//    here as soon the exception encountered ,
//    it jumps to the matching catch block as a result the inner try catch is never executed
}
