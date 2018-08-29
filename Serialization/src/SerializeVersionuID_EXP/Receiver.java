package SerializeVersionuID_EXP;
import java.io.*;
public class Receiver {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		FileInputStream fis=new FileInputStream("ACC.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Account ac=(Account)ois.readObject();
		System.out.println(" USERNAME= "+ac.username+" PASSWORD= "+ac.pwd);
		fis.close();
		ois.close();
	}
	

}
