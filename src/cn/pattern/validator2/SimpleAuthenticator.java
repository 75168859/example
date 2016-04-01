package cn.pattern.validator2;

import java.util.HashMap;
import java.util.Map;

/** һ���򵥵���֤�࣬���ݷ����ڴ棬���뱣������ */
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