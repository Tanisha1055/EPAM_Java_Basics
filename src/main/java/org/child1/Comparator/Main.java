package org.child1.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //        Comparator
        List<Student> students = new ArrayList<>();
        students.add(new Student("Bob", 35, 5000));
        students.add(new Student("Sam", 36, 4500));
        students.add(new Student("Amber", 38, 4000));
        Collections.sort(students, new StudentSortName());
        Collections.sort(students, new StudentSortAge());
        for (Student stu : students)
            System.out.println("Name order:" + stu.name);
        for (Student stud : students)
            System.out.println("Age order:" + stud.getAge());
    }

}
