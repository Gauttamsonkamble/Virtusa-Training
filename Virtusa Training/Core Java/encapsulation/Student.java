package encapsulation;

public class Student
{
    private String name,div;

    public void set(String name,String div)
    {
        this.name= name;
        this.div= div;
    }

    public String getName()
    {
        return name; 
    }

    public String getDiv()
    {
        return div; 
    }
}