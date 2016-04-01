package cn.pattern.validator;

import java.io.IOException;

/** һ��������֤�û������������ */
public class Authenticator {
	/** �����û��������� */
	final public void save(String user, String password) {
		if (password == null)
			password = "";
		password = encrypt(password);//����
		store(user, password);//�洢
	}
	/** ��֤�û��������� */
	final public boolean authenticate(String user, String password) {
		String storedPassword = retrieve(user);
		if (storedPassword == null)
			return false; // �޴��û�
		if (password == null)
			password = "";
		return storedPassword.equals(encrypt(password));
	}
	/** �����û����ͼ��ܹ������� */
	void store(String user, String encryptedPassword) {
		// �ô�ʵ��,�����û������ļ�ϵͳ������. ʡ��30 �д���
	}
	/** ���û�����ȡ��Ӧ�ļ��ܹ������� */
	String retrieve(String user) {
		// �ô�ʵ��,���ļ�ϵͳ��ȡ�û�����Ϣ��������Ϣ������. ʡ��30 �д���
		return "";
	}
	/** �����ĵ���one-way�����ܣ�Ĭ�ϲ����� */
	String encrypt(String text) {
		return text;
	}
	
}
