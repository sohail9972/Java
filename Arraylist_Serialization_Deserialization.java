import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist_Serialization_Deserialization {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("mahinder");
        list.add("late");
        list.add("learnt");
        list.add("camera");
        list.add("mobile");

        try {
            //Serialization where we can see the Data in Serialized form
            FileOutputStream fos = new FileOutputStream("file");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            fos.close();
            oos.close();

            //Deserilization

            FileInputStream fis= new FileInputStream("file");
            ObjectInputStream ois=new ObjectInputStream(fis);
            ArrayList list1 =(ArrayList)ois.readObject();
            System.out.println(list1);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
