package cn.pattern.validator3;

public class Client {
	public static void main(String[] args) {
		Authenticator authenticator = AuthenticatorFactory
				.createAuthenticator();
		// 保存用户名和密码
		authenticator.save("username", "password");
		// 认证用户名和密码
		System.out.println(authenticator.authenticate("username", "password"));
	}
}
