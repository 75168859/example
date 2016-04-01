package cn.pattern.validator3;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//对象的创建也是
		//Authenticator authenticator = new Authenticator();
		/*
		 *要么使用对象
		 *要么创建对象   不应该兼而有之 
		 *
		 *引入创建型的模式
		 */
		/*authenticator.setKeeper(new MemoryKeeper());
		authenticator.setEncrypter(new ShaEncrypter());
		authenticator.save("aaa", "123");
		
		System.out.println("====================");
		authenticator.authenticate("aaa","123");*/
		//使用者和创建者分离
		//spring   IOC 依赖倒置、控制反转
	
		Authenticator authenticator = Factory.getInstance();
		authenticator.save("aaa", "123");
		System.out.println("================");
		authenticator.authenticate("aaa", "123");

	}
	

}

