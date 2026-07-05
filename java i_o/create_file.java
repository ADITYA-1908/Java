import java.io.*;
public class create_file {
    public static void main(String[] args)
    throws IOException
    {
        File f=new File("C:\\Users\\DELL\\Desktop\\B.Tech\\sem 4\\OOPJ\\java code\\java i_o\\cf.txt ");
     
             if (f.createNewFile()) {
            System.out.println("file is created");
        } else {
            System.out.println("new file is there");
        }
       
    }
}