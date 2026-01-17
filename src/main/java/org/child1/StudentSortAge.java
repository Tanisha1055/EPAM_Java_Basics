package org.child1;

import java.util.Comparator;

public class StudentSortAge implements Comparator<Student> {
    public int compare(Student s1, Student s2)
    {
        return Integer.compare(s1.age,s2.age);
    }
}
