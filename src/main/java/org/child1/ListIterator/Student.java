package org.child1.ListIterator;

public class Student implements Comparable<Student>{
    String name;
    int age;
    int sal;

    public Student(String name, int age, int sal) {
        this.name = name;
        this.age = age;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
    public int compareTo(Student other)
    {
        return this.sal-other.sal;
    }
}
