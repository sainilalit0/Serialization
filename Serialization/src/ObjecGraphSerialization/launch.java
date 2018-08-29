package ObjecGraphSerialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class launch {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog d=new Dog();
		FileOutputStream fos =new FileOutputStream("obj.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		fos.close();
		oos.close();
		FileInputStream fis=new FileInputStream("obj.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog  d2=(Dog)ois.readObject();
		
		System.out.println(d2.c.r.i);
		fis.close();
		ois.close();
	}

}
