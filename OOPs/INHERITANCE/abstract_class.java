abstract class animal
{
    public abstract void sound();
}
class dog extends animal
{
    public void sound()
    {
        System.out.println("loyal animal");
    }
}
class lion extends animal
{
    public void sound()
    {
        System.out.println("king of the forest");
    }
}
public class abstract_class {
    public static void main(String[] args) {
        dog d= new dog();
        d.sound();
        lion l=new lion();
        l.sound();
    }
}