package org.child1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your age:");
//        int age=sc.nextInt();
//        System.out.println("Your age:"+age);
        String s = new String();
        StringBuilder st = new StringBuilder();
        HashMap<Integer, Integer> mp = new HashMap<>();
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
            System.out.println("Age order:" + stud.age);
//        Comparable
        //Collections.sort not Arrays.sort , as it is not array but arrayList
        Collections.sort(students);
        for (Student stua : students)
            System.out.println("Salary order:" + stua.sal);
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student stu1 = it.next();
            System.out.println("Name:" + stu1.getName());
            System.out.println("Age:" + stu1.getAge());
            System.out.println("Sal:" + stu1.getSal());
        }
        //iterqator already exhausted here , so made a new one here
        Iterator<Student> it2 = students.iterator();

        //so this .iterator() , creates a Iterator obj which ref to the student collection
        // and has a cursor , when done it.next returns a single Student object
        System.out.println("First name:" + it2.next().getName());

        //specify name , otherwise it will print object type
        System.out.println("Remaining:");

        //in that method , it expects a consumer interface ,
        // so the suppilied arg var,is of student type,
        // as it iterates over student by it2, and prints the name
        //as one is processed so works for the remaining ones
        it2.forEachRemaining((student) -> System.out.println(student.getName()));
        //iterator can traverse in only single direction , ie.e forward .

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