package org.child1.Generics;

public class General<T> {
    private T data;
    public General(T data)
    {
        this.data=data;
    }
    public void setData( T data)
    {
        this.data=data;
    }
    public T getData()
    {
        return this.data;
    }

}
