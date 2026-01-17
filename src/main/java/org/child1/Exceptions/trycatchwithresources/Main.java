package org.child1.Exceptions.trycatchwithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try(FileReader fr=new FileReader("Adc.txt"))
        {
            char[] a=new char[50];
            fr.read(a); //reads the content to a
            for(char ch:a)
                System.out.println(ch);
        }catch(IOException e)
        {
            System.out.println("IOException caught");
            e.printStackTrace();
        }
    }
    //implements AutoClosable interface

}
