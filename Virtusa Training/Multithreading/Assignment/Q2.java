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

        List even = new ArrayList<>();
        List odd = new ArrayList<>();
        for(int i=0;i<in;i++)
        {
             num= r.nextInt(in);
            // System.out.println("number="+num);
            if(num%2==0)
            {
                even.add(num);
            }
            else
            {
                odd.add(num);
            }
        }

        // System.out.println("number="+num);

        System.out.println("Even Number="+even);
        System.out.println("Odd Number="+odd);
    }
}

class Q2 
{
    public static void main(String args[])
    {
        Number n= new Number();
        n.start();
    }
}