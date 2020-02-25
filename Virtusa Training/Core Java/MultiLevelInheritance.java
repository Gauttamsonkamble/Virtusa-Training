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


       


}

class Lab extends student
{
        
       
        public void show(int roll_no, String name,float marks)
        {

            
            System.out.println("\n\n\n Roll number="+roll_no+"\n Name="+name+"\n Marks="+marks);

        }




}

class MCA extends Lab
{
        
       
        public void show(int roll_no, String name,float marks)
        {
            super.show();

            System.out.println("***MCA Class****");
            
            System.out.println("\n Roll number="+roll_no+"\n Name="+name+"\n Marks="+marks);

        }




}


class MultiLevelInheritance
{
    public static void main(String args[])
    {

        MCA m = new MCA();

        System.out.println("*****MultiLevel Inheritance*****");

        m.show(1,"Gauttam",100);
        m.show(2,"Akshay");


    }
}