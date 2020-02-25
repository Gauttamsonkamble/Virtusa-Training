import java.io.*;
import java.util.*;

class Result
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String show(String name) throws Exception
    {
        // System.out.println("Enter String:");
        // String name = br.readLine();

        String name2= "";
        int len = name.length();

        for(int i=len-1; i>=0;i--)
        {
            name2 = name2 + name.charAt(i);
        }

       return name2;
       

    }

}

class ReverseStr2
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();

        Result r = new Result();

        System.out.println(r.show(name)) ;

        

    }
}