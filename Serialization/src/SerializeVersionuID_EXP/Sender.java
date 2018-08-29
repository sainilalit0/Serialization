package SerializeVersionuID_EXP;
import java.io.*;
public class Sender {
	public static void main(String[] args) throws IOException {
		Account ac=new Account();
		System.out.println(" serialization time USERNAME = "+ac.username+" PASSWORD ="+ac.pwd);
		FileOutputStream fos=new FileOutputStream("ACC.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(ac);
		fos.close();
		oos.close();
		
	}

}
