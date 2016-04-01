package cn.pattern.abstractfactory;

public class Test {
	public static void main(String[] args) {
		//AbstractFactory abstractFactory = new AppleFactory();
		//���������Ĺ���������ͨ�������ļ�+������� 
		AbstractFactory abstractFactory = new SamsungFactory();
		Computer computer = abstractFactory.createComputer();
		Mobile mobile = abstractFactory.createMobile();
		computer.work();
		mobile.work();
	}

}
