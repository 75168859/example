package cn.pattern.validator3;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����Ĵ���Ҳ��
		//Authenticator authenticator = new Authenticator();
		/*
		 *Ҫôʹ�ö���
		 *Ҫô��������   ��Ӧ�ü����֮ 
		 *
		 *���봴���͵�ģʽ
		 */
		/*authenticator.setKeeper(new MemoryKeeper());
		authenticator.setEncrypter(new ShaEncrypter());
		authenticator.save("aaa", "123");
		
		System.out.println("====================");
		authenticator.authenticate("aaa","123");*/
		//ʹ���ߺʹ����߷���
		//spring   IOC �������á����Ʒ�ת
	
		Authenticator authenticator = Factory.getInstance();
		authenticator.save("aaa", "123");
		System.out.println("================");
		authenticator.authenticate("aaa", "123");

	}
	

}

