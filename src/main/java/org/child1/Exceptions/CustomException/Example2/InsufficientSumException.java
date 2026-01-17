package org.child1.Exceptions.CustomException.Example2;

public class InsufficientSumException extends Exception{
    int amount;
    public InsufficientSumException(int amount){
        this.amount=amount;
    }
    public int getAmount()
    {
        return amount;
    }
}
