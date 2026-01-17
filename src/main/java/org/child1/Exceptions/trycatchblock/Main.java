package org.child1.Exceptions.trycatchblock;

public class Main {
    public static void main(String[] args) {
        int m=10;
        int n=0;
        try{
            int z=m/n;
            System.out.println("Divided");
        }catch (ArithmeticException e)
        {
            System.out.println("Arithmatic Exception");
        }
        // the try block throws this exception and the catch block catches it
    }
}
