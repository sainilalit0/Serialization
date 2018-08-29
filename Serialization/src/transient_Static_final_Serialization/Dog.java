package transient_Static_final_Serialization;

import java.io.Serializable;

public class Dog implements Serializable{
	transient int i=10;
	transient String name="gabbar";

}
