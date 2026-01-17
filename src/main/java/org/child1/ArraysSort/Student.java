package org.child1.ArraysSort;

public class Student implements Comparable<Student>{
    String name;
    int rank;

    public Student(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }
    public int compareTo(Student o)
    { return this.rank-o.rank;}

    public String toString() {
        return name+" "+rank;
    }
}
