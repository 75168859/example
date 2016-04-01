package cn.pattern.validator3;

public class PlainEncrypter implements Encrypter {
	@Override
	public String encrypt(String plainText) {
		return plainText;
	}
}