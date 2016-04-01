package cn.pattern.validator;

/** һ��������֤�û������������ */
public class Authenticator2 {
	int storetype = 1; // 1 FIle 2 DB 1�����浽File 2�������浽DB
	int encrypttype = 1; // 1 ��SHA 2MD5 1����SHA���ܷ�ʽ2������MD5����

	/** �����û��������� */
	final public void save(String user, String password) {
		if (password == null)
			password = "";
		// ���ݼ��ܵĲ�ͬ������,���м���
		if (encrypttype == 1) {
			password = encryptSHA(password);
		} else if(encrypttype == 2){
			password = encryptMD5(password);
		}
		// ���ֵ���ͬ��Ŀ�ĵ�
		if (storetype == 1) { // ���浽�ļ�ϵͳ
			storeFile(user, password);
		} else if(storetype==2){ // ���ֵ����ݿ�
			storeDB(user, password);
		}
	}

	private void storeDB(String user, String password) {
		// TODO Auto-generated method stub

	}

	private String encryptMD5(String password) {
		// TODO Auto-generated method stub
		return null;
	}

	private void storeFile(String user, String password) {

	}

	private String encryptSHA(String password) {
		// TODO Auto-generated method stub
		return "";
	}

	final public boolean authenticate(String user, String password) {
		return true;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
