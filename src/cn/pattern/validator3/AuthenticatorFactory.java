package cn.pattern.validator3;

import java.util.Properties;


public class AuthenticatorFactory {
	private static Properties prop = new Properties();
	static{
		try {
			prop.load(AuthenticatorFactory.class.getResourceAsStream("/env.properties"));
		} catch (Exception e) {
		   e.printStackTrace();
		}
	}
	
	public static Authenticator createAuthenticator() {
		KeyValueKeeper keeper = createKeyValueKeeper();
		Encrypter encrypter = createEncrypter();
		// KeyValueKeeper keeper = new MemoryKeeper();
		 //Encrypter encrypter = new ShaEncrypter();
		return new Authenticator(keeper, encrypter);
	}

	static Encrypter createEncrypter() {
	
		//return new ShaEncrypter();
		try {
			return (Encrypter) Class.forName(
					prop.getProperty("EncrypterFactory ")).newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} 
		
		

	}

	static KeyValueKeeper createKeyValueKeeper() {
		
		//return new MemoryKeeper();
	try {
			return (KeyValueKeeper)Class.forName(prop.getProperty("KeyValueKeeperFactory")).newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
}