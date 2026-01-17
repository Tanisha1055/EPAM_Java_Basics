package org.child1.Exceptions.CustomException.Example2;

public class Main {
    public static void main(String[] args) {
        CalSufficientAmount cs=new CalSufficientAmount(500,1000);
        try{
            cs.withdraw(1000);
        }catch(InsufficientSumException e){
            System.out.println("Insufficient amount by :"+e.getAmount());;
        }
    }

}
