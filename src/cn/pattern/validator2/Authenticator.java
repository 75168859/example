package cn.pattern.validator2;

/** 一个可以验证用户名和密码的类 */
public abstract class Authenticator {
	/** 保存用户名和密码 */
	final public void save(String user, String password) {
		if (password == null)
			password = "";
		store(user, encrypt(password));
	}

	/** 验证用户名和密码 */
	final public boolean authenticate(String user, String password) {
		String storedPassword = retrieve(user);
		if (storedPassword == null)
			return false; // 无此用户
		if (password == null)
			password = "";
		return storedPassword.equals(encrypt(password));
	}

	/** 保存用户名和加密过的密码 */
	protected abstract void store(String user, String encryptedPassword);

	/** 从用户名获取相应的加密过的密码 */
	protected abstract String retrieve(String user);

	/** 给明文单向（one-way）加密，默认不加密 */
	protected String encrypt(String text) {
		return text;
	}
}