package cn.pattern.validator2;

import java.util.HashMap;
import java.util.Map;

/** 一个简单的验证类，数据放在内存，密码保持明文 */
class SimpleAuthenticator extends Authenticator {
	private Map<String, String> usrPwd = new HashMap<String, String>();

	@Override
	protected void store(String user, String encryptedPassword) {
		usrPwd.put(user, encryptedPassword);
	}

	@Override
	protected String retrieve(String user) {
		return usrPwd.get(user);
	}
}