package Customized_serialization;

import java.io.Serializable;

public class Account implements Serializable {
	String name="lalit";
	transient String pwd="lalit1234";

}
