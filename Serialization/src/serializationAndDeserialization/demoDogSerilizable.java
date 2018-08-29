package serializationAndDeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class demoDogSerilizable  {
	public static void main(String[] args)throws Exception {
		Dog d1=new Dog();
		System.out.println(d1.i+ " ---"+d1.j);
		
		// serialization process
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.close();
		fos.close();
		
		// deserialization process 
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2=(Dog)ois.readObject();
		
		System.out.println(d2.i + "----"+d2.j);
		ois.close();
		fis.close();
	}

}
