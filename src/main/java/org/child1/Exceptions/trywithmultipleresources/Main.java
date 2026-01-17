package org.child1.Exceptions.trywithmultipleresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //    multiple resources is possible
        try(FileReader fr=new FileReader("Adb.txt");
            BufferedReader br=new BufferedReader(fr))
                //here in the end no ';'
                //you can declare mutliple resources to work with ,
        // the resources are closed in reverse order of their declaration
        {
            throw new IOException();
        }catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}
