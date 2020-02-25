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

       


}

class Lab extends student
{
        
       
        public void show(int roll_no, String name,float marks)
        {

            
            System.out.println("\n\n\n Roll number="+roll_no+"\n Name="+name+"\n Marks="+marks);

        }




}


class SingleLevelInheritance
{
    public static void main(String args[])
    {

        Lab l= new Lab();

        System.out.println("*****Single Level Inheritance*****");

        l.show(1,"Gauttam",100);
        l.show(2,"Akshay");


    }
}