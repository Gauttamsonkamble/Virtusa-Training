import java.io.*;
import java.util.*;

class Demo
{
    public  boolean show()
{
    Scanner sc=new Scanner(System.in);
    // int num=10;
    System.out.println("Enter number");
    int num=sc.nextInt();

    if(num>1)
    {
        return true;
    }
    else
        return false;
}

}

class ReturnKeyword
{
    
    public static void main(String args[])
    {
        // boolean b=show();
        Demo m=new Demo();

        System.out.println(m.show());
    }
}