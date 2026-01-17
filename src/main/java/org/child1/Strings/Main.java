package org.child1.Strings;

public class Main {
    public static void main(String[] args) {
        String s1="Atul";//string pool
        String s2=new String("Atul"); //heap
        System.out.println(s1==s2);//ref plus val
        System.out.println(s1.equals(s2));//only val

        //Manual interning
        //i.e. creating string obj using the constructor(new), but storing the ref in String Pool

        //this is need for optimisation
        //why create using constructor in the first place?
        //cuz in real life values get populated during runtime

        String s3=new String("Atul").intern();
        System.out.println(s1==s3);

        //unref string after the method call ends are from the mem by GC

        //mutable strings
        //it is non-synchronised, so not thread-safe , hence faster
        StringBuilder sb=new StringBuilder("Aman");
        sb.append("deep");
        System.out.println(sb);

        //mutable strings
        //it is synchronised, so thread-safe , hence slower
        StringBuffer sbuf=new StringBuffer("Anagh ");
        sbuf.append("Aditya");
        System.out.println(sbuf);

    }
}
