import java.util.*;
import java.io.*;

class Example1
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter How many Element You want:");
        int n= sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.println("Enter element");
        for(int i=0;i<n;i++)
        {
            int num=sc.nextInt();
            list.add(num);
        }

        Collection.sort(list);

        System.out.println("Elements are="+list);

       
    }
}