class x
{
    int i=10;
}
class y extends x{
    int i=20;
    void show()
    {
        System.out.println(i);
        System.out.println(super.i);
    }
}

public class super_keyword{
    public static void main(String[] args) {
       y a =new y();
       a.show();
    }
}