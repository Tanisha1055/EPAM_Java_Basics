package org.child1.TrickyQuestions.Exceptions.Example12;

public class Main {
    public static int test() {
        int x = 10;
        try {
            return x;
        } finally {
            x = 20;
        }
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}

//Output:

//10


//Reason:

//🔷 Why? (Core Idea)
//👉
//Return value is decided BEFORE the finally block executes

//🔷 Step-by-step execution:

//1️⃣ Variable initialization
//int x = 10;


//2️⃣ Try block executes
//return x;

//👉 At this moment:

//(i)✔ x = 10
//(ii)✔ JVM stores return value = 10

//⚠️ Important point

//👉 Java does this internally:
//int temp = x; // temp = 10

//3️⃣ Finally block executes
//x = 20;

//👉 Now:
//x becomes 20 ❌ (but too late)

//4️⃣ Return happens
//return temp; // 10


//🔷 Key Insight
//👉
//Primitive values are copied at return time

//🔷 Why change doesn’t affect output?

//Because:
//✔ Return already captured value
//❌ Finally only changes local variable