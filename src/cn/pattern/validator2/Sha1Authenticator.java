package cn.pattern.validator2;

import java.security.MessageDigest;

/** 一个安全的验证类，数据放在内存，密码经过SHA-1 加密 */
public class Sha1Authenticator extends SimpleAuthenticator {
	// SHA-1 算法
	private static final String ALGORITHM = "SHA-1";
	// 避免依赖平台
	private static final String CHARSET = "UTF-8";

	protected String encrypt(String plainText) {
		try {
			MessageDigest md = MessageDigest.getInstance(ALGORITHM);
			md.update(plainText.getBytes(CHARSET));
			byte digest[] = md.digest();
			// BASE64 编码比十六进制编码节省空间
			// 为简便起见用到了非标准的API，因此以下代码有警告
			return  (new sun.misc.BASE64Encoder()).encode(digest);
		} catch (java.security.NoSuchAlgorithmException e) {
			// 不可能发生
			throw new InternalError(e.getMessage());
		} catch (java.io.UnsupportedEncodingException e) {
			throw new InternalError(e.getMessage());
			// 不可能发生
		}
	}

}