package cn.pattern.validator3;

import java.text.DateFormat;

public class Testxxx {
	public static void main(String[] args) {
		//DateFormat.getInstance();
		/*ShaEncrypter sha = new ShaEncrypter();
		MemoryKeeper mk = new MemoryKeeper();
		Authenticator autho = new Authenticator(mk,sha);*/
		Authenticator authenticator = AuthenticatorFactory.createAuthenticator();
		
		
	}

}
