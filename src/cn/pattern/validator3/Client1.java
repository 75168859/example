package cn.pattern.validator3;

public class Client1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Authenticator authenticator = AuthenticatorFactory.createAuthenticator();
		authenticator.save("hello","12334");
		authenticator.authenticate("xxx", "111");

	}
  
}
