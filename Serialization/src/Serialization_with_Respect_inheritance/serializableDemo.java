package Serialization_with_Respect_inheritance;
import java.io.*;
public class serializableDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	Dog d=new Dog();
	System.out.println("animal=>"+d.i+" dog=>"+d.j);
	
	FileOutputStream fos =new FileOutputStream("animal.ser");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(d);
	fos.close();
	oos.close();
	FileInputStream fis=new FileInputStream("animal.ser");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Dog d1=(Dog)ois.readObject();
	System.out.println("animal=>"+d1.i+" dog=>"+d1.j);
	fis.close();
	ois.close();
	}

}
