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

        public void show()
        {
            System.out.println("Super Class");

        }

        System.out.println("\n");


       


}

class Lab extends student
{
        
       
        public void show(int roll_no, String name,float marks)
        {

            
            System.out.println("\n\n\n Roll number="+roll_no+"\n Name="+name+"\n Marks="+marks);

        }




}

class MCA extends student
{
        
       
        public void show(int roll_no, String name,float marks)
        {
            super.show();

            System.out.println("***MCA Class****");
            
            System.out.println("\n Roll number="+roll_no+"\n Name="+name+"\n Marks="+marks);

        }




}


class HybridInheritance
{
    public static void main(String args[])
    {

        MCA m = new MCA();

        System.out.println("*****Hybrid Inheritance*****");
        System.out.println("\n");

        m.show(1,"Gauttam",100);

        System.out.println("\n");
        m.show(2,"Akshay");


    }
}