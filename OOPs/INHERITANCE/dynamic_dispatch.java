class iphone{
     void showTime(){
        System.out.println("Time is 8 am");
    }
     void on(){
        System.out.println("Turning on iphone.....");
    }
}
class ipad extends iphone{
     void music(){
        System.out.println("Playing music...");
    }
     void on(){
        System.out.println("Turning on ipad...");
    }
}
public class dynamic_dispatch{
    public static void main(String[] args) {
        iphone obj = new ipad(); // Yes it is allowed
        // ipad obj2 = new iphone(); // Not allowed
        obj.showTime();
        obj.on();
        // obj.music(); Not Allowed
    }
}
