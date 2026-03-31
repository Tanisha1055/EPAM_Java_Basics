package org.child1.TrickyQuestions.Exceptions.Example11;

import java.io.IOException;

public class Main {
    void test() {
        throw new IOException();
    }
}

//Output:

//❌ Compilation Error

//🧠 Why?

//👉 Checked exception must be:

//(i)caught OR
//(ii)declared