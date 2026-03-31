package org.child1.TrickyQuestions.Exceptions.Example13;

public class Main {

    public static StringBuilder test() {
        StringBuilder sb = new StringBuilder("A");
        try {
            return sb;
        } finally {
            sb.append("B");
        }
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}


//Output:

//AB

//Reason:

//🔷 What happens in main()
//System.out.println(test());

//👉 This does:

//1.Calls test()
//2.Gets returned StringBuilder
//3.Calls toString() internally
//4.Prints "AB"

//🧠 Why different?

//👉 Because:

//(i)Object reference is returned
//(ii)Same object modified in finally

//🔷 Summary

//Type	                                               Behavior

//Primitive	                                           Value copied → no change
//Object	                                           Reference returned → changes visible

//🔷 Simple analogy

//👉 Primitive:
//You take a photo → later changes don’t matter

//👉 Object:
//You take a live video → changes are visible

//🔷 🔥 Final Interview Answer
//👉
//The return value is determined before the finally block executes. For primitive types, the
// value is copied, so changes in the finally block do not affect the returned result.

//🔷 One-line memory trick
//👉
//“Return stores value first, finally runs later”

//🔷 Your understanding
//“we return first and then append, so reference of earlier scenario is returning”
//👉 ✔ Direction is correct
//👉 ❗ Let’s refine it properly

//🔷 What actually happens

//StringBuilder sb = new StringBuilder("A");

//try {
//    return sb;
//} finally {
//    sb.append("B");
//}

//🔥 Step-by-step (VERY IMPORTANT)

//1️⃣ Object creation
//sb → [ "A" ]

//2️⃣ Return statement
//return sb;

//👉 JVM does:
//(i)✔ Saves reference to sb object
//(ii)❌ Does NOT copy object

//👉 Think:
//tempRef = sb;

//3️⃣ Finally executes

//sb.append("B");

//👉 Now object becomes:
//[ "AB" ]

//👉 And since:

//tempRef → same object

//✔ Change is visible

//4️⃣ Return happens

//👉 Returns:

//"AB"

//🔷 🔥 Key Insight
//👉
//Reference is returned, not a copy of the object

//🔷 Compare with primitive

//Primitive case
//int x = 10;
//return x;

//👉 JVM:

//temp = 10;

//✔ Copy stored
//❌ Later change doesn’t affect

//Object case
//return sb;

//👉 JVM:

//tempRef = reference of sb;

//(i)✔ Same object
//(ii)✔ Changes reflect

//🔷 Corrected version of your statement
//👉
//Yes, the reference is captured at return time, but since it points to the same object,
// any modification in the finally block is reflected in the returned result.

//🔷 🔥 Super Important Rule
//👉
//Primitive → value copied
//Object → reference copied

//🔷 Simple analogy
//Primitive → photocopy 📄
//Object → live link 🔗

//🔷 Final Interview Answer
//👉
//In the case of StringBuilder, the reference to the object is returned first. Since the same
// object is modified in the finally block, the changes are visible in the returned result.

//🔷 One-line memory trick
//👉
//“Objects return reference → changes reflect”

//🔷 Your Question
//After finally, the return statement gets returned — why?

//🔷 🔥 Key Rule (Most Important)
//👉
//Whenever a return is encountered, Java does NOT immediately exit the method.

//👉 Instead, it does:

//(i)   Save the return value
//(ii)  Execute finally block
//(iii) Then actually return

//🔷 Internal Working (VERY IMPORTANT)

//For this code:

//return x;

//👉 JVM internally behaves like:

//temp = x;       // Step 1: store return value
/// / execute finally  // Step 2
//return temp;    // Step 3: actual return

//🔷 Why does Java do this?

//👉 Because:

//✔ finally is meant for:

//1.cleanup (closing files, DB connections)
//2.critical operations

//👉 So Java guarantees:

//finally will always execute before method exits

//🔷 Step-by-step (your case)

//int x = 10;
//try {
//    return x;
//} finally {
//    x = 20;
//}

//Execution

//1️⃣ Return encountered
//return x;

//👉 JVM stores:
//temp = 10

//2️⃣ Finally runs
//x = 20;

//👉 But:

//temp is already 10 ❌ unchanged

//3️⃣ Return happens
//return temp; // 10


//🔷 🔥 Important Insight
//👉
//Return is split into two phases:

//Phase                                         	What happens:

//1	                                                Value/reference is saved
//2	                                                finally executes
//3	                                                saved value is returned