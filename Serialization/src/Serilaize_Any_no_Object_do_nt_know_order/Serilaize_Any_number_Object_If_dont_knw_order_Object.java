package Serilaize_Any_no_Object_do_nt_know_order;
import java.io.*;


public class Serilaize_Any_number_Object_If_dont_knw_order_Object {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog d=new Dog();
		Cat c=new Cat();
		Rat r =new Rat();
		// serailization process 
		FileOutputStream fos=new FileOutputStream("num2.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		oos.writeObject(c);
		oos.writeObject(r);
		fos.close();
		oos.close();
		
		FileInputStream fis=new FileInputStream("num2.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object o=ois.readObject();
		if(o instanceof Dog)
		{
			Dog d1=(Dog)o;
			System.out.println(d1.i+"---"+d1.j);
			
			
		}
		else if(o instanceof Cat)
		{
			Cat c1=(Cat)o;
			System.out.println(c1.i+" ----"+c1.j);
		}
		else
		{
			Rat r1=(Rat)o;
			System.out.println(r1.i+" ----"+r1.j);
		}
		
		
		fis.close();
		ois.close();
		
		
	}
}
