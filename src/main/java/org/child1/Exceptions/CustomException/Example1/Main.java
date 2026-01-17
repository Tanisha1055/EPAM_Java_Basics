package org.child1.Exceptions.CustomException.Example1;

public class Main {
    public static void main(String[] args) {
       int age=16;
       try{
           if(age<18)
               throw new AgeException("Age is less than 18");
       }catch(AgeException e)
       {
           System.out.println(e.getMessage());
           System.out.println("age exception caught!");
       }
       finally{
           System.out.println("This is a finally block!");
       }
    }
}
