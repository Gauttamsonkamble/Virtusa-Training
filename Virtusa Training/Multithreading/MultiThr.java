class MultiThr implements Runnable{  
public void run()
{  
System.out.println("thread is running...");  
}  
  
public static void main(String args[]){  
MultiThr m1=new MultiThr();  
Thread t1 =new Thread(m1);  
t1.start();  
 }  
} 