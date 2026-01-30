package org.child1.TrickyQuestions.Strings.Example2;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hi");
        sb.append("Hello");
        System.out.println(sb);

    }
}

//Answer:
//Output: HiHello

//👉 Interview line:
//“StringBuilder is faster, StringBuffer is thread-safe.”