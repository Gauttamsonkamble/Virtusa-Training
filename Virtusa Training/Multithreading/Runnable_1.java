import java.io.*;
import java.util.*;


class MultiThr implements Runnable
{  
    public void run()
    {  
        System.out.println("thread1 is running..."); 
        
        for(int i=0;i<=10;i++)
        {
            System.out.println("Thread1="+i);
        }
    }  
}

class Thr2 implements Runnable
{  
    public void run()
    {  
        System.out.println("thread2 is running...");  

        for(int i=10;i<=100;i+=10)
        {
            System.out.println("Thread2="+i);
        }
    }  
}



class Runnable_1
{
    public static void main(String args[])
    {  
        MultiThr m1=new MultiThr();  
        Thread t1 =new Thread(m1);  

        Thr2 m2 = new Thr2();
        Thread t2 = new Thread(m2);
        t2.start();
        t1.start();  
    }  
} 