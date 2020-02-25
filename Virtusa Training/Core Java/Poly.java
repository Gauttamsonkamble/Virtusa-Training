import java.io.*;
import java.util.*;

class student
{
        int roll_no;
        String name;
        float marks;

        public void show(int roll_no, String name)
        {
            System.out.println("Roll number="+roll_no+"\n Name="+name);

        }

        public void show(int roll_no, String name,float marks)
        {
            System.out.println("\n Roll number="+roll_no+"\n Name="+name+"\n Marks="+marks);

        }




}

class Lab extends student
{
        
       
        public void show(int roll_no, String name,float marks)
        {

            
            System.out.println("\n\n Roll number="+roll_no+"\n Name="+name+"\n Marks="+marks);

        }




}


class Poly
{
    public static void main(String args[])
    {

        student s = new student();


        s.show(1,"Gauttam");
        s.show(2,"Suraj",90);

        Lab l= new Lab();

        l.show(1,"Gauttam",100);



    }
}