package cn.pattern.validator;

import java.io.IOException;

/** 一个可以验证用户名和密码的类 */
public class Authenticator {
	/** 保存用户名和密码 */
	final public void save(String user, String password) {
		if (password == null)
			password = "";
		password = encrypt(password);//加密
		store(user, password);//存储
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
	void store(String user, String encryptedPassword) {
		// 该处实现,保持用户名在文件系统………. 省略30 行代码
	}
	/** 从用户名获取相应的加密过的密码 */
	String retrieve(String user) {
		// 该处实现,从文件系统获取用户名信息和密码信息………. 省略30 行代码
		return "";
	}
	/** 给明文单向（one-way）加密，默认不加密 */
	String encrypt(String text) {
		return text;
	}
	
}
