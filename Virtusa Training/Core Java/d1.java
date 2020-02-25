import java.io.*;
import java.util.*;

class example
{
    public void show()
    {
        System.out.println("This is super class");
    }
    
}

class sem extends example
{
    
    public void push()
    {
        super.show();
        System.out.println("this is base class");
    }
}

class d1 extends sem
{
    public static void main(String args[])
    {
        sem s = new sem();
        s.push();
    }
}