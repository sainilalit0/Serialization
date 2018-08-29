package test;
import java.io.*;
public class launch { 
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog d=new Dog();
		//System.out.println("Animal =>"+d.i+"--- Dog"+d.j);
		d.i=888;
		d.j=999;
		FileOutputStream fos=new FileOutputStream("ani1.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		fos.close();
		oos.close();
		System.out.println(" deserrialization start");
		FileInputStream fis=new FileInputStream("ani1.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d1=(Dog)ois.readObject();
		System.out.println("cat=>"+d1.i+"---- dog=>"+d1.j);
		fis.close();
		ois.close();
	}

}
