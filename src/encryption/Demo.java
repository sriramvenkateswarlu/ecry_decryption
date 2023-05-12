package encryption;

import java.util.Base64;
import java.util.Base64.Encoder;

public class Demo {
	public static void main(String[] args) {
		
		String str="abc@123";
		// encoding to decoding formate
		// to convert formal data to unformal data
		 Encoder encoder = Base64.getEncoder();
		 
		 byte[] encode = encoder.encode(str.getBytes());
		 
		 System.out.println(encode); //[B@5e91993f
		 
		 
		 System.out.println("=======");
		 
		 // to convert encrypted data to original stage
		 
		 byte[] decode = Base64.getDecoder().decode(encode);
		 
		
		 System.out.println(new String(decode));  //abc@123
		
		
	}

}
