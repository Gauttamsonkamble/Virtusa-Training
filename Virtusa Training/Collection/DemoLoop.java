import java.util.*;

class DemoLoop
{
    public static void main(String args[])
    {
        List<Integer> v= new ArrayList<>();

         v.add(1);
         v.add(2);
         v.add(3);

        //  System.out.println(v);

        //     ****1.Loop******

        v.forEach(System.out::println);
        

         //     ****2.Loop******

        // for(Object i:v)
        // {
        //     System.out.println(i);
        // }

         //     ****3.Loop******

        // Iterator i= v.iterator();

        // while(i.hasNext())
        // {
        //     System.out.println(i.next());
        // }


         //     ****4.Loop******

        //  for(int i:v)
        //  {
        //      System.out.println(i);
        //  }
    }
}