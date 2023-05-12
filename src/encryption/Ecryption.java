package encryption;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Ecryption {
	public static void main(String[] args) throws Exception {
		
		String str="abc@123";
		
		//we can convert ecrypted to decrypted and we cannot convert decrypted stage to encrypted
		MessageDigest instance = MessageDigest.getInstance("SHA-256");
		
		instance.reset();
		
		instance.update(str.getBytes());
		
		 byte[] digest = instance.digest(); // to convert unformate data
		
		System.out.println(digest);  //[B@7bb11784
		
		System.out.println(new String(digest));  // �{3Z��\��8h/���,ŗ�9���-B�
		
		String encodeToString = Base64.getEncoder().encodeToString(digest);
		
		System.out.println(encodeToString);//5YV7M1r981yoGhELyB84aC+KiYksxZf1OY3++C1CtRM=
		
		
		
		
	}

}
