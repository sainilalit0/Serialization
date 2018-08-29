package externalization;

import java.io.*;
public class externalization1 implements Externalizable{
	String name="lalit";
	int i=10;;
	int j=20;
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeObject(name);
		out.writeObject(j);
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		name=(String)in.readObject();
		j=(int) in.readObject();
	}
	
	
}
