package org.child1.TrickyQuestions.Exceptions.Example3;

public class Main {
    public static void main(String[] args) {
        try {
            String s = null;
            s.length();
        } catch (Exception e) {
            System.out.println("Exception");
        } catch (NullPointerException e) {
            System.out.println("NPE");
        }

    }
}

//Answer:
//❌ Compile-time error

//👉 Why:
//Child exception must come before parent.

//Correct order:
//catch (NullPointerException e)
//catch (Exception e)
