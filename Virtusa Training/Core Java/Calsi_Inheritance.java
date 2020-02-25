import java.io.*;
import java.util.*;


class Cal
{
    int a,b,ans;

    
    public void add(int a,int b)
    {
        
        ans = a + b;

        System.out.println("Addition= "+ans);
    }

     public void sub(int a,int b)
    {
        
        ans = a - b;

        System.out.println("Substration= "+ans);
    }

     public void div(int a,int b)
    {
        
        ans = a / b;

        System.out.println("Division= "+ans);
    }


     public void mul(int a,int b)
    {
        
        ans = a * b;

        System.out.println("Multiplication= "+ans);
    }

    public void show()
    {
        System.out.println("Hello ");
    }

}


    public class Calsi_Inheritance 
    {
        public static void main (String args[]) throws Exception
        {
            Cal c = new Cal();
                int a,b,ans;

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

             System.out.println("Enter Number= ");
             a = Integer.parseInt(br.readLine());
             b = Integer.parseInt(br.readLine());

                c.add(a,b);
                c.sub(a,b);
                c.div(a,b);
                c.mul(a,b);
                c.show();
        }
    }


