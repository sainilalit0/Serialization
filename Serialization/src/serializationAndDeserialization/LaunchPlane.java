package serializationAndDeserialization;
import  java.io.*;

public class LaunchPlane {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Plane p=new Plane();
		System.out.println(p.PlaneId+"---"+p.planeName);
		// serilization 
		FileOutputStream fos=new FileOutputStream("p.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(p);
		fos.close();
		oos.close();
		// deserailization 
		FileInputStream fis=new FileInputStream("p.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Plane p1=(Plane)ois.readObject();
		System.out.println(p1.PlaneId+"----"+p1.planeName);
		 fis.close();
		 ois.close();
	}

}
