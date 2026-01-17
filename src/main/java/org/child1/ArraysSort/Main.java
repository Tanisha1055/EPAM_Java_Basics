package org.child1.ArraysSort;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //primitives
        int[] arr={1,4,5,6,3};
        Arrays.sort(arr); //Asc by default
        System.out.println("Primitive array: "+Arrays.toString(arr));
        //primitives can't have custom sorting (as Comparator and all are def for collections)
        //Collection and all work on OBJ[] like String,Integer,Double,Custom Obj

        //strings
        String[] str={"Anagh","Aman","Aditya"};
        Arrays.sort(str, Collections.reverseOrder()); //for reverse order, Custom comparator passed
        System.out.println("String sorting:"+Arrays.toString(str));//toString to pretty print

        //for objects
        //Arrays.sort for anything that implements Comparable or Comparable interface
        Student[] stu=new Student[2];
        stu[0]=new Student("Anagh",98);
        stu[1]=new Student("Anish",99);
        //custom sorting with Comparable interface
        Arrays.sort(stu);
        System.out.println("Custom sort obj: "+Arrays.toString(stu));//asc
        Arrays.sort(stu,new CompareStu());
        System.out.println("Custom comparator obj: "+Arrays.toString(stu));//asc
    }
}
