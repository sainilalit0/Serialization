package Customized_serialization;
import java.io.*;
public class launch {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Account a=new Account();
		System.out.println(a.name+"----"+a.pwd);
		FileOutputStream fos=new FileOutputStream("cus.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a);
		fos.close();
		oos.close();	
		
		FileInputStream fis=new FileInputStream("cus.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Account a1=(Account)ois.readObject();
		System.out.println(a1.name+"----"+a1.pwd);
		fis.close();
		ois.close();
	}

}
