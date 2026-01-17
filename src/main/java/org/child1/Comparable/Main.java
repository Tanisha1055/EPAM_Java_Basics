package org.child1.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//if package ke andar package and 2 main exists , then get confused ki jaana kaha hai
public class Main {
    public static void main(String[] args) {
        //        Comparable
        //Collections.sort not Arrays.sort , as it is not array but arrayList
        List<Student> students = new ArrayList<>();
        students.add(new Student("Bob", 35, 5000));
        students.add(new Student("Sam", 36, 4500));
        students.add(new Student("Amber", 38, 4000));
        Collections.sort(students);
        for (Student stua : students)
            System.out.println("Salary order:" + stua.getSal());
    }
}
