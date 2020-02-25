import java.io.*;
import java.util.*;

class Number extends Thread
{
    Scanner sc = new Scanner(System.in);
    Random r = new Random();

    public void run()
    {
        System.out.println("Enter the range of Random number");
        int in = sc.nextInt();
        // int num= r.nextInt(in);
        int num=0;

       Stack list = new Stack<>();
           for(int i=0;i<in;i++)
        {
             num= r.nextInt(in);
            // System.out.println("number="+num);
           list.push(num);
        }

        // System.out.println("number="+num);

        System.out.println("Numbers="+list);

        System.out.println("Enter Push Element:");
        int n1=sc.nextInt();

        System.out.println("Enter Pop Element");
        int n2=sc.nextInt();

        list.push(n1);
        list.remove(n2);

         System.out.println("Numbers="+list);
        
    }
}

class Q1 
{
    public static void main(String args[])
    {
        Number n= new Number();
        n.start();
    }
}