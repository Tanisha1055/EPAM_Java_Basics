package org.child1.Exceptions.CustomException.Example2;

public class CalSufficientAmount {
    int amount ;
    int balance;
    public CalSufficientAmount(int amount, int balance)
    {
        this.amount=amount;
        this.balance=balance;
    }
    void deposit(int amount)
    {
        balance+=amount;
    }
    void withdraw(int amount) throws InsufficientSumException
    {
        if(balance>amount)
        {
            balance-=amount;
        }else{
            throw new InsufficientSumException(amount);
        }
    }

}
