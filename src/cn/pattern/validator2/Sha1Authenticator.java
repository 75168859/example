package cn.pattern.validator2;

import java.security.MessageDigest;

/** һ����ȫ����֤�࣬���ݷ����ڴ棬���뾭��SHA-1 ���� */
public class Sha1Authenticator extends SimpleAuthenticator {
	// SHA-1 �㷨
	private static final String ALGORITHM = "SHA-1";
	// ��������ƽ̨
	private static final String CHARSET = "UTF-8";

	protected String encrypt(String plainText) {
		try {
			MessageDigest md = MessageDigest.getInstance(ALGORITHM);
			md.update(plainText.getBytes(CHARSET));
			byte digest[] = md.digest();
			// BASE64 �����ʮ�����Ʊ����ʡ�ռ�
			// Ϊ�������õ��˷Ǳ�׼��API��������´����о���
			return  (new sun.misc.BASE64Encoder()).encode(digest);
		} catch (java.security.NoSuchAlgorithmException e) {
			// �����ܷ���
			throw new InternalError(e.getMessage());
		} catch (java.io.UnsupportedEncodingException e) {
			throw new InternalError(e.getMessage());
			// �����ܷ���
		}
	}

}