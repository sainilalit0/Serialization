package transient_Static_final_Serialization;
import java.io.*;
public class launchdog {
	public static void main(String[] args) throws IOException {
	 Dog d1=new Dog();
	 System.out.println(d1.i+"----"+d1.name);
	 
	 FileOutputStream fos=new FileOutputStream("dog.ser");
	 ObjectOutputStream oos=new ObjectOutputStream(fos);
	 oos.writeObject(d1);
	 
	 FileInputStream fis=new FileInputStream("dog.ser");
	 ObjectInputStream ois=new ObjectInputStream(fis);
	}

}
