package org.child1.Comparator;

import java.util.Comparator;


public class StudentSortName implements Comparator<Student> {
    public int compare(Student s1, Student s2)
    {return s1.name.compareTo(s2.name);}
}
