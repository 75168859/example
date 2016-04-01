package cn.pattern.validator3;

import java.security.MessageDigest;

public class ShaEncrypter implements Encrypter {
	private static final String ALGORITHM = "SHA-1";
	private static final String CHARSET = "UTF-8";

	@Override
	public String encrypt(String plainText) {
		try {
			MessageDigest md = MessageDigest.getInstance(ALGORITHM);
			md.update(plainText.getBytes(CHARSET));
			byte digest[] = md.digest();
			
			return (new sun.misc.BASE64Encoder()).encode(digest);
		} catch (java.security.NoSuchAlgorithmException e) {
			throw new InternalError(e.getMessage());
		} catch (java.io.UnsupportedEncodingException e) {
			throw new InternalError(e.getMessage());
		}
	}
}