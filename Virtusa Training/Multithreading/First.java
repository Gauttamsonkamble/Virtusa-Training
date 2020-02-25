import java.io.*;
import java.util.*;


class First1 extends Thread{  
    public void run()
    {  
    System.out.println("thread1 is running...");  
    for(int i=10;i<=100;i+=10)
    {
      System.out.println("\nThread1="+i);  
    }
    }  

}

class First2 extends Thread{  
    public void run()
    {  
    System.out.println("thread2 is running...");  

    for(int i=0;i<=10;i++)
    {
      System.out.println("\nThread2="+i);  
    }
    }  

}

class First
{

    public static void main(String args[])
    {  
    First1 t1=new First1();  
    First2 t2=new First2(); 
    t1.start(); 
    t2.start(); 
     }  
    
}