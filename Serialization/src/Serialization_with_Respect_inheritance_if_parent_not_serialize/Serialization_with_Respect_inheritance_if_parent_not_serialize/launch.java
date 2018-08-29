package Serialization_with_Respect_inheritance_if_parent_not_serialize;
import java.io.*;
public class launch {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Dog d=new Dog();
		//System.out.println("Animal =>"+d.i+"--- Dog"+d.j);
		d.i=888;
		d.j=999;
		FileOutputStream fos=new FileOutputStream("ani.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		fos.close();
		oos.close();
		FileInputStream fis=new FileInputStream("ani.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d1=(Dog)ois.readObject();
		System.out.println("Animal=>"+d1.i+"---- dog=>"+d1.j);
				
	}
}
