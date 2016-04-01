package cn.pattern.validator3;

public class Client {
	public static void main(String[] args) {
		Authenticator authenticator = AuthenticatorFactory
				.createAuthenticator();
		// �����û���������
		authenticator.save("username", "password");
		// ��֤�û���������
		System.out.println(authenticator.authenticate("username", "password"));
	}
}
