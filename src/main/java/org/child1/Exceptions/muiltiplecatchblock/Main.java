package org.child1.Exceptions.muiltiplecatchblock;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
            int z=a/b;
        }catch(IllegalArgumentException e)
        {
            System.out.println("Illegation Argument Exception");
        }catch(ArithmeticException e){
            System.out.println("Arithmatic Exception");
        }
        catch(NullPointerException e){
            System.out.println("Null pointer exception");
        }
    }
// closest match is executed
}
