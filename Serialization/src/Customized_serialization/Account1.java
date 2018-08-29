package Customized_serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account1 implements Serializable {
	String username="lalit";
	transient String pwd="lailtalwar";
	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();// meant for default serialization
		String EPwd="123"+pwd;
		oos.writeObject(EPwd);
	}
  private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException
  {
	  ois.readObject();// meant for deafault de serialization
	  String EPwd=(String)ois.readObject();
	  pwd=EPwd.substring(3);
  }
	

}
