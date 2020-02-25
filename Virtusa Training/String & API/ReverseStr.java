import java.io.*;
import java.util.*;

class ReverseStr
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter String:");
        String name = br.readLine();

        String name2= "";
        int len = name.length();

        for(int i=len-1; i>=0;i--)
        {
            name2 = name2 + name.charAt(i);
        }

        System.out.println(name2);

    }
}