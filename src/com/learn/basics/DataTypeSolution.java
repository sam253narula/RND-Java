package com.learn.basics;

import java.util.*;
import java.io.*;



class DataTypeSolution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Range of Short -32,768 to 32,767
                if(x>=-32768 && x<=32768)System.out.println("* short");
                //Range of int - 2147483648 to 2147483647
                if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
                //Range of long -9223372036854775808 to 9223372036854775807
                if(x>=-9223372036854775808L && x<=9223372036854775807L)System.out.println("* long");
                
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



