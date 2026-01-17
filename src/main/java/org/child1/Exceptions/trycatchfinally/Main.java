package org.child1.Exceptions.trycatchfinally;

public class Main {
    public static void main(String[] args) {
        int[] a={1,2,3};
        try{
            System.out.println(a[5]);
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Not of the specified index");
        }finally {
            System.out.println("This is a finally block!");
        }
//        finally block is executed whether or not the exception is thrown or not

    }
}
