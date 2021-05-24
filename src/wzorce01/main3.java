package wzorce01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class main3 {
    public static void main(String[] args) {
        try {
            ClassSingleton s1 = ClassSingleton.getInstance();
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.txt"));
            out.writeObject(s1);
            out.close();

            ObjectInput in = new ObjectInputStream(new FileInputStream("file.txt"));
            ClassSingleton s2 = (ClassSingleton) in.readObject();
            in.close();

            System.out.println(s1.hashCode());
            System.out.println(s2.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
