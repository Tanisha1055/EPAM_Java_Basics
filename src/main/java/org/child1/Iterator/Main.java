package org.child1.Iterator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //can be implemented by all collections(as they implement iterable interface)
        List<Student> students = new ArrayList<>();
        students.add(new Student("Bob", 35, 5000));
        students.add(new Student("Sam", 36, 4500));
        students.add(new Student("Amber", 38, 4000));
        Collections.sort(students);

//        because of this, the bug can arise a after removal,
//        the elements are shifted but indexed are normally accessed .
//        so some elements are not accessed and some twice.These bug is by Iterator,which keeps
//        the modcount variable,which tracks the state changes, hence is aware of the operations ,
//        and will print correctly , as points to the correct position. Gives rise to ConcurrentModificationException.
//        As the next elements modcount will be correct only .
//        So knows the correct element to point to .

//        for(int i=0;i<students.size();i++)
//            students.remove(i);

        for (Student stua : students)
            System.out.println("Salary order:" + stua.sal);
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student stu1 = it.next();
            System.out.println("Name:" + stu1.getName());
            System.out.println("Age:" + stu1.getAge());
            System.out.println("Sal:" + stu1.getSal());
        }
        //iterator already exhausted here , so made a new one here
        //it intially at -1 pos then points ahead
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
        //iterator can traverse in only single direction , i.e. forward .
    }
}
