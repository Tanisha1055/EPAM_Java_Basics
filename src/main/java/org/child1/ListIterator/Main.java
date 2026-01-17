package org.child1.ListIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Bob", 35, 5000));
        students.add(new Student("Sam", 36, 4500));
        students.add(new Student("Amber", 38, 4000));
        //ListIterator can traverse in both forward and backward direction,
        // and works only for list interfaces implementation classes
        ListIterator<Student> itls1 = students.listIterator();
//        while(itls1.hasNext())
//        {
//            Student temp=itls1.next();
//            System.out.println("Name:"+temp.getName());
//        }
//    }

        //moved to next position
        itls1.next();
        //now checks for prev and moves and prints prev
        if (itls1.hasPrevious())
            System.out.println("Previous name:" + itls1.previous().getName());
    }
}
