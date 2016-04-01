package cn.pattern.validator;

/** 一个可以验证用户名和密码的类 */
public class Authenticator2 {
	int storetype = 1; // 1 FIle 2 DB 1代表保存到File 2：代表保存到DB
	int encrypttype = 1; // 1 ：SHA 2MD5 1代表SHA加密方式2：代表MD5加密

	/** 保存用户名和密码 */
	final public void save(String user, String password) {
		if (password == null)
			password = "";
		// 根据加密的不同的类型,进行加密
		if (encrypttype == 1) {
			password = encryptSHA(password);
		} else if(encrypttype == 2){
			password = encryptMD5(password);
		}
		// 保持到不同的目的地
		if (storetype == 1) { // 保存到文件系统
			storeFile(user, password);
		} else if(storetype==2){ // 保持到数据库
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
