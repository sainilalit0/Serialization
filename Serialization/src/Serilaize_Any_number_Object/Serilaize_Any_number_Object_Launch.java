package Serilaize_Any_number_Object;
import java.io.*;
public class Serilaize_Any_number_Object_Launch {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog d=new Dog();
		Cat c=new Cat();
		Rat r =new Rat();
		// serailization process 
		FileOutputStream fos=new FileOutputStream("num1.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		oos.writeObject(c);
		oos.writeObject(r);
		fos.close();
		oos.close();
		// deserialzation in same oder of object 
		FileInputStream fis=new FileInputStream("num1.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d1=(Dog)ois.readObject();
		System.out.println( " DOG "+d1.i +" ---"+d1.j);
		Cat c1=(Cat)ois.readObject();
		System.out.println( " Cat "+c1.i +" ---"+c1.j);
		Rat r1=(Rat)ois.readObject();
		System.out.println( " Rat "+r1.i +" ---"+r1.j);
		fis.close();
		ois.close();
		 
		
		
		
		
	}

}
