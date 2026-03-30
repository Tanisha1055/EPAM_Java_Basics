package org.child1.TrickyQuestions.Exceptions.Example7;

import java.io.IOException;

// Custom exception (child of IOException)
class MyException extends IOException {
    public MyException(String message) {
        super(message);
    }
}

// Parent class
class Parent {
    void read() throws IOException {
        System.out.println("Parent read");
    }
}

// Child class
class Child extends Parent {
    @Override
    void read() throws MyException {
        System.out.println("Child read");
        throw new MyException("Custom exception from Child");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Parent obj = new Child(); // polymorphism

        try {
            obj.read(); // calls Child's method
        } catch (IOException e) { // catching parent exception
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}


//Output:

//Child read
//Exception caught: Custom exception from Child

//Reason:

//🔷 Step-by-step execution

//1️⃣ Object creation (polymorphism)
//Parent obj = new Child();

//👉 Reference type: Parent
//👉 Actual object: Child

//2️⃣ Method call

//obj.read();

//👉 Due to method overriding, JVM calls:

//Child.read()

//3️⃣ Inside Child’s method

//System.out.println("Child read");
//throw new MyException("Custom exception from Child");

//👉 So first:
//Child read

//👉 Then exception is thrown:

//MyException

//4️⃣ Exception handling

//catch (IOException e)

//👉 Since:
//MyException IS-A IOException

//✔ It gets caught here

//5️⃣ Print statement

//System.out.println("Exception caught: " + e.getMessage());

//👉 Output:

//Exception caught: Custom exception from Child

//🔷 Final Flow Summary

//1.Child method runs
//2.Prints "Child read"
//3.Throws MyException
//4.Caught as IOException
//5.Prints message

//🔥 Key Concept Tested
//👉
//Runtime method → Child
//Compile-time exception handling → Parent

//🔷 One-line memory trick
//👉
//“Child executes, Parent handles”