import java.io.*;
import java.util.*;

class Pldn
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Number");
        int num=0,rev=0,rem=0,temp=0;

        temp=num;

        while(num !=0)
        {
            rem=num % 10;
            rev = rev * 10 + rem;
            num /=10;

        }

        if (temp == rev)
        {
            System.out.println("Number is Palandrom="+temp);
        }
        else
            System.out.println("Number is not Palandrom="+temp);



    }
}
