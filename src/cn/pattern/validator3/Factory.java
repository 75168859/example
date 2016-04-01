package cn.pattern.validator3;

public class Factory {
	public static Authenticator getInstance(){
		Authenticator a = new Authenticator();
		a.setKeeper(getKV());
		a.setEncrypter(getEnc());
		return a;
	}
	public static KeyValueKeeper getKV(){
		return new MemoryKeeper();
	}
	public static Encrypter getEnc(){
		return new PlainEncrypter();
	}

}
