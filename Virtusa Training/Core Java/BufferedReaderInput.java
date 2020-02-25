import java.io.*;
import java.util.*;





class BufferedReaderInput

{
    public static void main(String args[]) throws Exception
    {
         
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number");
        int n=Integer.parseInt(br.readLine());
        System.out.println("Enter Name");
        String name=br.readLine();

        System.out.println("Enter Double Number");
        Double d=Double.parseDouble(br.readLine());
       

        System.out.println(name);
        System.out.println(n);
        System.out.println(d);

      
       
    }

}