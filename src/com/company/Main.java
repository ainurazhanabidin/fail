package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter=new FileWriter("alfavit.txt");
        fileWriter.write("""
                 A a
                 B b
                 C c
                 D d
                 I i
                 F f
                 J j
                 ...
                 1
                 2
                 3
                 4
                 ...
                                
                """);
        fileWriter.close();


        FileReader fileReader=new FileReader("alfavit.txt");
        Scanner scanner=new Scanner(fileReader);
        while (scanner.hasNextLine())
        {
            System.out.println(scanner.nextLine());
        }


    }

}
