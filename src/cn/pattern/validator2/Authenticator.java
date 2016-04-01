package cn.pattern.validator2;

/** һ��������֤�û������������ */
public abstract class Authenticator {
	/** �����û��������� */
	final public void save(String user, String password) {
		if (password == null)
			password = "";
		store(user, encrypt(password));
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
	protected abstract void store(String user, String encryptedPassword);

	/** ���û�����ȡ��Ӧ�ļ��ܹ������� */
	protected abstract String retrieve(String user);

	/** �����ĵ���one-way�����ܣ�Ĭ�ϲ����� */
	protected String encrypt(String text) {
		return text;
	}
}