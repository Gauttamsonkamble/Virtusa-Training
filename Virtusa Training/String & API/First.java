import java.io.*;
import java.util.*;

public class First
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter First String");
        String name = br.readLine();

        System.out.println("Student Name:"+name);
    }
}