package cn.pattern.validator3;


public class Authenticator {
	private KeyValueKeeper keeper;
	private Encrypter encrypter;
	
	//set方法注入值
    public void setKeeper(KeyValueKeeper keeper) {
		this.keeper = keeper;
	}
    public void setEncrypter(Encrypter encrypter) {
		this.encrypter = encrypter;
	}
    public Authenticator(){}
	public Authenticator(KeyValueKeeper keeper, Encrypter encrypter) {
		this.keeper = keeper;
		this.encrypter = encrypter;
	}

	public void save(String user, String password) {
		if (password == null)
			password = "";
		password = encrypter.encrypt(password);
		keeper.store(user, password);
	}

	public boolean authenticate(String user, String password) {
		String storedPassword = keeper.retrieve(user);
		if (storedPassword == null)
			return false;
		if (password == null)
			password = "";
		return storedPassword.equals(encrypter.encrypt(password));

	}
}

