package Customized_serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Launch1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Account1 a=new Account1();
		System.out.println(a.username+"----"+a.pwd);
		FileOutputStream fos=new FileOutputStream("cus.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a);
		fos.close();
		oos.close();	
		
		FileInputStream fis=new FileInputStream("cus.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Account1 a1=(Account1)ois.readObject();
		System.out.println(a1.username+"----"+a1.pwd);
		fis.close();
		ois.close();
	}

}
