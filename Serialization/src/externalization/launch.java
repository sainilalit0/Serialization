package externalization;

import java.io.*;

public class launch {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		externalization1 ext=new externalization1();
		System.out.println(ext.name+" "+ext.i+"  "+ext.j);
		FileOutputStream fos=new FileOutputStream("ext.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(ext);
		fos.close();
		oos.close();
		
		System.out.println(" deserrialization start");
		
		FileInputStream fis=new FileInputStream("ext.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		externalization1 ext1=(externalization1)ois.readObject();
		System.out.println("externalization=>"+ext1.name+" externalization "+ext1.j);
		
		fis.close();
		ois.close();
		
	}

}
